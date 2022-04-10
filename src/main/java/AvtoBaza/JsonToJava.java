package AvtoBaza;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonToJava {
    private static final String  TAG_AVTOBAZA ="avtobaza";
    private static final String  TAG_ID ="id";
    private static final String  TAG_TRACK_NAME ="name";
    private static final String  TAG_DRIVER ="driver";
    private static final String  TAG_STATUS ="status";


    JSONParser parser = new JSONParser();



    public List<Tracks> parsTrack(){

        try(FileReader fileReader = new FileReader("src/avtobaza.json")){
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONArray avtobaza = (JSONArray) jsonObject.get(TAG_AVTOBAZA);
            List<Tracks> tracksList = new ArrayList<>(); // list for Tracks



            for (Object avto: avtobaza) {
                JSONObject object = (JSONObject) avto;


                long idAvto = (long) object.get(TAG_ID);
                String nameTrack = (String) object.get(TAG_TRACK_NAME);
                String driver = (String) object.get(TAG_DRIVER);
                String status = (String) object.get(TAG_STATUS);

                tracksList.add(new Tracks((int)idAvto,nameTrack,driver,status));
                
            }
            //System.out.println(tracksList);
            return tracksList;



        }catch (IOException e){
            System.out.println("IOE"+e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }






    private static final String TAG_DRIVERS="drivers";
    private static final String TAG_NAME="name";
    private static final String TAG_ID_="id";
    private static final String TAG_BUS="bus";


    public List<Driver> parsDriver(){


        try(FileReader fileReader = new FileReader("src/driver.json")){
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONArray drivers = (JSONArray) jsonObject.get(TAG_DRIVERS);

            List<Driver> driversList = new ArrayList<>();

            for (Object driverOBJ : drivers) {
                JSONObject object = (JSONObject) driverOBJ;
                long id = (long) object.get(TAG_ID_);
                String nameDriver = (String) object.get(TAG_NAME);
                String bus = (String) object.get(TAG_BUS);

                driversList.add(new Driver(id,nameDriver,bus));




            }
            return driversList;
            //System.out.println(driversList);



        }catch (IOException e){
            System.out.println("IOE"+e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }

    }




