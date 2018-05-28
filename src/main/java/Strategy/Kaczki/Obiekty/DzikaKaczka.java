package Strategy.Kaczki.Obiekty;

import Strategy.Kaczki.Behavior.LecSkrzydla;
import Strategy.Kaczki.Obiekty.Kaczka;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka(){
        this.latanieInterfejs = new LecSkrzydla();

    }
}
