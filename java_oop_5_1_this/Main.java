package java_oop_5_1_this;

public class Main {
    public static void main(String[] args) {

        Arena arena1 = new Arena("Arena1", (byte) 0);
        arena1.girisYap();
        arena1.girisYap();
        arena1.girisYap();
        System.out.println();
        Arena arena2 = new Arena("Arena2", (byte) 0);
        arena2.girisYap();
        System.out.println();
        Arena arena3 = new Arena("Arena3", (byte) 0);
        arena3.girisYap();
        arena3.girisYap();

    }
}