import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();

    private Button btCalculate = new Button("Calculate");
    private Button btClear = new Button("Clear");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");

    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
        gridPane.add(tfAnnualInterestRate, 2, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 2, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(tfLoanAmount, 2, 2);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(tfMonthlyPayment, 2, 3);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 2, 4);
        gridPane.add(btSave, 0, 5);
        gridPane.add(btLoad, 1, 5);
        gridPane.add(btClear, 2, 5);
        gridPane.add(btCalculate, 3, 5);

        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btSave, HPos.LEFT);
        GridPane.setHalignment(btLoad, HPos.LEFT);
        GridPane.setHalignment(btClear, HPos.LEFT);
        GridPane.setHalignment(btCalculate, HPos.LEFT);

        btCalculate.setOnAction(e -> calculateLoanPayment());
        btClear.setOnAction(e -> clearTextField());
        btSave.setOnAction(e -> {
            try {
                saveButton();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        btLoad.setOnAction(e -> {
            try {
                loadButton();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        Scene scene = new Scene(gridPane, 400, 250);
        stage.setResizable(false);
        stage.setTitle("LoanCalculator");
        stage.setScene(scene);
        stage.show();
    }

    private void clearTextField() {
        tfAnnualInterestRate.setText("");
        tfNumberOfYears.setText("");
        tfLoanAmount.setText("");
        tfMonthlyPayment.setText("");
        tfTotalPayment.setText("");
    }

    private void calculateLoanPayment() {
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());
        Loan loan = new Loan(interest, year, loanAmount);
        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }

    private void saveButton() throws IOException {
        try (DataOutputStream output = new DataOutputStream(
                new FileOutputStream("src/loan.dat"));) {
            output.writeUTF(tfAnnualInterestRate.getText());
            output.writeUTF(tfNumberOfYears.getText());
            output.writeUTF(tfLoanAmount.getText());
        }
    }

    private void loadButton() throws IOException {
        try (DataInputStream input = new DataInputStream(
                new FileInputStream("src/loan.dat"));) {
            tfAnnualInterestRate.setText(input.readUTF());
            tfNumberOfYears.setText(input.readUTF());
            tfLoanAmount.setText(input.readUTF());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
