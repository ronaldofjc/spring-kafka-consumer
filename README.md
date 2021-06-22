## Sample Kafka Consumer
This project presents a way to use Kafka as a message consumer with Spring Boot

Technologies used: Java, Spring Boot, Maven, Lombok, Kafka

Producer project: ([Link](https://github.com/ronaldofjc/spring-kafka-producer))


## Pre-Requires

- JDK 11
- Maven 3
- Docker

## Kafka on Docker
- Use docker-compose of project spring-kafka-producer


## Swagger
- The generated swagger html page is available in the following address
```
    http://localhost:8081/swagger-ui.html
```

## Application Commands

- Compile project
```shell script
  mvn compile
```

- Clear target directory
```shell script
  mvn clean
```

- Start project
```shell script
  mvn spring-boot:run
```

- Install packages
```shell script
  mvn install
```