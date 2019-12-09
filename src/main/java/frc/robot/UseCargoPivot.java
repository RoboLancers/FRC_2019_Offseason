package frc.robot;

import edu.wpi.first.wpilibj.command.Command;

public class UseCargoPivot extends Command {

    public UseCargoPivot (){
        requires(CargoPivot.getInstance());
    }

    public void initialize(){
        if(CargoPivot.getInstance().getDoubleSolenoidValue() == CargoPivotState.UP){
            CargoPivot.getInstance().setDoubleSolenoidValue(CargoPivotState.DOWN);
        }else{
            CargoPivot.getInstance().setDoubleSolenoidValue(CargoPivotState.DOWN);
        }
    }
    @Override
    protected boolean isFinished() {
        return false;
    }
}
