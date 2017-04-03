resolvers in ThisBuild += "scala-ci" at "https://scala-ci.typesafe.com/artifactory/scala-integration/"

val a = project.settings(
  scalaVersion := "2.12.2-bin-6048c66"
)

val b = project.settings(
  scalaVersion := "2.12.1"
).dependsOn(
  a
)
