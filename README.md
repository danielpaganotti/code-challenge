# code-challenge

1 - Execute the following to build and run the application: 

mvn install
mvn spring-boot:run

2 - make a sample message Post to test:

curl -H "Content-Type: application/json" -d '{"message":"Notification Message example", "category":"Sports"}' -X POST http://localhost:8080/message

3 - Check application output.
