FROM ubuntu:latest
WORKDIR /java
ADD . /java
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV MAVEN_HOME=/usr/share/maven
ENV PATH=${MAVEN_HOME}/bin:${PATH}
ENV TZ=America/Sao_Paulo
RUN apt-get update && apt-get install -y openjdk-17-jdk maven
RUN mvn clean package -Dskiptests
CMD ["java", "-jar", "target/pagamentos-1.0.0.jar"]