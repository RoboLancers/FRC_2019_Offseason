package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    private static OI instance;

    private static XboxController xboxController = new XboxController(0);

    public static OI getInstance(){
        if(instance == null){
            instance = new OI();
        }
        return instance;
    }

    public XboxController getXboxController(){
        return xboxController;
    }
}
