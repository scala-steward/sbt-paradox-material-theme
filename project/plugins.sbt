addSbtPlugin(("com.lightbend.paradox" % "sbt-paradox"        % "0.9.2").exclude("com.typesafe.sbt", "sbt-web"))
addSbtPlugin(("com.lightbend.paradox" % "sbt-paradox-theme"  % "0.9.2").exclude("com.typesafe.sbt", "sbt-web"))
addSbtPlugin("com.github.sbt"         % "sbt-web"            % "1.5.8")
addSbtPlugin(("com.github.sbt"        % "sbt-site-paradox"   % "1.7.0").exclude("com.lightbend.paradox", "sbt-paradox"))
addSbtPlugin("com.github.sbt"         % "sbt-ghpages"        % "0.8.0")
addSbtPlugin("com.github.sbt"         % "sbt-ci-release"     % "1.11.1")
addSbtPlugin("org.scalameta"          % "sbt-scalafmt"       % "2.5.5")
addSbtPlugin("com.github.sbt"         % "sbt-github-actions" % "0.25.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

// This project is its own plugin :)
Compile / unmanagedSourceDirectories += baseDirectory.value.getParentFile / "plugin" / "src" / "main" / "scala"
libraryDependencies += "org.jsoup" % "jsoup"      % "1.21.1"
libraryDependencies += "io.circe" %% "circe-core" % "0.14.13"
