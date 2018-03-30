package org.nirmalksingh.planeqdeque.priorityplaneqdq.service;
/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
public class VipPlane extends Airplane{
	private static int curID = 0;
	private int queuePositionId = 0;
	public VipPlane(String type_size){
		super(type_size+curID);
		this.type_size = type_size;
		this.queuePositionId = curID;
	}
	public int getQueuePositionId() {
		return queuePositionId;
	}
	protected int nextId() {
	       return curID++;
	}
}