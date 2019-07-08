name := "ShadeTest"

version := "0.1"

scalaVersion := "2.12.8"

assemblyShadeRules in assembly := Seq(
  ShadeRule.rename("scala.**" -> "shadetest.shade.scala.@1").inAll,
)
