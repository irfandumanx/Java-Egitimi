package ornek4;

public class Arena {
    private Oyuncu[] oyuncular; //aggragation
    private OyunDurumu oyunDurumu; //composition

    public Arena(Oyuncu[] oyuncular) {
        this.oyuncular = oyuncular;
        this.oyunDurumu = new OyunDurumu("Başlıyor..");
    }
}
