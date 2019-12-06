package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    private static OI oi;

     public static OI getInstance() {
        if(oi == null) {
            oi = new OI();
        }
        return oi;
    }

    XboxController xboxController = new XboxController(0);
}
