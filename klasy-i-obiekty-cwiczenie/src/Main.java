public class Main {
    public static void main(String[] args) {
        Czlowiek jan = new Czlowiek();
        jan.wiek = 25;
        jan.imie = "Jan";
        jan.waga = 70.5;
        jan.powiedzWiek();
        jan.przeliterujSwojeImie();

        Czlowiek kuba = new Czlowiek();
        kuba.wiek = 12;
        kuba.imie = "Kuba";
        kuba.powiedzWiek();

        Czlowiek stanislaw = new Czlowiek();
        stanislaw.wiek = 55;
        stanislaw.imie = "Stanisław";
        stanislaw.waga = 123.4;
        stanislaw.przeliterujSwojeImie();
    }
}