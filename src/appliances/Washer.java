package appliances;

import clothes.Clothes;
import tools.Color;
import tools.accessories.Conditioner;
import tools.accessories.WashingPowder;
import tools.temperature.WashingTemperature;

public class Washer {
    private int id;
    private static int idHelper = 0;
    private Clothes clothes;
    private WashingPowder washingPowder;
    private Conditioner conditioner;
    private Color color;
    private WashingTemperature washingTemperature;

    public Washer(Clothes clothes, WashingPowder washingPowder, Conditioner conditioner) {
        id = idHelper++;
        this.clothes = clothes;
        this.washingPowder = washingPowder;
        this.conditioner = conditioner;
        color = clothes.getColor();
        washingTemperature = clothes.getWashingTemperature();
    }

//    public Washer(Clothes clothes) {
//        id = idHelper++;
//        this.clothes = clothes;
//        color = clothes.getColor();
//        washingTemperature = clothes.getWashingTemperature();
//    }

    public Washer() {
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public WashingPowder getWashingPowder() {
        return washingPowder;
    }

    public void setWashingPowder(WashingPowder washingPowder) {
        this.washingPowder = washingPowder;
    }

    public Conditioner getConditioner() {
        return conditioner;
    }

    public void setConditioner(Conditioner conditioner) {
        this.conditioner = conditioner;
    }

    public Color getColor() {
        return color;
    }

    public WashingTemperature getWashingTemperature() {
        return washingTemperature;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "id=" + id +
                ", clothes=" + clothes +
                ", washingPowder=" + washingPowder +
                ", conditioner=" + conditioner +
                ", color=" + color +
                ", washingTemperature=" + washingTemperature +
                '}';
    }
}
