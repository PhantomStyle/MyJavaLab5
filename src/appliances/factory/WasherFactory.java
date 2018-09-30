package appliances.factory;

import app.App;
import appliances.Washer;
import clothes.Clothes;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import tools.Color;
import tools.accessories.Conditioner;
import tools.accessories.WashingPowder;
import tools.temperature.IronTemperature;
import tools.temperature.WashingTemperature;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class WasherFactory {
//    protected static final Logger logger = LoggerFactory.getLogger(WasherFactory.class);

    public abstract List<Washer> getCollectionOfWashers(int amount);
    public abstract Boolean remove(int id);


    public static Washer getRandomWasher(){
        Random randomForTemperature = new Random();
        Random randomForColor = new Random();
        WashingTemperature washingTemperature = new WashingTemperature(30 + randomForTemperature.nextInt(100 - 30));
        IronTemperature ironTemperature = new IronTemperature(30 + randomForTemperature.nextInt(100 - 30));
        Color color = Color.values()[randomForColor.nextInt(3)];
        Washer washer = new Washer(new Clothes(washingTemperature, ironTemperature, color)
                , new WashingPowder(), new Conditioner());
//        logger.info("Generated random washer: " + washer.toString());
        return washer;
    }
}
