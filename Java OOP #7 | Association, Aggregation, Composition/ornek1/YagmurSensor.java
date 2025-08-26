package ornek1;

import java.util.Random;

public class YagmurSensor {
    private Random random = new Random();

    public boolean yagmurYagiyorMu() {
        return random.nextBoolean();
    }

}
