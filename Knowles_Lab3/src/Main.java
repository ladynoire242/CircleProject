import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author Deborah Ronae Knowles
 * @date 03/18/2024
 * @description White circle that turns to black with mouse click
 *              It also moves with arrow keys
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Create UI
        Pane pane = new Pane();
        Circle circle = new Circle(100, 100, 50);
        pane.getChildren().add(circle);

        // Changing the colour of the circle
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        // Listener for the keyboard
        circle.setFocusTraversable(true);

        // Moving the circle using arrow keys
        circle.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.UP) {
                circle.setCenterY(circle.getCenterY() - 10);
            }
            if(e.getCode() == KeyCode.DOWN) {
                circle.setCenterY(circle.getCenterY() + 10);
            }
            if(e.getCode() == KeyCode.LEFT) {
                circle.setCenterX(circle.getCenterX() - 10);
            }
            if(e.getCode() == KeyCode.RIGHT) {
                circle.setCenterX(circle.getCenterX() + 10);
            }
        });

        // Creating the scene
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("Knowles Lab 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }

}
