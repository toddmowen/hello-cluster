import com.twitter.scalding.{TypedPipe, Execution, ExecutionJob, Args}

// The execution is defined in a companion object for ease of testing
object HelloCluster {
  val fragments = List("Hello", " ", "Cluster", "!")

  def pipe = TypedPipe.from(fragments).groupAll.reduce(_ ++ _).values

  def execution = for {
    lines <- pipe.toIterableExecution
    _     <- Execution.from(lines.foreach(println))
  } yield lines
}

class HelloCluster(args: Args) extends ExecutionJob[Iterable[String]](args) {
  def execution = HelloCluster.execution
}
