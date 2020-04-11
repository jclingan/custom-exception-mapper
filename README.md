# Simple Mapper Example

Example app that calls an ExceptionMapper on a NotFoundException. This
example includes both a JAX-RS server resource and a MicroProfile Rest
Client. Because CustomMapper is annotated with @Provider, both
the RestClient and the JAX-RS  server resource will register the
CustomMapper.

### To properly invoke server resource:

`curl localhost:8080/mapper`

### To test the custom exception mapper:

`curl localhost:8080/badurl`

### To properly invoke server resource using the MicroProfile Rest Client API:

1. Uncomment the proper client URL in application.properties
1. Comment out the improper client URL in application.properties
1. `curl localhost:8080/client`

### To test the custom exception mapper using the MicroProfile Rest Client API:

1. Comment out the proper client URL in application.properties
1. Uncomment the improper client URL in application.properties
1. `curl localhost:8080/client`

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```