package com.practice.saferoom;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController implements Initializable {

    @FXML
    private JFXTextField inpEmail;

    @FXML
    private JFXPasswordField inpPassword;

    @FXML
    private JFXButton btnLogin;

    @FXML
    private JFXButton btnExit;

    @FXML
    private RadioButton rbStudent;

    @FXML
    private RadioButton rbAdmin;

    @FXML
    private ToggleGroup tgUser;

    @FXML
    private Label lblWarning;

    @FXML
    private JFXButton btnLogout;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

    @FXML
    public void handleLogin(ActionEvent actionEvent) {
        if (btnLogin.isArmed()) {
            try {
                //System.out.println(inpName.getText());
                System.out.println(inpEmail.getText());
                System.out.println(inpPassword.getText());

                //System.out.println(rStudent.getText());

                if(rbStudent.isSelected()) {
                    System.out.println("Student Landing Page");

                    //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("StudentLP.fxml"));
                    Parent root = FXMLLoader.load(getClass().getResource("StudentLP.fxml"));
                    Scene scene = new Scene(root);
                    Stage primaryStage = new Stage();
                    primaryStage.initStyle(StageStyle.TRANSPARENT);
                    primaryStage.getIcons().add(new Image("icon1.png"));
                    primaryStage.setScene(scene);
                    primaryStage.show();
                    //handleExit();
                    //scene.setFill(Color.TRANSPARENT);
                }
                else if(rbAdmin.isSelected()) {
                    System.out.println("Admin Landing Page");

                    Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Login.fxml"));
                    Scene scene = new Scene(root);
                    Stage primaryStage = new Stage();
                    primaryStage.initStyle(StageStyle.TRANSPARENT);
                    primaryStage.getIcons().add(new Image("icon1.png"));
                    primaryStage.setScene(scene);
                    primaryStage.show();
                    scene.setFill(Color.TRANSPARENT);
                }
                //Parent root = FXMLLoader.load(getClass().getResource("Login1.fxml"));

                //Stage primaryStage = new Stage();
                //primaryStage.setTitle("Tic Tac Toe");
                //primaryStage.getIcons().add(new Image("icon1.png"));
                //primaryStage.initStyle(StageStyle.UNDECORATED);
                //primaryStage.setScene(new Scene(root, 550, 600));
                //primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (btnExit.isArmed()) { handleExit(); }

    }

    @FXML
    public void handleLogout(ActionEvent actionEvent) {
        if(btnLogout.isArmed()) {
            stage = (Stage) btnLogout.getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    Stage stage;

    @FXML
    public void handleExit () {
        stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}
