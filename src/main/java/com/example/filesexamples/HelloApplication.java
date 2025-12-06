package com.example.filesexamples;

import com.example.filesexamples.controllers.FIleCRUD;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
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

        fIleCRUD.update(0, "Carlos");
        people = fIleCRUD.read();
        System.out.println("People:" + people);

        fIleCRUD.delete(0);
        people = fIleCRUD.read();
        System.out.println("People:" + people);


    }

    public static void main(String[] args) {
        launch();
    }
}