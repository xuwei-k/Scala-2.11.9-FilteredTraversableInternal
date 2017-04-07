val a = project.settings(
  scalaVersion := "2.11.10"
)

val b = project.settings(
  scalaVersion := "2.11.8"
).dependsOn(
  a
)
