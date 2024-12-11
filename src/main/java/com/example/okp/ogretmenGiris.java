package com.example.okp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ogretmenGiris {

    @FXML
    private ImageView geriGel;

    @FXML
    private TextField kullaniciAdTF;

    @FXML
    private Button ogretmenGirisYapButton;

    @FXML
    private PasswordField sifrePF;

    @FXML
    void ogretmenGirisYapButton(ActionEvent event) {

    }

    @FXML
    void oncekineGeriDon(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("anaEkran.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) geriGel.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Online Kurs Platformu");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}