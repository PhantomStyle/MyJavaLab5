package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

import static app.App.testOfPerformance;
import static app.tools.TimeSavior.*;

public class Main extends Application {


    private static Map<Integer, Double> avArrayAdd = new HashMap<Integer, Double>();
    private static Map<Integer, Double> avArrayRem = new HashMap<Integer, Double>();
    private static Map<Integer, Long> totArrayAdd = new HashMap<Integer, Long>();
    private static Map<Integer, Long> totArrayRem = new HashMap<Integer, Long>();
    private static Map<Integer, Double> avLinkedAdd = new HashMap<Integer, Double>();
    private static Map<Integer, Double> avLinkedRem = new HashMap<Integer, Double>();
    private static Map<Integer, Long> totLinkedAdd = new HashMap<Integer, Long>();
    private static Map<Integer, Long> totLinkedRem = new HashMap<Integer, Long>();
    private static XYChart.Series avArrayRemSer = new XYChart.Series();
    private static XYChart.Series avArrayAddSer = new XYChart.Series();
    private static XYChart.Series avLinkedAddSer = new XYChart.Series();
    private static XYChart.Series avLinkedRemSer = new XYChart.Series();
    private static XYChart.Series totArrayAddSer = new XYChart.Series();
    private static XYChart.Series totArrayRemSer = new XYChart.Series();
    private static XYChart.Series totLinkedAddSer = new XYChart.Series();
    private static XYChart.Series totLinkedRemSer = new XYChart.Series();


    @FXML
    private NumberAxis x8;

    @FXML
    private Button avArrayButton;

    @FXML
    private LineChart<?, ?> totLinkedRemMap;

    @FXML
    private LineChart<?, ?> avLinkedAddMap;

    @FXML
    private AnchorPane anPane;

    @FXML
    private LineChart<?, ?> totArrayAddMap;

    @FXML
    private Button totArray;

    @FXML
    private NumberAxis y1;

    @FXML
    private NumberAxis y2;

    @FXML
    private NumberAxis y3;

    @FXML
    private NumberAxis y4;

    @FXML
    private NumberAxis y6;

    @FXML
    private NumberAxis y7;

    @FXML
    private NumberAxis y8;

    @FXML
    private LineChart<?, ?> totArrayRemMap;

    @FXML
    private LineChart<?, ?> totLinkedAddMap;

    @FXML
    private LineChart<?, ?> avLinkedRemMap;

    @FXML
    private Button totLinked;

    @FXML
    private Button avLinked;

    @FXML
    private NumberAxis y5;

    @FXML
    private NumberAxis x1;

    @FXML
    private LineChart<?, ?> avArrayAddMap;

    @FXML
    private NumberAxis x2;

    @FXML
    private NumberAxis x3;

    @FXML
    private LineChart<?, ?> avArrayRemMap;

    @FXML
    private NumberAxis x4;

    @FXML
    private NumberAxis x5;

    @FXML
    private NumberAxis x6;

    @FXML
    private NumberAxis x7;

    @FXML
    void initialize() {


//        avArrayAddSer.setName("100");
//        avArrayRemSer.setName("100");

//        for(int i = 10; i <= 100000; i *= 10) {
//            testOfPerformance(i);
//
////            for (Map.Entry<Integer, Long> entry : TimeSavior.getArrayListListTimeAdding().entrySet()) {
//                avArrayAddSer.getData().add(new XYChart.Data(i, getAverageTimeForArrayListAdding()));
////            }
//
////            for (Map.Entry<Integer, Long> entry : TimeSavior.getArrayListListTimeRemoving().entrySet()) {
//                avArrayRemSer.getData().add(new XYChart.Data(i, getAverageTimeForArrayListRemoving()));
////            }
//        }
//        avArrayAddSer.setData(datas);

//
//        addLC.getData().add(avArrayAddSer);
//        remLC.getData().add(avArrayRemSer);


        for (int i = 10; i <= 10000; i *= 10) {
            testOfPerformance(i);
            avArrayAdd.put(i, getAverageTimeForArrayListAdding());
            avArrayRem.put(i, getAverageTimeForArrayListRemoving());
            totArrayAdd.put(i, getTotalTimeForArrayListAdding());
            totArrayRem.put(i, getTotalTimeForArrayListRemoving());
            avLinkedAdd.put(i, getAverageTimeForLinkedListAdding());
            avLinkedRem.put(i, getAverageTimeForLinkedListRemoving());
            totLinkedAdd.put(i, getTotalTimeForLinkedListAdding());
            totLinkedRem.put(i, getTotalTimeForLinkedListRemoving());

        }

        for (Map.Entry<Integer, Double> entry : avArrayAdd.entrySet()) {
            avArrayAddSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        for (Map.Entry<Integer, Double> entry : avArrayRem.entrySet()) {
            avArrayRemSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        for (Map.Entry<Integer, Double> entry : avArrayRem.entrySet()) {
            avLinkedAddSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        for (Map.Entry<Integer, Double> entry : avArrayRem.entrySet()) {
            avLinkedRemSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        for (Map.Entry<Integer, Double> entry : avArrayRem.entrySet()) {
            totArrayAddSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        for (Map.Entry<Integer, Double> entry : avArrayRem.entrySet()) {
            totArrayRemSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        for (Map.Entry<Integer, Double> entry : avArrayRem.entrySet()) {
            totLinkedAddSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        for (Map.Entry<Integer, Double> entry : avArrayRem.entrySet()) {
            totLinkedRemSer.getData().add(new XYChart.Data(entry.getKey(), entry.getValue()));
        }

        avArrayAddMap.getData().add(avArrayAddSer);
        avArrayRemMap.getData().add(avArrayRemSer);
        avLinkedAddMap.getData().add(avLinkedAddSer);
        avLinkedRemMap.getData().add(avLinkedRemSer);
        totArrayAddMap.getData().add(totArrayAddSer);
        totArrayRemMap.getData().add(totArrayRemSer);
        totLinkedAddMap.getData().add(totLinkedAddSer);
        totLinkedRemMap.getData().add(totLinkedRemSer);

        avArrayAddMap.setVisible(true);
        avArrayRemMap.setVisible(true);
        avLinkedAddMap.setVisible(false);
        avLinkedRemMap.setVisible(false);
        totArrayAddMap.setVisible(false);
        totArrayRemMap.setVisible(false);
        totLinkedAddMap.setVisible(false);
        totLinkedRemMap.setVisible(false);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("5 labka");


//        NumberAxis x = new NumberAxis();
//        NumberAxis y = new NumberAxis();




        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


    @FXML
    private void initAverageForArrayList() {
        avArrayAddMap.setVisible(true);
        avArrayRemMap.setVisible(true);
        avLinkedAddMap.setVisible(false);
        avLinkedRemMap.setVisible(false);
        totArrayAddMap.setVisible(false);
        totArrayRemMap.setVisible(false);
        totLinkedAddMap.setVisible(false);
        totLinkedRemMap.setVisible(false);
    }

    @FXML
    private void initAverageForLinkedList() {
        avArrayAddMap.setVisible(false);
        avArrayRemMap.setVisible(false);
        avLinkedAddMap.setVisible(true);
        avLinkedRemMap.setVisible(true);
        totArrayAddMap.setVisible(false);
        totArrayRemMap.setVisible(false);
        totLinkedAddMap.setVisible(false);
        totLinkedRemMap.setVisible(false);
    }

    @FXML
    private void initTotalForArrayList() {
        avArrayAddMap.setVisible(false);
        avArrayRemMap.setVisible(false);
        avLinkedAddMap.setVisible(false);
        avLinkedRemMap.setVisible(false);
        totArrayAddMap.setVisible(true);
        totArrayRemMap.setVisible(true);
        totLinkedAddMap.setVisible(false);
        totLinkedRemMap.setVisible(false);
    }

    @FXML
    private void initTotalForLinkedList() {
        avArrayAddMap.setVisible(false);
        avArrayRemMap.setVisible(false);
        avLinkedAddMap.setVisible(false);
        avLinkedRemMap.setVisible(false);
        totArrayAddMap.setVisible(false);
        totArrayRemMap.setVisible(false);
        totLinkedAddMap.setVisible(true);
        totLinkedRemMap.setVisible(true);
    }
}
