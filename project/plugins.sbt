logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.2.0")

addSbtPlugin("com.jamesward" %% "play-auto-refresh" % "0.0.10")

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.0.2")


