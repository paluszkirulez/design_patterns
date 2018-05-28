package Strategy.Kaczki.Obiekty;

import Strategy.Kaczki.Behavior.LatanieInterfejs;

public class Kaczka implements LatanieInterfejs {
    public Kaczka() {
    }

    public void lec() {

    }
    public void plywa(){
        System.out.println("plywa");
    }
    public void wyswietl(){
        String fullClassName = this.getClass().toString();
        int lengthOfPackageName = this.getClass().getPackage().toString().length();
        System.out.println("I am "+ fullClassName.substring(lengthOfPackageName-1) );
    }
    LatanieInterfejs latanieInterfejs;
    public Kaczka(LatanieInterfejs latanieInterfejs){
        this.latanieInterfejs = latanieInterfejs;
    }

    public void doLec(){
        latanieInterfejs.lec();
    }

}
