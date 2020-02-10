# microservices
Demo for microservice architecture

- Config server - contains application properties files stored on private git repository
- Discovery service - Is Eureka discovery service for discovering service instance ips and it is used by Zull API gateway service
- Gateway - Is Zuul API Gateway application and it serves as single entry point for all microservices
- Users service - it is uses for user registration and user loggin
- Photo albums service - it is used as service which retrieves some generated albums for passed user Id. User service communicates with it using Feign client.
- Account service - it is just another microservice and it is currently empty

Config server:
Uses private git repository for storing application.properties files and I removed the password from it

Preconditions:
1. Rabbit mq server (setup in application.properties file)
2. MySQL server (setup in application.properties file)

Security: 

Eureka (discovery) service has spring boot security enabled. It's configuration for security is set in config server files.
Other microservices can access to Eureka service only if they have eureka credentials stored in discovery service url.


HOW TO RUN MICROSERVICES:
1. Run Config server 
2. Run Discovery service 
3. Run Gateway app
4. Run photo albums service
5. Run users service
