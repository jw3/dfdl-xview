name := "dfdl-xview"
organization := "com.ctc"
scalaVersion := "2.12.11"
git.useGitDescribe := true

scalacOptions ++= Seq(
  "-encoding",
  "UTF-8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-Ywarn-unused-import",
  "-Xfatal-warnings",
  "-Xlint:_"
)

libraryDependencies := Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.6.0" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
crossPaths := false

enablePlugins(GitVersioning)
