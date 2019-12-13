package frc.robot.subsystems.cargo;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.enums.CargoPivotState;

public class CargoPivot extends Subsystem {
    private static CargoPivot instance;
    private static DoubleSolenoid doubleSolenoid;
    private static CargoPivotState pivotstate;
    public CargoPivot() {
        doubleSolenoid = new DoubleSolenoid(0, 1);
        pivotstate = CargoPivotState.NEUTRAL;
    }

    public void setDoubleSolenoidState(CargoPivotState state) {
        doubleSolenoid.set(state.getValue());
        pivotstate = state;
    }

    public CargoPivotState getDoubleSolenoidState(){
        return pivotstate;
    }

    public static CargoPivot getInstance() {
        if (instance == null) {
            instance = new CargoPivot();
        }
        return instance;
    }

    @Override
    protected void initDefaultCommand() {

    }
}
