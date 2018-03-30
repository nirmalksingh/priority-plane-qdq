package org.nirmalksingh.planeqdeque.priorityplaneqdq.service;
/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
public abstract class Airplane {
	public String type_size;

	private int ID;
	protected final String thePlaneName;
	Airplane(String name) {
		this.thePlaneName = name;
        ID = nextId();
	}
	abstract protected int nextId();
}
