package app;

import app.tools.RandomGenerator;
import app.tools.TimeSavior;
import appliances.Washer;
import appliances.factory.ArrayListOfWashers;
import appliances.factory.LinkedListOfWashers;
import appliances.factory.WasherFactory;
import clothes.Clothes;
import clothes.dao.ClothesDao;
import tools.Color;
import tools.temperature.IronTemperature;
import tools.temperature.WashingTemperature;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Random;

public class App {
//    static final String JDBC_DRIVER = "org.h2.Driver";
//    static final String DB_URL = "jdbc:h2:E:/FOR_WORK/Универъ/JavaUnik/Lab3/src/main/resources/db;DB_CLOSE_DELAY=-1";
//
//    static final String USER = "";
//    static final String PASS = "";
//
//    private static ClothesDao clothesDao;
//    private static Connection conn;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    private static final Logger logger = LoggerFactory.getLogger(App.class);



//    public static Washer load() throws SQLException {
//        Clothes clothes = new Clothes(new WashingTemperature(40), new IronTemperature(70), Color.COLOR);
//        clothesDao.create(conn, clothes);
//        return new Washer(clothes);
//    }
//
//    public static Washer load(int washingTemperature, int ironTemperature, Color color) throws SQLException {
//        Clothes clothes = new Clothes(new WashingTemperature(washingTemperature)
//                , new IronTemperature(ironTemperature)
//                , color);
//        clothesDao.create(conn, clothes);
//        return new Washer(clothes);
//    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        Class.forName(JDBC_DRIVER);
//        clothesDao = new ClothesDao();
//        logger.info("Start app");
//        conn = DriverManager.getConnection(DB_URL);
        try {
            for(int i = 10; i <= 100000; i *= 10){
                testOfPerformance(i);
        }
//            logger.info("Start testing only ArrayList");
            for(int i = (10 * 3) / 2 + 1; i <= (100000 * 3) / 2 + 1; i *= 10){
                testOfPerformanceForArrayList(i);
            }
//            logger.info("Stop testing");
//            logger.info("Simple task results:");
            TimeSavior.printResult();
//            logger.info("____________________________________\nHard task results:");
            TimeSavior.printResultForArrayList();
        } catch (Exception ex) {
//            logger.error("Error: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
//        logger.info("Stop app");
    }

    public static void testOfPerformanceForArrayList(int totalAmount){
        RandomGenerator randomGenerator = new RandomGenerator();
        WasherFactory arrayListOfWashersFactory = new ArrayListOfWashers();
//        logger.info("Start generating random washers for ArrayList");
        List<Washer> arrayListOfWashers = arrayListOfWashersFactory.getCollectionOfWashers(totalAmount);
        long startTime = System.nanoTime();
//        logger.info("Start deleting");
        for(int i : randomGenerator.listOfGeneratedIndexes(totalAmount)){
            arrayListOfWashersFactory.remove(i);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        TimeSavior.getArrayListListTimeRemoving().put(totalAmount, duration);
//        logger.info("Time for deleting ArrayList for " + totalAmount + " elements = " + duration + "ns");
    }



    public static void testOfPerformance(int totalAmount){
        RandomGenerator randomGenerator = new RandomGenerator();
        WasherFactory arrayListOfWashersFactory = new ArrayListOfWashers();
//        logger.info("Start generating random washers for ArrayList");
        List<Washer> arrayListOfWashers = arrayListOfWashersFactory.getCollectionOfWashers(totalAmount);
        long startTime = System.nanoTime();
//        logger.info("Start deleting");
        for(int i : randomGenerator.listOfGeneratedIndexes(totalAmount)){
            arrayListOfWashersFactory.remove(i);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        TimeSavior.getArrayListListTimeRemoving().put(totalAmount, duration);
//        logger.info("Time for deleting ArrayList for " + totalAmount + " elements = " + duration + "ns");
        WasherFactory linkedListOfWashersFactory = new LinkedListOfWashers();
//        logger.info("Start generating random washers for LinkedList");
        List<Washer> linkedListOfWashers = linkedListOfWashersFactory.getCollectionOfWashers(totalAmount);
        startTime = System.nanoTime();
//        logger.info("Start deleting");
        for(int i : randomGenerator.listOfGeneratedIndexes(totalAmount)){
            linkedListOfWashersFactory.remove(i);
        }
        TimeSavior.getLinkedListTimeRemoving().put(totalAmount, duration);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
//        logger.info("Time for deleting LinkedList for " + totalAmount + " elements = " + duration + "ns");
    }
}
