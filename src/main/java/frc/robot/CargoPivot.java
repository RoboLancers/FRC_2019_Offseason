package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CargoPivot extends Subsystem {
    private DoubleSolenoid pivot;
    private static CargoPivot cargopivot;
    public CargoPivot(){
        pivot = new DoubleSolenoid(0, 0);



    }
    public static synchronized CargoPivot getInstance(){
        if(cargopivot == null){
            cargopivot = new CargoPivot();
        }
        return cargopivot;
    }

    public DoubleSolenoid getPivot(){ return pivot; }

    @Override
    protected void initDefaultCommand() {

    }
}