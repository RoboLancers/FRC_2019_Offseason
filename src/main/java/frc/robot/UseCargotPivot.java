package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class UseCargotPivot extends InstantCommand {
    public UseCargotPivot(){ requires(CargoPivot.getInstance());}

    protected void initialize(){
        up = XboxController
    }

}
