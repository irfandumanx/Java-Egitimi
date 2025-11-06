package java_oop_5_1_this;

public class Arena {
    private boolean girisYapilabilirMi;
    private String adi;
    private byte kisiSayisi;
    private ArenaBaslatici arenaBaslatici;

    public Arena(String adi, byte kisiSayisi) {
        this.adi = adi;
        this.kisiSayisi = kisiSayisi;
        this.girisYapilabilirMi = true;
        arenaBaslatici = new ArenaBaslatici(this);
    }

    public void girisYap() {
        if(!girisYapilabilirMi) {
            System.out.println("ARENA DOLDU VE BAŞLATILDI GİRİŞ YAPAMAZSIN");
            return;
        }
        System.out.println("GİRİŞ YAPILDI");
        kisiSayisi++;
        if(kisiSayisi == 2) {
            System.out.println("Arena DOLU");
            arenaBaslatici.arenayiBaslat();
        }
    }

    public void setGirisYapilabilirMi(boolean girisYapilabilirMi) {
        this.girisYapilabilirMi = girisYapilabilirMi;
    }

    public String getAdi() {
        return adi;
    }

}
