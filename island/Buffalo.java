package island;

import java.util.HashMap;


public class Buffalo extends Herbivore {
    public final static String NAME = "buffalo";
    public final static String emoji = "\uD83D\uDC03";
    public final static int WEIGHT = 700;
    public final static int MAX_TRAVEL_SPEED = 3;
    public static final HashMap<String, Integer> PROBABILITY = new HashMap<>();

    static {
        PROBABILITY.put("Plant", 100);
    }

    private double hp;

    public Buffalo(double hp) {
        this.hp = hp;
    }

    @Override
    public void relocate(Cell cell) {
        super.relocate(cell);
    }

    @Override
    public void reproduce(Cell cell) {
        super.reproduce(cell);
    }

    @Override
    public void eat(Cell cell) {
        super.eat(cell);
    }

    @Override
    public int getMaxTravelSpeed() {
        return MAX_TRAVEL_SPEED;
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public HashMap<String, Integer> getProbabilityMap() {
        return PROBABILITY;
    }

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public double getWeight() {
        return WEIGHT;
    }


    @Override
    public String toString() {
        return "Buffalo{" +
                "hp=" + hp +
                '}';
    }
}
