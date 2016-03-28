package application;
	

import javafx.application.Application;
import javafx.event.ActionEvent;
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


public class MathApp extends Application {
	
	protected TextField operand1;
	protected TextField operand2;
	protected TextArea result;

	
	
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
	

	
	public Pane buildSpacedGridGui() {
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));
		operand1 = new TextField("Num 1");
		operand2 = new TextField("Num 2");
		pane.add(operand1, 0, 0);
		pane.add(operand2, 0, 1);
		result = new TextArea();
		pane.add(result, 0, 3);
		Button multiply= new Button("Multiply");
	
		multiply.setOnAction(e ->
		{
			multiply(e);
		});
		
		pane.add(multiply, 0, 2);

		return pane;
		}
	
	
		public void multiply (ActionEvent e ){
				
				double op1 = Double.parseDouble(operand1.getText());
				double op2 = Double.parseDouble(operand1.getText());
				result.setText(op1 * op2 + "");

		}


	
	public static void main(String[] args) {
		launch(args);
	}
}