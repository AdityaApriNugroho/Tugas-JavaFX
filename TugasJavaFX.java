package tugasjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TugasJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnRegis = new Button();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6 = new TextField();
        Label firstName = new Label("First Name             ");
        Label lastName = new Label("Last Name             ");
        Label email = new Label("E-Mail Address             ");
        Label contact = new Label("Contact No             ");
        Label pass = new Label("Password             ");
        Label confirmPass = new Label("Confirm Password             ");
        btnRegis.setText("Register");
        btnRegis.setTextFill(Color.WHITE);
        btnRegis.setBackground(new Background(new BackgroundFill(Color.BLUE,null,null)));
        Rectangle rect = new Rectangle(0,0,800,30);
        rect.setFill(Color.BLACK);
        Label title = new Label("Register");
        title.setTextFill(Color.WHITE);
        
        Group root = new Group();
        
        StackPane panel0 = new StackPane();
        panel0.getChildren().add(rect);
        panel0.getChildren().add(title);

        
        HBox panel1 = new HBox();
        panel1.getChildren().add(firstName);
        panel1.getChildren().add(tf1);
        panel1.setLayoutX(200);
        panel1.setLayoutY(40);
        
        HBox panel2 = new HBox();
        panel2.getChildren().add(lastName);
        panel2.getChildren().add(tf2);
        panel2.setLayoutX(200);
        panel2.setLayoutY(90);
        
        HBox panel3 = new HBox();
        panel3.getChildren().add(email);
        panel3.getChildren().add(tf3);
        panel3.setLayoutX(175);
        panel3.setLayoutY(140);
        
        HBox panel4 = new HBox();
        panel4.getChildren().add(contact);
        panel4.getChildren().add(tf4);
        panel4.setLayoutX(195);
        panel4.setLayoutY(190);
        
        HBox panel5 = new HBox();
        panel5.getChildren().add(pass);
        panel5.getChildren().add(tf5);
        panel5.setLayoutX(205);
        panel5.setLayoutY(240);
        
        HBox panel6 = new HBox();
        panel6.getChildren().add(confirmPass);
        panel6.getChildren().add(tf6);
        panel6.setLayoutX(160);
        panel6.setLayoutY(290);
        
        btnRegis.setLayoutX(360);
        btnRegis.setLayoutY(340);

        
        root.getChildren().addAll(panel0,panel1,panel2,panel3,panel4,panel5,panel6,btnRegis);
        Scene scene = new Scene(root, 800, 370);
        
        primaryStage.setTitle("Tugas JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
