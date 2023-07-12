/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch8_PP8_13
   Author:   Nhi Nguyen
   Date:     Mar 29, 2023
   Language: Java
   Purpose:  The purpose of this program is to use polygons, polylines, and 
             other shapes to present the car, and write a JavaFX application 
             that displays the car.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Mar 29, 2023
   Desc.:    This is the original version of the code.  
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch8_pp8_13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NhiNguyen_IS221_Ch8_PP8_13 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the car
        Pane root = new Pane();

        // Create a new car
        NhiNguyen_IS221_Ch8_PP8_13_Car car = new NhiNguyen_IS221_Ch8_PP8_13_Car();

        // Add the car to the root pane
        root.getChildren().add(car);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 900, 700);
        primaryStage.setTitle("Car App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }   
    
    public static void main(String[] args) {
        launch(args);
    }

}
