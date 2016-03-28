//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 6
//Due Date: 3/29/16
//************************
package application;
	
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	protected TextField operand1, operand2;
	protected TextArea result;
	protected Button butFactorial, butAdd, butSubtract, butMultiply, butDivide, butLoad, butExp, 
					 butSin, butCos, butTan, butClear;
					
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = buildNestedGui();
			Scene scene = new Scene(root,600,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("My Little Calculator_v1.0.0 | Programmed by: Morgan Niehus");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Pane buildNestedGui(){
		VBox VBoxShape = new VBox();
		VBoxShape.setSpacing(25);
		VBoxShape.setPadding(new Insets(25, 25, 25, 25));
		
		Label lbl1 = new Label("Operand 1");
		Label lbl2 = new Label("Operand 2");
		VBoxShape.getChildren().addAll(lbl1, lbl2);
		
		GridPane gridPane = new GridPane();
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		gridPane.setPadding(new Insets(25, 25, 25, 25));
		
		Label ruleLbl = new Label("special -->");
		gridPane.add(ruleLbl, 0, 0);
		operand1 = new TextField();
		gridPane.add(operand1, 1, 0);
		operand2 = new TextField();
		gridPane.add(operand2, 1, 1);
		
		HBox topRow = new HBox();
		topRow.setAlignment(Pos.CENTER);
		topRow.getChildren().addAll(VBoxShape, gridPane);
		
		HBox buttonRow = new HBox();
		buttonRow.setSpacing(5);
		buttonRow.setAlignment(Pos.CENTER);
		butFactorial = new Button("!");
		butFactorial.setOnAction(e -> {factorial(e);});
		butAdd = new Button("Add");
		butAdd.setOnAction(e -> {add(e);});
		butSubtract = new Button("Subtract");
		butSubtract.setOnAction(e -> {subtract(e);});
		butMultiply = new Button("Multiply");
		butMultiply.setOnAction(e -> {multiply(e);});
		butDivide = new Button("Divide");
		butDivide.setOnAction(e -> {divide(e);});
		butLoad = new Button("Load");
		butLoad.setOnAction(e -> {load(e);});
		butExp = new Button("Exp");
		butExp.setOnAction(e -> {exp(e);});
		butSin = new Button("Sin");
		butSin.setOnAction(e -> {sin(e);});
		butCos = new Button("Cos");
		butCos.setOnAction(e -> {cos(e);});
		butTan = new Button("Tan");
		butTan.setOnAction(e -> {tan(e);});
		butClear = new Button("Clear");
		butClear.setOnAction(e -> {clear(e);});
		buttonRow.getChildren().addAll(butFactorial, butAdd, butSubtract, butMultiply, butDivide,
									   butLoad, butExp, butSin, butCos, butTan, butClear);
		
		HBox tRow = new HBox();
		tRow.setAlignment(Pos.CENTER);
		Label resultlbl = new Label("Result -->");
		result = new TextArea();
		result.setEditable(false);
		result.setPrefColumnCount(40);
		result.setPrefRowCount(10);
		tRow.setMargin(result, new Insets(20, 0, 0, 0));
		tRow.getChildren().addAll(resultlbl, result);
		
		Pane pane = new VBox();
		VBox.setMargin(topRow, new Insets(20, 0, 0, 0));
		VBox.setMargin(buttonRow, new Insets(20, 0, 0, 0));
		pane.getChildren().addAll(topRow, buttonRow, tRow);
		
		
		return pane;
	}
	
	private void factorial(ActionEvent e){
		try{
		int op1 = Integer.parseInt(operand1.getText());
		
		double x, fact = 1;
		
		for( x = op1; x > 1; x--){
			fact *= x;
		}
		result.setText(fact + "");
		}
		catch(Exception ex){
			result.setText("Must be a whole number");
		}
	
	}
	
	private void add(ActionEvent e){
		try{
		double op1 = Double.parseDouble(operand1.getText());
		double op2 = Double.parseDouble(operand2.getText());
		
		result.setText(op1 + op2 + "");
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void subtract(ActionEvent e){
		try{
		double op1 = Double.parseDouble(operand1.getText());
		double op2 = Double.parseDouble(operand2.getText());
		
		result.setText(op1 - op2 + "");
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void multiply(ActionEvent e){
		try{
		double op1 = Double.parseDouble(operand1.getText());
		double op2 = Double.parseDouble(operand2.getText());
		
		result.setText(op1 * op2 + "");
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void divide(ActionEvent e){
		try{
		double op1 = Double.parseDouble(operand1.getText());
		double op2 = Double.parseDouble(operand2.getText());
		
		if(op2 == 0){
			throw new Exception();
		}
		
		result.setText(op1 / op2 + "");
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void load(ActionEvent e){
		try{	
			double toLoad = Double.parseDouble(result.getText());
			operand1.setText(toLoad+"");
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}

	}
	
	private void exp(ActionEvent e){
		try{
			double op1 = Double.parseDouble(operand1.getText());
			double op2 = Double.parseDouble(operand2.getText());
			
			result.setText(Math.pow(op1, op2) + "");
			
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void sin(ActionEvent e){
		try{
			int op1 = Integer.parseInt(operand1.getText());
			NumberFormat fmt = new DecimalFormat("#0.00");
			
			double radianOp = Math.toRadians(op1);
			
			double numResult = Math.sin(radianOp);
			
			result.setText(fmt.format(numResult) + "");
			
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void cos(ActionEvent e){
		try{
			int op1 = Integer.parseInt(operand1.getText());
			NumberFormat fmt = new DecimalFormat("#0.00");
			
			double radianOp = Math.toRadians(op1);
			
			double numResult = Math.cos(radianOp);
			
			result.setText(fmt.format(numResult) + "");
			
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void tan(ActionEvent e){
		try{
			int op1 = Integer.parseInt(operand1.getText());
			NumberFormat fmt = new DecimalFormat("#0.00");
			
			double radianOp = Math.toRadians(op1);
			
			double numResult = Math.tan(radianOp);
			
			result.setText(fmt.format(numResult) + "");
			
		}
		catch(Exception ex){
			result.setText("Error, check input");
		}
	}
	
	private void clear(ActionEvent e){
		operand1.clear();
		operand2.clear();
		result.setText(null);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
