# Broken shading

Shading seems to be broken with Scala 2.12.8 when using the latest sbt-assembly version and using symbols. A git blame leads me to this commit as the culprit https://github.com/scala/scala/commit/3edeaac047c78ab4f28bff100aa408ba775bd629

Running the project manually will work just fine, but if the Scala class files are moved using shade rules, and the Scala version is 2.12.8, then shading breaks.