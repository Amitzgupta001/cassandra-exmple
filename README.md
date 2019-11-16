# cassandra-example
spring boot connection with cassandra

Hi 
Step to create connection

1: Download cassandra http://cassandra.apache.org/download/

2: Start cassandra by executing cassandra.sh {Linux} or cassandra.bat {Windows} in bin folder.

3: open cqlsh.bat or cqlsh.sh in folder.

4: create new keyspace :

    CREATE KEYSPACE events WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 1};

5: create table name people:

    CREATE TABLE people(
     emp_id int PRIMARY KEY,
     first_name text,
     last_name text,
     salary double
      );
   
6: build project using maven 
       
       mvn clean install
       
7: run project through any IDE or by cammand line 

       java -jar target/cassandra-0.0.1-SNAPSHOT.jar

8: create new entity in database using curl
  
      curl -X POST \
      http://localhost:8080/person/ \
      -H 'Accept: */*' \
      -H 'Content-Type: application/json' \
      -d '{
      "id":1,
      "firstName":"John",
      "lastName":"Crew",
      "salary":54546
      }'
 
 9: get entity by id
 
      curl -X GET \
       http://localhost:8080/person/1 \
       -H 'Content-Type: application/json' 
 
 10: delete entity by id
 
    curl -X DELETE \
    http://localhost:8080/person/43 \
    -H 'Accept: */*' \
    -H 'Content-Type: application/json'
 
 11: get all person
 
    curl -X GET \
    http://localhost:8080/person/ \
    -H 'Accept: */*' \
    -H 'Content-Type: application/json' 
 
 12: Happy coding

