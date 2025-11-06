package java_oop_5_1_this;

public class ArenaBaslatici {

    public String durum;
    private Arena arena;

    public ArenaBaslatici(Arena arena) {
        durum = "Bekleniyor";
        this.arena = arena;
    }

    public void arenayiBaslat() {
        System.out.println("ARENA BAŞLATICISI ÇALIŞTI: " + arena.getAdi());
        durum = "BAŞLATILIYOR";
        arena.setGirisYapilabilirMi(false);
    }

}
