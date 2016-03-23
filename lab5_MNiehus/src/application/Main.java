package application;
	

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	protected TextField txfName;
	protected Button btnHelloWorld;
	protected TextArea txaMessage;
	
	
	public void start(Stage primaryStage) {
		try {
			Pane root = buildSpacedGridGui();
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	public Pane buildBorderGui() {
		BorderPane pane = new BorderPane();
		txfName = new TextField("Type your name");
		pane.setTop(txfName);
		Button btnHelloWorld = new Button("Hello World");
		pane.setCenter(btnHelloWorld);
		txaMessage = new TextArea();
		pane.setBottom(txaMessage);
		return pane;
		}
	
	public Pane buildFlowGui() {
		FlowPane pane = new FlowPane();
		txfName = new TextField("Type your name");
		pane.getChildren().add(txfName);
		Button btnHelloWorld = new Button("Hello World");
		pane.getChildren().add(btnHelloWorld);
		txaMessage = new TextArea();
		pane.getChildren().add(txaMessage);
		return pane;
		}
	
	public Pane buildGridGui() {
		GridPane pane = new GridPane();
		txfName = new TextField("Type your name");
		pane.add(txfName, 0, 0);
		Button btnHelloWorld = new Button("Hello World");
		pane.add(btnHelloWorld, 1, 1);
		txaMessage = new TextArea();
		pane.add(txaMessage, 0, 2);
		return pane;
		}
	
	public Pane buildVBoxGui() {
		VBox pane = new VBox();
		txfName = new TextField("Type your name");
		pane.getChildren().add(txfName);
		Button btnHelloWorld = new Button("Hello World");
		pane.getChildren().add(btnHelloWorld);
		txaMessage = new TextArea();
		pane.getChildren().add(txaMessage);
		return pane;
		}
	
	public Pane buildNestedGui() {
		HBox pane = new HBox();
		Pane left = buildVBoxGui();
		Pane right = buildFlowGui();
		pane.getChildren().addAll(left, right);
		return pane;
		}
	
	public Pane buildSpacedGridGui() {
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));
		txfName = new TextField("Type your name");
		pane.add(txfName, 0, 0);
		Button btnHelloWorld = new Button("Hello World");
		btnHelloWorld.setOnAction(e ->
			{	
				String name = txfName.getText();
				txaMessage.setText(name + ", HelloWorld!");
			}
		);
		GridPane.setMargin(btnHelloWorld, new Insets(0, 0, 0, 50));
		pane.add(btnHelloWorld, 0, 1);
		txaMessage = new TextArea();
		pane.add(txaMessage, 0, 2);
		return pane;
		}


	
	public static void main(String[] args) {
		launch(args);
	}
}
