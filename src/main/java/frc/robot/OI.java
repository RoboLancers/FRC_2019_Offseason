package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    private static OI oi;
    public XboxController xboxController = new XboxController(0);



    public static OI getInstance() {
        if(oi == null) {
            oi = new OI();
        }
        return oi;
    }
}
