package java_oop_7_association_aggregation_composition.ornek1;

public class AkilliPencere {
    private CatidakiOptikSensor optikSensor; //association
    private Duvar duvar; //aggregation
    private YagmurSensor yagmurSensor; //composition
    private boolean kepenkKapat;
    private boolean camKapat;

    public AkilliPencere(CatidakiOptikSensor optikSensor, Duvar duvar) {
        this.optikSensor = optikSensor;
        this.duvar = duvar;
        this.yagmurSensor = new YagmurSensor();
    }

    public boolean kepenkKapat() {
        kepenkKapat = optikSensor.isikMiktariniOlc() < 20;
        return kepenkKapat;
    }

    public boolean camlariKapat() {
        camKapat = yagmurSensor.yagmurYagiyorMu();
        return camKapat;
    }

}
