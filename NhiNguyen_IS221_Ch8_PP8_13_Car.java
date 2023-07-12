/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch8_PP8_13_Car
   Author:   Nhi Nguyen
   Date:     Mar 29, 2023
   Language: Java
   Purpose:  The purpose of this program is to define a class called Car that 
             extends Group and presents the drawing of a car (side view).
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Mar 29, 2023
   Desc.:    This is the original version of the code.
------------------------------------------------------------------------------
*/

package nhinguyen_is221_ch8_pp8_13;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;

public class NhiNguyen_IS221_Ch8_PP8_13_Car extends Group {
       public NhiNguyen_IS221_Ch8_PP8_13_Car() {
        // Create the car body
        Polygon carbody = new Polygon(100, 500, 100, 350, 300, 200, 700, 200, 
                750, 300, 750, 500);
        carbody.setFill(Color.MAROON);
        carbody.setStroke(Color.BLACK);

        // Create the car windshield
        Polyline windshield = new Polyline(290, 250, 290, 350, 150, 350, 290, 250);
        windshield.setStrokeWidth(2);
        windshield.setFill(Color.GREY);
        
        // Create the car windows
        Rectangle windows = new Rectangle(); 
        windows.setX(320);
        windows.setY(250);
        windows.setWidth(360);
        windows.setHeight(100);
        windows.setFill(Color.ALICEBLUE);
        
        Polyline windowline = new Polyline(500, 250, 500, 350);
        windowline.setStroke(Color.BLACK);
        windowline.setStrokeWidth(2);

        // Create the car wheels
        Circle wheel1 = new Circle(625, 500, 70);
        wheel1.setFill(Color.BLACK);
        Circle wheel2 = new Circle(275, 500, 70);
        wheel2.setFill(Color.BLACK);
        

        // Add all the shapes to the car group
        this.getChildren().addAll(carbody, windows, windshield,  wheel1, wheel2, 
                windowline);
    }
}

