package appliances.factory;

import app.tools.TimeSavior;
import appliances.Washer;

import java.util.*;

public class ArrayListOfWashers extends WasherFactory{
    private ArrayList<Washer> listOfWashers;

    @Override
    public ArrayList<Washer> getCollectionOfWashers(int amount) {
        listOfWashers = new ArrayList<>();
        long totalTime = 0;
        for(int i = 0; i < amount; i++){
            long startTime = System.nanoTime();
            Washer washer = WasherFactory.getRandomWasher();
            listOfWashers.add(washer);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
//            logger.info("Adding into ArrayList | id = " + washer.getId() + " | time = " + duration + "ns");
            totalTime += duration;
        }
//        logger.info("Total time for " + amount + " amount adding ArrayList = " + totalTime + "ns");
        TimeSavior.getArrayListListTimeAdding().put(amount, totalTime);
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
//        logger.info("Washer with id = " + id + " was removed from ArrayList");
        return res[0];
    }

    public ArrayList<Washer> getListOfWashers() {
        return listOfWashers;
    }
}
