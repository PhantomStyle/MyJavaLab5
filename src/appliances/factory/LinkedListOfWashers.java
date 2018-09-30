package appliances.factory;

import app.tools.TimeSavior;
import appliances.Washer;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOfWashers extends WasherFactory{
    private LinkedList<Washer> listOfWashers;

    @Override
    public LinkedList<Washer> getCollectionOfWashers(int amount) {
        listOfWashers = new LinkedList<>();
        long totalTime = 0;
        for(int i = 0; i < amount; i++){
            long startTime = System.nanoTime();
            Washer washer = WasherFactory.getRandomWasher();
            listOfWashers.add(WasherFactory.getRandomWasher());
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
//            logger.info("Adding into LinkedList | id = " + washer.getId() + " | time = " + duration + "ns");
            totalTime += duration;
        }
//        logger.info("Total time for for " + amount + " amount adding LinkedList = " + totalTime + "ns");
        TimeSavior.getLinkedListTimeAdding().put(amount, totalTime);
        return listOfWashers;
    }

    @Override
    public Boolean remove(int id) {
        Boolean[] res = {false};
        Iterator<Washer> it = listOfWashers.iterator();
        while (it.hasNext()){
            Washer washer = it.next();
            if(washer.getId() == id){
                it.remove();
                res[0] = true;
            }
        }
//        logger.info("Washer with id = " + id + " was removed from LinkedList");
        return res[0];
    }

    public LinkedList<Washer> getListOfWashers() {
        return listOfWashers;
    }
}
