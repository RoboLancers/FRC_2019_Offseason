package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HatchPiston extends Subsystem {
    private DoubleSolenoid hatchpiston;
    private static HatchPiston hatchPiston;

    public HatchPiston() {
        hatchpiston = new DoubleSolenoid(1,1,1);

    }

    public static synchronized HatchPiston getInstance() {
        if(hatchPiston == null) {
            hatchPiston = new HatchPiston();

        }
        return hatchPiston;
    }


    @Override
    protected void initDefaultCommand() {

    }
}
