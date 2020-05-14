name := "dfdl-xview-labels"
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
  "org.apache.daffodil" %% "daffodil-sapi" % "latest.integration",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "2.6.0" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test

)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
crossPaths := false

enablePlugins(GitVersioning)
