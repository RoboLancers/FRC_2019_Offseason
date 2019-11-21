package frc.robot.subsystems.drivetrain.commands;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.drivetrain.Drivetrain;

public class UseDrivetrain extends Command {

    public UseDrivetrain(){
        requires(Drivetrain.getInstance());
    }

    @Override
    public void execute(){
    double throttle = OI.getInstance().getXboxController().getY();
    double turn = OI.getInstance().getXboxController().getX();

    double leftPower = (throttle - turn);
    double rightPower = (throttle + turn);

    Drivetrain.getInstance().getRightMaster().set(ControlMode.PercentOutput, rightPower);
    Drivetrain.getInstance().getLeftMaster().set(ControlMode.PercentOutput, leftPower);

    }
    @Override
    protected boolean isFinished() {
        return false;
    }
}
