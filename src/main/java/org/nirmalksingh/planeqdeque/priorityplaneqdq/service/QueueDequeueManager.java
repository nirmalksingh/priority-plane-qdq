package org.nirmalksingh.planeqdeque.priorityplaneqdq.service;
/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDequeueManager implements Serializable{

	private static final long serialVersionUID = 3533831227342738639L;
	private static volatile QueueDequeueManager qDqManager = null;
	
	private static volatile LinkedBlockingQueue<Airplane> lnkdBlkngQEmrgLrg = null;
	
	private static LinkedBlockingQueue<Airplane> eml = null;
	private static LinkedBlockingQueue<Airplane> getEmlQueue() {
		if (eml == null) {
			eml = new LinkedBlockingQueue<Airplane>();
		}
		return eml;
	}
	public LinkedBlockingQueue<Airplane> getEmlQ() {
		return getEmlQueue();
	}
	
	private static LinkedBlockingQueue<Airplane> ems = null;
	private static LinkedBlockingQueue<Airplane> getEmsQueue() {
		if (ems == null) {
			ems = new LinkedBlockingQueue<Airplane>();
		}
		return ems;
	}
	public LinkedBlockingQueue<Airplane> getEmsQ() {
		return getEmsQueue();
	}
	
	private static LinkedBlockingQueue<Airplane> vpl = null;
	private static LinkedBlockingQueue<Airplane> getVplQueue() {
		if (vpl == null) {
			vpl = new LinkedBlockingQueue<Airplane>();
		}
		return vpl;
	}
	public LinkedBlockingQueue<Airplane> getVplQ() {
		return getVplQueue();
	}
	
	private static LinkedBlockingQueue<Airplane> vps = null;
	private static LinkedBlockingQueue<Airplane> getVpsQueue() {
		if (vps == null) {
			vps = new LinkedBlockingQueue<Airplane>();
		}
		return vps;
	}
	public LinkedBlockingQueue<Airplane> getVpsQ() {
		return getVpsQueue();
	}
	
	private static LinkedBlockingQueue<Airplane> pgl = null;
	private static LinkedBlockingQueue<Airplane> getPglQueue() {
		if (pgl == null) {
			pgl = new LinkedBlockingQueue<Airplane>();
		}
		return pgl;
	}
	public LinkedBlockingQueue<Airplane> getPglQ() {
		return getPglQueue();
	}
	
	private static LinkedBlockingQueue<Airplane> pgs = null;
	private static LinkedBlockingQueue<Airplane> getPgsQueue() {
		if (pgs == null) {
			pgs = new LinkedBlockingQueue<Airplane>();
		}
		return pgs;
	}
	public LinkedBlockingQueue<Airplane> getPgsQ() {
		return getPgsQueue();
	}
	
	private static LinkedBlockingQueue<Airplane> cgl = null;
	private static LinkedBlockingQueue<Airplane> getCglQueue() {
		if (cgl == null) {
			cgl = new LinkedBlockingQueue<Airplane>();
		}
		return cgl;
	}
	public LinkedBlockingQueue<Airplane> getCglQ() {
		return getCglQueue();
	}
	
	private static LinkedBlockingQueue<Airplane> cgs = null;
	private static LinkedBlockingQueue<Airplane> getCgsQueue() {
		if (cgs == null) {
			cgs = new LinkedBlockingQueue<Airplane>();
		}
		return cgs;
	}
	public LinkedBlockingQueue<Airplane> getCgsQ() {
		return getCgsQueue();
	}

	private QueueDequeueManager() {
		if (qDqManager != null) {
			throw new RuntimeException("Singleton object creating is prevented from reflection");
		}
	}

	public static QueueDequeueManager getQdqManager() {
		if (qDqManager == null) {
			synchronized (QueueDequeueManager.class) {
				if (qDqManager == null) {
					qDqManager = new QueueDequeueManager();
				}
			}
		}
		return qDqManager;
	}

	private static LinkedBlockingQueue<Airplane> getLinkedBlockingQueue() {
		if (lnkdBlkngQEmrgLrg == null) {
			lnkdBlkngQEmrgLrg = new LinkedBlockingQueue<Airplane>(200);
		}
		return lnkdBlkngQEmrgLrg;
	}
	 
	public LinkedBlockingQueue<Airplane> getLBQ() {
		return getLinkedBlockingQueue();
	}
	
	// Make singleton from serialize and deserialize operation.
	protected QueueDequeueManager readResolve() {
		return getQdqManager();
	}
	
	
}