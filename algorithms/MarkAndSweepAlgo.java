package algorithms;

import java.util.ArrayList;
import java.util.List;

public class MarkAndSweepAlgo {
	
    public static void main(String[] args) throws InterruptedException {   	   	
    	List<GCObject> objects = new ArrayList<>();
    	
        for (int i = 0; i < 5; i++) {
            objects.add(new GCObject(i));
        }

        objects.remove(0);
        objects.remove(1);

        System.gc();   
        Thread.sleep(1000); 

    }
}
class GCObject {
	private int id;

    public GCObject(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing GCObject with id: " + id);
    }
}

