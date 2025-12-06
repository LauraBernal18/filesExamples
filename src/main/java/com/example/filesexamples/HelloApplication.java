package com.example.filesexamples;

import com.example.filesexamples.controllers.FIleCRUD;
import com.example.filesexamples.models.Person;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        String filePath = "src/main/resources/com/example/filesexamples/person.txt";
        System.out.println("Loading file:" + filePath);
        FIleCRUD fIleCRUD = new FIleCRUD(filePath);
        //fIleCRUD.create("Sebastian");
        //fIleCRUD.create("Juan");
        //fIleCRUD.create("Felipe");

        ArrayList<String> people = fIleCRUD.read();
        System.out.println("People:" + people);

        fIleCRUD.update(1, "Carlos");
        people = fIleCRUD.read();
        System.out.println("People:" + people);

        fIleCRUD.delete(4);
        people = fIleCRUD.read();
        System.out.println("People:" + people);

        /*
        Person p1 = new person();
        Person p2 = new person();
        Person p1 = new person();
        */

        Person p1 = new Person(22,"Juan","Palmira");
        Person p2 = new Person(23,"Juanf","Palmiraa");



        String filePSerializaable ="src/main/resources/com/example/filesexamples/person.txt";
        /*FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.writeObject(p2);
        oss.close;
       */

        FileInputStream fis = new FileInputStream(filePSerializaable);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
            Person inputP1 = (Person) ois.readObject();
            System.out.println(inputP1);
            Person inputP2 = (Person) ois.readObject();
            System.out.println(inputP2);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}