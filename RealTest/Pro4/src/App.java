import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + ":" + clock.getMinute()
                + ":" + clock.getSecond();
        clock.setHourHandVisible(true);
        clock.setMinuteHandVisible(true);
        clock.setSecondHandVisible(true);
        Label time = new Label(timeString);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        // pane.setBottom(time);
        BorderPane.setAlignment(time, Pos.TOP_CENTER);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("ClockAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}