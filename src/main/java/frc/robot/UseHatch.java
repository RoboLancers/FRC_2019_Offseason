package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class UseHatch extends InstantCommand {
    public UseHatch() {
        requires(Hatch.getInstance());
    }

    @Override
    protected void initialize() {
        boolean down = OI.getXboxController().getBumper(GenericHID.Hand.kRight);
        boolean up = OI.getXboxController().getBumper(GenericHID.Hand.kRight);

    }

    @Override
    protected boolean isFinished() {
        return false;
    }






}
