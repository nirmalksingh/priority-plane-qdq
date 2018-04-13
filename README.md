# priority-plane-qdq
Planes are queued in any order as they are requested - the dequeue (for landing) have to be based off a pre defined precedence rule.
priority-plane-qdq
Planes are queued in any order as they are requested - the dequeue (for landing) have to be based off a pre defined precedence rule.

The solution is hosted on my git hub account at: https://github.com/nirmalksingh/priority-plane-qdq To test please issue the following commands from the command promt:

~$ git clone https://github.com/nirmalksingh/priority-plane-qdq.git

~$ cd priority-plane-qdq

~$ mvn package

~$ java -jar target/priority-plane-qdq-0.0.1-SNAPSHOT.jar

go to http://localhost:8080/home

1.) You can either test the pre-queued planes with the first button

Or

2.) Enter your own plane to queue, button press shows the dequeue sequence of the planes. Following are the planes(case doesn't matter) that can be entered (other strings are not checked - so you may see error so enter only the following string: EML (for emergency large) EMS (for emergency small) VPL (for vip large) VPS (for vip small) PGL (for passenger large) PGS (for passenger small) CGL (for cargo large) CGS (for cargo small)

happy queueing and dequeueing!

---To Dockerize the above spring boot application---

The application can be run in an isolated environment (container) within few steps(not accounting the docker installation and dockerhub account creation).
Assuming the docker is installed and you do have a dockerhub account, follow the steps below to containerize the application.

-in the application priority-plane-qdq add or edit applicationContext.txt to give a new port 

server.port = 8085

-re/build the application (just like above: mvn clean package)

-add text file named "Dockerfile" in the application with the following:

"FROM openjdk:8"

"ADD target/priority-plane-qdq-0.0.1-SNAPSHOT.jar priority-plane-qdq.jar
"EXPOSE 8085"
"ENTRYPOINT ["java", "-jar", "priority-plane-qdq.jar"]"

-issue the following commands (prompt should be at the path where priority-plane-qdq is on your machine )

"docker build -f Dockerfile -t priority-plane-qdq ." (this builds the docker image out of the jar built in the steaps above)

"docker images" (this shows a list of images)

"docker run -p 8085:8085 priority-plane-qdq"

-now go to http://localhost:8085/home


happy dockering!
