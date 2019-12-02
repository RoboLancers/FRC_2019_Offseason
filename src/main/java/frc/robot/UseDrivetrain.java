package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;

public class UseDrivetrain extends Command {

    public UseDrivetrain() {
        requires(Drivetrain.getInstance());
    }


    @Override
    protected void execute() {
        double throttle = OI.getXboxController().getX(GenericHID.Hand.kLeft);
        double turn = OI.getXboxController().getX(GenericHID.Hand.kRight);

        Drivetrain.getInstance().getLeftMasterMotor().set(ControlMode.PercentOutput, throttle + turn);
        Drivetrain.getInstance().getRightMasterMotor().set(ControlMode.PercentOutput, throttle - turn);


    }
    @Override
    protected boolean isFinished() {
        return false;
    }
}
