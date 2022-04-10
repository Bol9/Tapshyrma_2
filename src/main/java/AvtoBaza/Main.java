package AvtoBaza;




public class Main {
    public static void main(String[] args) throws Exception {
        JsonToJava jsonToJava = new JsonToJava();
        Option option = new Option();
        option.optins(jsonToJava.parsDriver(),jsonToJava.parsTrack());



    }
}
