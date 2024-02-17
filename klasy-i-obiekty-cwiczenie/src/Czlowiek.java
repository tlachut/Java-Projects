public class Czlowiek {
    // Cechy
    int wiek;
    String imie;
    double waga;

    // Metody
    public void powiedzWiek() {
        if (wiek >= 18) {
            System.out.println("Mam " + wiek + " lat i jestem pełnoletni.");
        } else {
            System.out.println("Mam " + wiek + " lat i jestem niepełnoletni.");
        }
    }

    public void przeliterujSwojeImie() {
        for (int i = 0; i < imie.length(); i++) {
            System.out.println(imie.charAt(i));
        }
    }

}
