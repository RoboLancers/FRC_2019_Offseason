package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public enum CargoPivotState {
    UP(DoubleSolenoid.Value.kForward), DOWN(DoubleSolenoid.Value.kReverse), NEUTRAL(DoubleSolenoid.Value.kOff);

    private DoubleSolenoid.Value value;

    CargoPivotState(DoubleSolenoid.Value value){
        this.value = value;
    }

    public DoubleSolenoid.Value getValue(){
        return value;
    }
}
