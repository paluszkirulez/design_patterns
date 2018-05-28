package Creation.Singleton;

public class SingletonMockup {
    public static void main(String[] args) {
        AppsSettings appsSettings = AppsSettings.getInstance();
        AppsSettings appsSettings2 = AppsSettings.getInstance();
        AppsSettings appsSettings3 = AppsSettings.getInstance();

        if(appsSettings==appsSettings2){
            System.out.println("dziala");
        }

        appsSettings.setIpAdress("10.10.10");
        appsSettings2.setIpAdress("20.10.30.20");

        System.out.println(appsSettings.getIpAdress());
        System.out.println(appsSettings2.getIpAdress());
    }
}
