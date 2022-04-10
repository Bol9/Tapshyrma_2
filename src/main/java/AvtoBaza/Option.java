package AvtoBaza;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Option {

    Printer printer = new Printer();
    Random random = new Random();



    public void optins(List<Driver> driverList, List<Tracks> tracksList) throws Exception {

        printer.driverPrinter(driverList);   // just printer driverlist
        printer.trackPrinter(tracksList);    // just printer tracklist

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose one of the TRACK");
        int truckNumber = scanner.nextInt();

        for (Tracks traks: tracksList) {
            if(truckNumber== traks.getId()){
                //sout anan swich case
                printer.trackINfoPrinter(traks);
                int optinNumber = scanner.nextInt();

                switch (optinNumber){
                    case 1:
                        //change driver
                        optionOne(traks,tracksList,driverList);
                        break;
                    case 2:
                        //send to the road
                        optionTwo(traks,tracksList,driverList);
                        break;
                    case 3:
                        //send to the reapiring
                        optionTree(traks,tracksList,driverList);
                        break;
                    default:
                        throw new Exception("Out of Operation");
                }


            }

        }


    }
    public void optionOne(Tracks tracks,List<Tracks> tracksList,List<Driver> driverList) throws Exception {
        String freeDriver= "";
        for (Driver driver :driverList) {
            if(driver.getBus().equals("")){
                freeDriver = driver.getName();
                break;
            }

        }
        if(freeDriver.equals("")){
            throw new Exception("There is Now Free Driver");
        }
        if(tracks.getStatus().equals("base")){
            tracks.setDriver(freeDriver);
            System.out.println("----->Track car :"+tracks.getName()+" Driver successfully changed to "+ freeDriver+"" +
                    "<-----");
        }else if(tracks.getStatus().equals("route")){
            throw new Exception("Bus status already route, that is why we can't change driver");
        }else{
            throw new Exception("Bus status is repairing, that is why we can't change driver");
        }

        for (Driver dr: driverList ) {
            if(dr.getBus()==tracks.getName()){
                dr.setBus("");
            }
            if(dr.getName().equals(tracks.getDriver())){
                dr.setBus(tracks.getName());

                }
            }
        optins(driverList,tracksList);

        }






    public void optionTwo(Tracks tracks,List<Tracks> tracksList,List<Driver> driverList) throws Exception {
        if(!tracks.getDriver().equals("")){
            if(tracks.getStatus().equals("route")){
                throw new Exception("Bus status is already route");


            }else if(tracks.getStatus().equals("repairing")){
                int randomNumber = random.nextInt(100);
                    if(randomNumber%2==0){
                        tracks.setStatus("route");
                        System.out.println("----->Bus:"+tracks.getName()+" status is changes Randomly to route<-----");
                    }else {
                        tracks.setStatus("base");
                        System.out.println("----->Bus:"+tracks.getName()+" status is changes Randomly to base<-----");
                    }


        }else{
                tracks.setStatus("route");
                System.out.println("----->Bus:"+tracks.getName()+" status is changes to route<-----");
            }

        } else{
            throw new Exception("firstly set Driver");
        }
        optins(driverList,tracksList);
    }

    public void optionTree(Tracks tracks,List<Tracks> tracksList,List<Driver> driverList) throws Exception {
        if(tracks.getStatus().equals("repairing") ){
            throw new Exception("Bus is already repairing");
        }else if(tracks.getDriver().equals("")){
            throw new Exception("Firstly Set Drivers");

        }else{
            tracks.setStatus("repairing");
            System.out.println("----->Bus:"+tracks.getName()+" status is changes to repairing<-----");
        }
        optins(driverList,tracksList);

    }



}
