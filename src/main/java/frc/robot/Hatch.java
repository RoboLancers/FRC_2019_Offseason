package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Hatch extends Subsystem {
    private DoubleSolenoid jawnski;
    private static Hatch hatch;

    public Hatch() {
        jawnski = new DoubleSolenoid(0,0);

    }

    public static synchronized Hatch getInstance() {
        if(hatch == null) {
            hatch = new Hatch();
        }
        return hatch;
    }



    @Override
    protected void initDefaultCommand() {
        new UseHatch();
    }
}
