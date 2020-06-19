package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class Main extends Application {
	@Override
	int cat1Score = 0;
	int cat2Score = 0;
	String cat1 = "Java Team";
	String cat2 = "SQL Team";

	public void start(Stage primaryStage) {
		Label cat1Lbl = new Label(cat1);
		cat1Lbl.setLayoutX(110);
		cat1Lbl.setLayoutY(10);
		cat1Lbl.setTextFill(Color.red);

		Label score1Lbl = new Label("" + cat1Score);
		score1Lbl.setLayoutX(130);
		score1Lbl.setLayoutY(40);
		score1Lbl.setTextFill(Color.RED);

		Button cat1Btn = new Button("Vote " + cat1);
		cat1Btn.setLayoutX(90);
		cat1Btn.setLayoutY(80);

		cat1Btn.setOnAction((ActionEvent event) -> {
			cat1Score++;
			score1Lbl.setText("" + cat1Score);
		});// 4 -g
			//////////////////////////////////////////////////////////https://openjfx.io/openjfx-docs/#install-javafx
		Label cat2Lbl = new Label(cat2);
		cat2Lbl.setLayoutX(230);
		cat2Lbl.setLayoutY(10);
		cat2Lbl.setTextFill(Color.blue);

		Label score2Lbl = new Label("" + cat2Score);
		score2Lbl.setLayoutX(250);
		score2Lbl.setLayoutY(40);
		score2Lbl.setTextFill(Color.BLUE);

		Button cat2Btn = new Button("Vote " + cat2);
		cat2Btn.setLayoutX(210);
		cat2Btn.setLayoutY(80);

		cat2Btn.setOnAction((ActionEvent event) -> {
			cat2Score++;
			score2Lbl.setText("" + cat2Score);
		});// 4 -g

		try {
			Group root = new Group();
			root.getChildren().add(cat1Lbl);
			root.getChildren().add(score1Lbl);
			root.getChildren().add(cat1Btn);

			Scene scene = new Scene(root, 300, 150);
			primaryStage.setTitle("Voting Panel!");
			primaryStage.setMinWidth(scene.getWidth());
			primaryStage.setMinHeight(scene.getHeight());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}