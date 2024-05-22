FROM eclipse-temurin:21-alpine
RUN mkdir /opt/app
ADD target/SpringBootAuth-0.0.1-SNAPSHOT.jar /opt/app/app.jar
ENV LOKI_URL=${LOKI_URL}
ENV name=${APP_NAME}
ENTRYPOINT ["sh", "-c", "java -DLOKI_URL=${LOKI_URL} -Dname=${name} -jar /opt/app/app.jar"]