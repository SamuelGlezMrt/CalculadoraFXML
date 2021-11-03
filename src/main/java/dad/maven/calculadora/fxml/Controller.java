package dad.maven.calculadora.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	@FXML
	private GridPane view;

	@FXML
	private TextField resulText;

	@FXML
	private Button sieteButton;

	@FXML
	private Button ochoButton;

	@FXML
	private Button nueveButton;

	@FXML
	private Button borrarButton;

	@FXML
	private Button borrarTodoButton;

	@FXML
	private Button cuatroButton;

	@FXML
	private Button cincoButton;

	@FXML
	private Button seisButton;

	@FXML
	private Button multButton;

	@FXML
	private Button divButton;

	@FXML
	private Button unoButton;

	@FXML
	private Button dosButton;

	@FXML
	private Button tresButton;

	@FXML
	private Button menosButton;

	@FXML
	private Button puntoButton;

	@FXML
	private Button masButton;

	@FXML
	private Button ceroButton;

	@FXML
	private Button igualButton;

	Calculadora calculator = new Calculadora();

	public Controller() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		resulText.textProperty().bind(calculator.pantallaProperty());
	}

	public GridPane getView() {
		return view;
	}

	public Calculadora getModel() {
		return calculator;
	}

	@FXML
	void onSieteButtonAction(ActionEvent e) {
		calculator.insertar('7');

	}

	@FXML
	void onOchoButtonAction(ActionEvent e) {
		calculator.insertar('8');

	}

	@FXML
	void onNueveButtonAction(ActionEvent e) {
		calculator.insertar('9');

	}

	@FXML
	void onBorrarButtonAction(ActionEvent e) {
		calculator.borrar();
	}

	@FXML
	void onBorrarTodoButtonAction(ActionEvent e) {
		calculator.borrarTodo();
	}

	@FXML
	void onCuatroButtonAction(ActionEvent e) {
		calculator.insertar('4');

	}

	@FXML
	void onCincoButtonAction(ActionEvent e) {
		calculator.insertar('5');

	}

	@FXML
	void onSeisButtonAction(ActionEvent e) {
		calculator.insertar('6');

	}

	@FXML
	void onMultyButtonAction(ActionEvent e) {
		calculator.operar(Calculadora.MULTIPLICAR);
	}

	@FXML
	void onDividirButtonAction(ActionEvent e) {
		calculator.operar(Calculadora.DIVIDIR);
	}

	@FXML
	void onUnoButtonAction(ActionEvent e) {
		calculator.insertar('1');

	}

	@FXML
	void onDosButtonAction(ActionEvent e) {
		calculator.insertar('2');

	}

	@FXML
	void onTresButtonAction(ActionEvent e) {
		calculator.insertar('3');

	}

	@FXML
	void onMenosButtonAction(ActionEvent e) {
		calculator.operar(Calculadora.RESTAR);
	}

	@FXML
	void onPuntoButtonAction(ActionEvent e) {
		calculator.insertarComa();
	}

	@FXML
	void onMasButtonAction(ActionEvent e) {
		calculator.operar(Calculadora.SUMAR);
	}

	@FXML
	void onCeroButtonAction(ActionEvent e) {
		calculator.insertar('0');

	}

	@FXML
	void onIgualButtonAction(ActionEvent e) {
		calculator.operar(Calculadora.IGUAL);
	}
}
