import com.twitter.scalding.TypedPipe

object HelloCluster {
  val fragments = List("Hello", " ", "Cluster", "!")

  def pipe = TypedPipe.from(fragments).groupAll.reduce(_ ++ _).values
}
