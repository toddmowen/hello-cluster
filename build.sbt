uniform.project("hello-cluster", "")

val thermometerVersion = "1.4.3-20160617114144-562e6e0"

libraryDependencies ++=
  depend.hadoopClasspath ++
  depend.scalding() ++
  depend.omnia("thermometer", thermometerVersion, "test")
