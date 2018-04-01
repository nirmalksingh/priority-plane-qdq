package org.nirmalksingh.planeqdeque.priorityplaneqdq.service;
/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class QueueDequeueService {
	static QueueDequeueManager qDqManager = QueueDequeueManager.getQdqManager();

	public void queuePlane(String str){
		if ("eml".equalsIgnoreCase(str)){
			addEmlPlanes();
		}else if("ems".equalsIgnoreCase(str)){
			addEmsPlanes();			
		}else if("vpl".equalsIgnoreCase(str)){
			addVplPlanes();			
		}else if("vps".equalsIgnoreCase(str)){
			addVpsPlane();			
		}else if("pgl".equalsIgnoreCase(str)){
			addPglPlanes();			
		}else if("pgs".equalsIgnoreCase(str)){
			addPgsPlanes();			
		}else if("cgl".equalsIgnoreCase(str)){
			addCglPlanes();			
		}else if("cgs".equalsIgnoreCase(str)){
			addCgsPlanes();			
		}
	}
	
	public void queueTestPlane(){
		addPgsPlanes();			
		addEmsPlanes();			
		addEmlPlanes();
		addVplPlanes();			
		addVpsPlane();			
		addPglPlanes();			
		addCglPlanes();			
		addCgsPlanes();			
	}
	
	public void resetQueues(){
		qDqManager.getCgsQ().clear();
		qDqManager.getCglQ().clear();
		qDqManager.getEmlQ().clear();
		qDqManager.getEmsQ().clear();
		qDqManager.getVplQ().clear();
		qDqManager.getVpsQ().clear();
		qDqManager.getPglQ().clear();
		qDqManager.getPgsQ().clear();
		qDqManager.nullAllQueues();
	}
	
//	public Airplane[] dequeueAllPlanes(){
//		Stream<Airplane> combinedStream2 =
//				Stream.concat(Stream.concat(
//				Stream.concat(Stream.concat(
//				Stream.concat(Stream.concat(
//				Stream.concat(
//				qDqManager.getEmlQ().stream(), qDqManager.getEmsQ().stream()),
//				qDqManager.getVplQ().stream()),qDqManager.getVpsQ().stream()),
//				qDqManager.getPglQ().stream()),qDqManager.getPgsQ().stream()),
//				qDqManager.getCglQ().stream()),qDqManager.getCgsQ().stream());
//		return combinedStream2.toArray(Airplane[]::new);
//	}
	
	public List<Airplane> dequeueAllPlanes(){
		List<Airplane> dequeueList = Stream.concat(Stream.concat(
				Stream.concat(Stream.concat(
				Stream.concat(Stream.concat(
				Stream.concat(
				qDqManager.getEmlQ().stream(), qDqManager.getEmsQ().stream()),
				qDqManager.getVplQ().stream()),qDqManager.getVpsQ().stream()),
				qDqManager.getPglQ().stream()),qDqManager.getPgsQ().stream()),
				qDqManager.getCglQ().stream()),qDqManager.getCgsQ().stream()).collect(Collectors.toList());
				return dequeueList;
	}
	
	private static void addCglPlanes() {
		try {
			
			qDqManager.getCglQ().put(new CargoPlane(AirplaneTypeSize.CARGO_LARGE));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void addCgsPlanes() {
		try {
			qDqManager.getCgsQ().put(new CargoPlane(AirplaneTypeSize.CARGO_SMALL));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static void addPglPlanes() {
		try {
			qDqManager.getPglQ().put(new PassangerPlane(AirplaneTypeSize.PASSANGER_LARGE));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static void addPgsPlanes() {
		try {
			qDqManager.getPgsQ().put(new PassangerPlane(AirplaneTypeSize.PASSANGER_SMALL));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static void addVpsPlane() {
		try {
			qDqManager.getVpsQ().put(new VipPlane(AirplaneTypeSize.VIP_SMALL));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void addVplPlanes() {
		try {
			qDqManager.getVplQ().put(new VipPlane(AirplaneTypeSize.VIP_LARGE));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void addEmsPlanes() {
		try {
			qDqManager.getEmsQ().put(new EmergencyPlane(AirplaneTypeSize.EMERGENCY_SMALL));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void addEmlPlanes() {
		try {
			
			qDqManager.getEmlQ().put(new EmergencyPlane(AirplaneTypeSize.EMERGENCY_LARGE));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}