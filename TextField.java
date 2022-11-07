import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.*;
public class TextField_4 extends Application {
  
    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("creating textfield");
  
        // create a textfield
        TextField b = new TextField("initial text");
  
        // set alignment of text
        b.setAlignment(Pos.CENTER);
  
        // create a tile pane
        TilePane r = new TilePane();
  
        // create a label
        Label l = new Label("no text");
  
        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l.setText(b.getText());
            }
        };
  
        // when enter is pressed
        b.setOnAction(event);
  
        // add textfield
        r.getChildren().add(b);
        r.getChildren().add(l);
  
        // create a scene
        Scene sc = new Scene(r, 200, 200);
  
        // set the scene
        s.setScene(sc);
  
        s.show();
    }
  
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
