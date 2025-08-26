package ornek1;

import java.util.Random;

public class CatidakiOptikSensor {
    private Random random = new Random();

    public int isikMiktariniOlc() {
        return random.nextInt(100);
    }
}
