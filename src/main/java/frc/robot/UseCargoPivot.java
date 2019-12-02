package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;

public class UseCargoPivot extends InstantCommand {

    public UseCargoPivot() {
        requires(CargoPivot.getInstance());
    }

    @Override
    protected void initialize() {
        boolean up = OI.getXboxController().getAButton();
        boolean down = OI.getXboxController().getBButton();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
