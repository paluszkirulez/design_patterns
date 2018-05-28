package Creation.Singleton;

public class AppsSettings {
    private String nazwaSerwera;
    private String ipAdress;
    private boolean createAll;

    public String getNazwaSerwera() {
        return nazwaSerwera;
    }

    public void setNazwaSerwera(String nazwaSerwera) {
        this.nazwaSerwera = nazwaSerwera;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public boolean isCreateAll() {
        return createAll;
    }

    public void setCreateAll(boolean createAll) {
        this.createAll = createAll;
    }

    private static AppsSettings appsSettings = null;
    private AppsSettings(){};
    public static AppsSettings getInstance(){
        if (appsSettings == null){
            appsSettings = new AppsSettings();
        }
        return appsSettings;
    }




}
