package org.nirmalksingh.planeqdeque.priorityplaneqdq.controller;
/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
import java.util.List;

import org.nirmalksingh.planeqdeque.priorityplaneqdq.service.Airplane;
import org.nirmalksingh.planeqdeque.priorityplaneqdq.service.Constants;
import org.nirmalksingh.planeqdeque.priorityplaneqdq.service.QueueDequeueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/plane")
@RestController
public class AtcQdQController {
	
	@Autowired
	QueueDequeueService qDqService;
	
	@RequestMapping(Constants.QUEUE_PLANE)
	public void queuePlane(@PathVariable String thePlaneName) {
		qDqService.queuePlane(thePlaneName);
	}
	@RequestMapping(Constants.GET_DEQUEUE_ORDER)
	public List<Airplane> getDequeueOrder() {
		return qDqService.dequeueAllPlanes();
	}
	
	@RequestMapping(Constants.QUEUE_TEST_PLANE)
	public void queueTestPlane() {
		qDqService.queueTestPlane();
	}
	@RequestMapping(Constants.RESET_QUEUE)
	public void resetQueues() {
		qDqService.resetQueues();
	}
	
}
