package java_oop_7_association_aggregation_composition.ornek1;

import java.util.Random;

public class YagmurSensor {
    private Random random = new Random();

    public boolean yagmurYagiyorMu() {
        return random.nextBoolean();
    }

}
