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
