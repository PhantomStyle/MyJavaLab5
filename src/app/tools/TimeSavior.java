package app.tools;

import app.App;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class TimeSavior {
//    private static final Logger logger = LoggerFactory.getLogger(TimeSavior.class);


    private static Map<Integer, Long> linkedListTimeAdding = new HashMap<>();
    private static Map<Integer, Long> arrayListListTimeAdding = new HashMap<>();
    private static Map<Integer, Long> linkedListTimeRemoving = new HashMap<>();
    private static Map<Integer, Long> arrayListListTimeRemoving = new HashMap<>();

    public static Map<Integer, Long> getLinkedListTimeAdding() {
        return linkedListTimeAdding;
    }

    public static Map<Integer, Long> getArrayListListTimeAdding() {
        return arrayListListTimeAdding;
    }

    public static Map<Integer, Long> getLinkedListTimeRemoving() {
        return linkedListTimeRemoving;
    }

    public static Map<Integer, Long> getArrayListListTimeRemoving() {
        return arrayListListTimeRemoving;
    }

    public static long getTotalTimeForArrayListAdding(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : arrayListListTimeAdding.entrySet()) {
            totalTime += entry.getValue();
        }
        return totalTime;
    }

    public static long getTotalTimeForLinkedListAdding(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : linkedListTimeAdding.entrySet()) {
            totalTime += entry.getValue();
        }
        return totalTime;
    }

    public static long getTotalTimeForArrayListRemoving(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : arrayListListTimeRemoving.entrySet()) {
            totalTime += entry.getValue();
        }
        return totalTime;
    }

    public static long getTotalTimeForLinkedListRemoving(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : linkedListTimeRemoving.entrySet()) {
            totalTime += entry.getValue();
        }
        return totalTime;
    }

    public static double getAverageTimeForArrayListAdding(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : arrayListListTimeAdding.entrySet()) {
            totalTime += entry.getValue();
        }
        double averageTime = totalTime/11111;
        return averageTime;
    }

    public static double getAverageTimeForLinkedListAdding(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : linkedListTimeAdding.entrySet()) {
            totalTime += entry.getValue();
        }
        double averageTime = totalTime/11111;
        return averageTime;
    }

    public static double getAverageTimeForArrayListRemoving(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : arrayListListTimeRemoving.entrySet()) {
            totalTime += entry.getValue();
        }
        double averageTime = totalTime/11111;
        return averageTime;
    }

    public static double getAverageTimeForLinkedListRemoving(){
        long totalTime = 0;
        for(Map.Entry<Integer, Long> entry : linkedListTimeRemoving.entrySet()) {
            totalTime += entry.getValue();
        }
        double averageTime = totalTime/11111;
        return averageTime;
    }

    public static void printResult(){
//        logger.info("Total time for adding in ArrayList = " + getTotalTimeForArrayListAdding());
//        logger.info("Total time for removing from ArrayList = " + getTotalTimeForArrayListRemoving());
//        logger.info("Total time for adding in LinkedList = " + getTotalTimeForLinkedListAdding());
//        logger.info("Total time for removing from LinkedList = " + getTotalTimeForLinkedListRemoving());
//        logger.info("Average time for adding in ArrayList = " + getAverageTimeForArrayListAdding());
//        logger.info("Average time for removing from ArrayList = " + getAverageTimeForArrayListRemoving());
//        logger.info("Average time for adding in LinkedList = " + getAverageTimeForLinkedListAdding());
//        logger.info("Average time for removing from LinkedList = " + getAverageTimeForLinkedListRemoving());
    }

    public static void printResultForArrayList(){
//        logger.info("Total time for adding in ArrayList = " + getTotalTimeForArrayListAdding());
//        logger.info("Total time for removing from ArrayList = " + getTotalTimeForArrayListRemoving());
//        logger.info("Average time for adding in ArrayList = " + getAverageTimeForArrayListAdding());
//        logger.info("Average time for removing from ArrayList = " + getAverageTimeForArrayListRemoving());
    }

}
