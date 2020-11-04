FROM python:3.8.5-slim-buster

ENV PIP_NO_CACHE_DIR=off
ENV APP_DIR=/opt/app
ENV APP_VERSION="0.1.6"

# Safer bash scripts with 'set -euxo pipefail'
SHELL ["/bin/bash", "-euxo", "pipefail", "-c"]

# jre installation require man folder to exist on the server
RUN mkdir -p /usr/share/man/man1

# Install dependencies
# hadolint ignore=DL3008
RUN apt-get update -qq -y \
    && apt-get install --no-install-recommends -qq -y \
        build-essential \
        gosu \
        libpcre3 \
        libpcre3-dev \
        # Java
        default-jre \
        maven \
    && apt-get -y autoclean \
    && apt-get -y autoremove \
    && rm -rf /var/lib/apt/lists/*

# Copy server files
COPY src ${APP_DIR}/src
COPY requirements.txt pom.xml app.ini ${APP_DIR}/
COPY docker-entrypoint.sh /
RUN chmod +x /docker-entrypoint.sh

# Install dependencies
RUN pip install -r ${APP_DIR}/requirements.txt

# Build app
WORKDIR ${APP_DIR}
RUN mvn package \
    && mv target/openapi-spring-${APP_VERSION}.jar target/app.jar

# Expose the port used by the application
EXPOSE 8080

# Set the entrypoint script and the default command run by the container
ENTRYPOINT ["java", "-jar", "target/app.jar"]
# ENTRYPOINT ["/docker-entrypoint.sh"]
# CMD ["uwsgi", "--ini", "app.ini", "--http-socket", ":8080"]