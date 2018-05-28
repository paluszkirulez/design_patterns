package Strategy.Kaczki.Obiekty;

import Strategy.Kaczki.Behavior.LatanieInterfejs;
import Strategy.Kaczki.Behavior.LecRakieta;
import Strategy.Kaczki.Behavior.LecSkrzydla;
import Strategy.Kaczki.Obiekty.Kaczka;

public class RobotKaczka extends Kaczka {
    //LecRakieta lecRakieta = new LecRakieta();

    public RobotKaczka(){
        this.latanieInterfejs = new LecRakieta();

    }
}
