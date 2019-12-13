package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class UseDrivetrain extends Command {

    public UseDrivetrain(){
        requires(Drivetrain.getInstance());
    }

    @Override
    protected void execute(){
        double throttle = OI.getXboxController().getY(GenericHID.Hand.kLeft);
        double rotate = OI.getXboxController().getX(GenericHID.Hand.kRight);

        Drivetrain.getInstance().getLeftMaster().set(ControlMode.PercentOutput, throttle + rotate);
        Drivetrain.getInstance().getRightMaster().set(ControlMode.PercentOutput, throttle - rotate);
    }
    @Override
    protected boolean isFinished() {
        return false;
    }
}
