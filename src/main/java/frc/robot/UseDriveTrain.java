package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class UseDriveTrain extends Command {

    public UseDriveTrain (){
        requires(DriveTrain.getInstance());
    }

    protected void execute(){
        double throttle = OI.getInstance().xboxController.getY(GenericHID.Hand.kLeft);
        double turn = OI.getInstance().xboxController.getX(GenericHID.Hand.kRight);

        double leftPower =  throttle + -turn;
        double rightPower = throttle + turn;

        DriveTrain.getInstance().getMasterRight().set(ControlMode.PercentOutput,rightPower);
        DriveTrain.getInstance().getMasterLeft().set(ControlMode.PercentOutput,leftPower);

    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
