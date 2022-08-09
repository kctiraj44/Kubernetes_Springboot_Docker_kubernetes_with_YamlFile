FROM openjdk:8

EXPOSE 8080

ADD target/springboot-application-using-yamlfile.jar springboot-application-using-yamlfile.jar

ENTRYPOINT ["java","-jar","/springboot-application-using-yamlfile.jar"]