package frc.robot.subsystems.cargo.commands;

import com.sun.jdi.Value;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.OI;
import frc.robot.enums.CargoPivotState;
import frc.robot.subsystems.cargo.CargoPivot;

import javax.sql.rowset.CachedRowSet;

public class useCargoPivot extends InstantCommand {
    public useCargoPivot() {
        requires(CargoPivot.getInstance());
    }

    @Override
    public void initialize() {
        if(CargoPivot.getInstance().getDoubleSolenoidState() == CargoPivotState.UP){
            CargoPivot.getInstance().setDoubleSolenoidState(CargoPivotState.DOWN);
        }else{
            CargoPivot.getInstance().setDoubleSolenoidState(CargoPivotState.UP);
        }

    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
