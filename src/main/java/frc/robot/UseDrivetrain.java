package frc.robot;

import edu.wpi.first.wpilibj.command.Command;

public class UseDrivetrain extends Command {

    public UseDrivetrain(){
        requires(Drivetrain.getInstance());
    }
    public void execute(){

    }
    @Override
    protected boolean isFinished() {
        return false;
    }
}
