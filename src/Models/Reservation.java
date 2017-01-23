package Models;

import javafx.scene.paint.Color;


/**
 * Created by Jelmer on 23-Jan-17.
 */
public class Reservation extends Car {
    private static final Color COLOR = Color.BLACK;

    public Reservation() {

        int stayMinutes = (200);
        this.setMinutesLeft(stayMinutes);
        this.setHasToPay(false);
    }

    public Color getColor() {return COLOR;}
}