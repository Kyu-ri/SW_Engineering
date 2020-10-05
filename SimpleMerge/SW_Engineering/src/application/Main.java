package application;
	
import java.util.*; //For ArrayList, etc...
import java.io.*; //input/output
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root= FXMLLoader.load(getClass().getResource("SimpleMerge2.fxml"));//fxml���Ͽ��� ������ �޾ƿ�
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Simple Merge");//Title
		primaryStage.show();// �� �ڵ尡 �־�� GUI����
		primaryStage.setResizable(true);
}
	
	public static void main(String[] args) throws IOException {
		
	    /*Start GUI*/
		launch(args);
	}
}
