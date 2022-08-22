package Pro5_64010683;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        FanPane fanPane = new FanPane();

        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        Button btReverse = new Button("Reverse");
        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btPause, btResume, btReverse);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(fanPane);
        borderPane.setBottom(hBox);

        btPause.setOnAction(e -> {
            fanPane.pause();
        });

        btResume.setOnAction(e -> {
            fanPane.play();
        });

        btReverse.setOnAction(e -> {
            fanPane.reverse();
        });

        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setTitle("Exercise_15_28");
        primaryStage.setScene(scene);
        primaryStage.show();

        fanPane.requestFocus();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}