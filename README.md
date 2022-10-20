# demo-rabbitmq-stream-bridge
## Demonstração de mensageria utilizando o StreamBridge
### Algumas das tecnologias utilizadas:
- Ecossistema Spring
- Spring Boot 2.7.5
- Spring Cloud Stream
- Spring Cloud Stream Binder Rabbit


## configuração do Application-properties
```bash
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672 
spring.rabbitmq.username=guest 
spring.rabbitmq.password=guest 

spring.cloud.stream.bindings.appCreatedSupplier-out-0.destination=CargaApp.criado
spring.cloud.stream.bindings.appUpdateSupplier-out-0.destination=CargaApp.atualizado

spring.cloud.stream.bindings.appCreatedEventListener-in-0.destination=CargaApp.criado
spring.cloud.stream.bindings.appCreatedEventListener-in-0.group=demo-cloud-rabbitmq
```
