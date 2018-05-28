package Strategy.Kaczki;

import Strategy.Kaczki.Behavior.LecRakieta;
import Strategy.Kaczki.Behavior.LecSkrzydla;
import Strategy.Kaczki.Obiekty.DzikaKaczka;
import Strategy.Kaczki.Obiekty.Kaczka;
import Strategy.Kaczki.Obiekty.RobotKaczka;

public class Main {
    public static void main(String[] args) {

        DzikaKaczka dzikaKaczka = new DzikaKaczka();
        dzikaKaczka.wyswietl();
        dzikaKaczka.doLec();

        RobotKaczka robotKaczka = new RobotKaczka();
        robotKaczka.wyswietl();
        robotKaczka.doLec();
        Kaczka kaczka = new Kaczka(new LecRakieta());
        kaczka.wyswietl();

        kaczka.doLec();
        kaczka = new Kaczka(new LecSkrzydla());
        kaczka.doLec();
    }
}
