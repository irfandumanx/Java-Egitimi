package java_oop_7_association_aggregation_composition.ornek1;

import java.util.Random;

public class CatidakiOptikSensor {
    private Random random = new Random();

    public int isikMiktariniOlc() {
        return random.nextInt(100);
    }
}
