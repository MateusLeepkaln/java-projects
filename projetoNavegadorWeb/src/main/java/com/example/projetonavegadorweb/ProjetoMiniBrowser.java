package com.example.projetonavegadorweb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

import javafx.scene.web.WebEngine;

public class ProjetoMiniBrowser extends Application {

    @Override
    public void start(Stage palco) throws Exception {
        TextField campoUrl = new TextField();
        WebView navegdor = new WebView();
        WebEngine motor = navegador.getEngine();

        campoUrl.setOnAciton(evento -> motor.load( campoUrl.getText() ) );

        VBox vbox = new VBox();
        vbox.getChildren().addAll(campoUrl, navegador);

    }
}