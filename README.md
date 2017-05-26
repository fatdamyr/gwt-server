# Great Western Trail Server
Provides a REST api for playing the Great Wester Trail board game

## Setup
1. Build the  app
```bash
./gradlew build
```
2. Start the application
```bash
docker-compose up --build
```

## Service Versioning
Different versions will be implemented using the Adapter Based versioning strategy. In this strategy a single build of the application is responsible for providing all versions of the API protocol that are still supported. The latest version model object is “adapted” to the older version JSON formats by wrapping it in a wrapper object.

Clients are required to specify the version of the service they want to use. The version is specified by setting the ‘Accept’ and 'Content-Type' header values to the version number the client is requesting/sending. If the client does not specify a version, the service will return a 415 response. Clients should ignore any unrecognized JSON attributes when parsing responses.

## Endpoints

### Public
* API Documentation - [/swagger-ui.html](http://localhost/swagger-ui.html)
