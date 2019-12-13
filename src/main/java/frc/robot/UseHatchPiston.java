package frc.robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class UseHatchPiston extends InstantCommand {

    public UseHatchPiston() {
        requires(HatchPiston.getInstance());
    }

    @Override
    protected void initialize() {
        boolean out =
    }
}
