A baseline project for Apache Camel and Spring Boot
===============
Spring Boot and Apache Camel are two great projects.

Spring Boot brings simple externalized configuration, smart packaging as executable fat-jars and great dependency management with the
starter-poms.

Apache Camel is a integration framework and general toolbox. Together with RabbitMQ it forms a stable integration platform.


Purpose
===========
Having a quick baseline to create integration services using Apache Camel. The Camel application will be bundled and executed as a standalone Java application. No application server is needed.

Running the application.
===========
The test project contains one simple Camel route that output a log statement every few seconds.

  1. Checkout project
  1. mvn package
  1. java -jar target/camelboot-1.0.jar
  1. ctrl-c to stop.


