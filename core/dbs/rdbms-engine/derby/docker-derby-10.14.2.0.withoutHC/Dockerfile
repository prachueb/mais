# Usage of "Comment" ref to "https://docs.docker.com/engine/reference/builder/#format"
# Usage of "FROM" and "ARG" ref to "https://docs.docker.com/engine/reference/builder/#understand-how-arg-and-from-interact"
ARG  CODE_VERSION=8u171-jre-alpine3.8

# Base image comes from "https://hub.docker.com/_/openjdk/"
FROM openjdk:${CODE_VERSION}

# Usage of "LABEL" ref to "https://docs.docker.com/engine/reference/builder/#label"
LABEL maintainer="integrityknight@gmail.com"
LABEL DockerTutorial="https://javatoybox.blogspot.com/2018/10/docker-eclipse-docker-image.html"

# Usage of "ENV" ref to "https://docs.docker.com/engine/reference/builder/#environment-replacement"
# Please check the derby version on "https://dist.apache.org/repos/dist/release/db/derby/"
ENV DERBY_VERSION=10.14.2.0
ENV DERBY_HOME=/derby
ENV DERBY_LIB=${DERBY_HOME}/lib
ENV CLASSPATH=${DERBY_LIB}/derby.jar:${DERBY_LIB}/derbynet.jar:${DERBY_LIB}/derbytools.jar:${DERBY_LIB}/derbyoptionaltools.jar:${DERBY_LIB}/derbyclient.jar

# Usage of "RUN" and '\" ref to "https://docs.docker.com/engine/reference/builder/#run
RUN \
	mkdir -p /Database && \
	apk update && \
    apk add --update openssl && \
    wget https://dist.apache.org/repos/dist/release/db/derby/db-derby-${DERBY_VERSION}/db-derby-${DERBY_VERSION}-bin.tar.gz && \
    tar xzf /db-derby-${DERBY_VERSION}-bin.tar.gz && \
    mv /db-derby-${DERBY_VERSION}-bin /derby && \
    rm -Rf /*.tar.gz ${DERBY_HOME}/demo ${DERBY_HOME}/javadoc ${DERBY_HOME}/docs ${DERBY_HOME}/test ${DERBY_HOME}/*.html ${DERBY_HOME}/KEYS && \
    apk del openssl
    
# Usage of "COPY" ref to "https://docs.docker.com/engine/reference/builder/#copy"
COPY ./Database/ /Database/

# Usage of "WORKDIR" ref to "https://docs.docker.com/engine/reference/builder/#workdir"
WORKDIR /Database

# Usage of "VOLUME" ref to "https://docs.docker.com/engine/reference/builder/#volume"
VOLUME ["/Database"]

# Usage of "ENV" ref to "https://docs.docker.com/engine/reference/builder/#expose"
EXPOSE 1527

# Usage of "CMD" ref to "https://docs.docker.com/engine/reference/builder/#cmd"
# See reference "https://db.apache.org/derby/docs/10.14/adminguide/tadmincbdjhhfd.html"
CMD ["java", "org.apache.derby.drda.NetworkServerControl", "start", "-h", "0.0.0.0"]
