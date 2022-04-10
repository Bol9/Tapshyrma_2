package AvtoBaza;

import java.util.List;

public class Printer {
    String space = " ";

    public void driverPrinter(List<Driver> driverList){

        System.out.println("\n" +
                "-------------------DriverS-------------------\n" +
                "   # | ID    | Drivers       | BUS  \n" +
                "-----+-------+---------------+-------");

        for (Driver driver: driverList) {
            System.out.println(
                    " ".repeat(4)+driver.getId()+"| drv-"+driver.getId()+" | " +
                            driver.getName()+" ".repeat(14-driver.getName().length()) + "| "+ driver.getBus()


            );

        }


    }

    public void trackPrinter(List<Tracks> tracksList){
        System.out.println("\n" +
                "-------------------Tracks--------------------\n" +
                "   # | Bus           | Drivers       | Status  \n" +
                "-----+---------------+---------------+-------");

        for (Tracks tracks: tracksList) {
            System.out.println(
                    " ".repeat(4) + tracks.getId() + "| " + tracks.getName() +" ".repeat(14-tracks.getName().length())+
                            "| " +
                            tracks.getDriver() + " ".repeat(14-tracks.getDriver().length())+"| " + tracks.getStatus()


            );

        }

    }
    public void trackINfoPrinter(Tracks track){  //Track information Printer
        System.out.println("-----------------Track-Info------------------\n"+
                "N         : "+track.getId()+
                "\nBus       : "+track.getName()+
                "\nDriver    : "+track.getDriver()+
                "\nBus State : "+track.getStatus()+
                "\nPress 1 to change Driver" +
                "\nPress 2 to send to the Route" +
                "\nPress 3 to send to the Repairing");

    }
}
