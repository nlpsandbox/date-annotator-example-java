FROM python:3.9.4-slim-buster

ENV APP_DIR=/opt/app
ENV APP_VERSION="1.0.2"

SHELL ["/bin/bash", "-euxo", "pipefail", "-c"]

# jre installation require man folder to exist on the server
RUN mkdir -p /usr/share/man/man1

# hadolint ignore=DL3008
RUN apt-get update -qq -y \
    && apt-get install --no-install-recommends -qq -y \
        gosu \
        default-jre \
        maven \
    && apt-get -y autoclean \
    && apt-get -y autoremove \
    && rm -rf /var/lib/apt/lists/*

WORKDIR ${APP_DIR}
COPY src src/
COPY pom.xml ./
RUN mvn package \
    && mv target/openapi-spring-${APP_VERSION}.jar target/app.jar

WORKDIR /
COPY docker-entrypoint.sh .
RUN chmod +x docker-entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/docker-entrypoint.sh"]

CMD ["java", "-jar", "target/app.jar"]