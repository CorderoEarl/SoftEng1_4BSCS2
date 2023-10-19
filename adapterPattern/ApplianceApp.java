package adapterPattern;

public class ApplianceApp {

    public static void main(String[] args){

        Tv tv = new Tv();
        RemoteControllerFunction tvRc = new TvAdapter(tv);

        AirCon airCon = new AirCon();
        RemoteControllerFunction airConRc = new AirconAdapter(airCon);

        Speaker speaker = new Speaker();
        RemoteControllerFunction speakerRc = new SpeakerAdapter(speaker);

        Laptop laptop = new Laptop();
        PowerOutlet laptopPo = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPo = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphoneChargerPo = new SmartphoneAdapter(smartphoneCharger);

        //turn on the appliances
        System.out.println(tvRc.powerOn());
        System.out.println(airConRc.powerOn());
        System.out.println(speakerRc.powerOn());

        System.out.println();

        //press button up
        System.out.println(tvRc.pressPlusButton());
        System.out.println(airConRc.pressPlusButton());
        System.out.println(speakerRc.pressPlusButton());

        System.out.println();

        //plug in to charge
        System.out.println(laptopPo.plugIn());
        System.out.println(refrigeratorPo.plugIn());
        System.out.println(smartphoneChargerPo.plugIn());
    }
}
