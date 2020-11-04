# NLP Sandbox Date Annotator Example

[![Docker Pulls](https://img.shields.io/docker/pulls/nlpsandbox/date-annotator-example-java.svg?color=94398d&labelColor=555555&logoColor=ffffff&style=for-the-badge&label=pulls&logo=docker)](https://hub.docker.com/r/nlpsandbox/date-annotator-example-java)
[![GitHub Release](https://img.shields.io/github/release/nlpsandbox/date-annotator-example-java.svg?include_prereleases&color=94398d&labelColor=555555&logoColor=ffffff&style=for-the-badge&logo=github)](https://github.com/nlpsandbox/date-annotator-example-java/releases)
[![GitHub CI](https://img.shields.io/github/workflow/status/nlpsandbox/date-annotator-example-java/ci.svg?color=94398d&labelColor=555555&logoColor=ffffff&style=for-the-badge&logo=github)](https://github.com/nlpsandbox/date-annotator-example-java)
[![GitHub License](https://img.shields.io/github/license/nlpsandbox/date-annotator-example-java.svg?color=94398d&labelColor=555555&logoColor=ffffff&style=for-the-badge&logo=github)](https://github.com/nlpsandbox/date-annotator-example-java)

An example implementation of the [NLP Sandbox Date Annotator] using Java Spring

## Specification

- Annotates date strings in clinical notes using simple regular expressions
- Implements the [NLP Sandbox Date Annotator OpenAPI specification]

## Usage

### Running with Docker

The command below starts the Date Annotator locally.

    docker-compose up

### Running with Maven

Build and start the Date Annotator.

    cd server/
    mvn package
    java -jar target/openapi-spring-0.1.6.jar

## Interactive documentation

When running, the Date Annotator provides a web interface (<http://localhost:8080>)
that you can use to explore the input, output and actions available.
