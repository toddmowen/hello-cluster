import au.com.cba.omnia.thermometer.core.ThermometerSpec

class HelloClusterSpec extends ThermometerSpec { def is = s2"""
  HelloCluster should return greeting  $hello
"""

  def hello = {
    runsSuccessfully(HelloCluster.pipe) must_== Seq("Hello Cluster!")
  }
}
