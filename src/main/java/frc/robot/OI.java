package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    public static OI oi;
    private static XboxController xboxController = new XboxController(0);


    public static XboxController getXboxController(){ return xboxController; }

}
