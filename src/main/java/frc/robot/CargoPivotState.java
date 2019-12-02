package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public enum CargoPivotState {

    down(DoubleSolenoid.Value.kReverse), up(DoubleSolenoid.Value.kForward), neutral(DoubleSolenoid.Value.kOff);

    private DoubleSolenoid.Value value;

    CargoPivotState(DoubleSolenoid.Value value) {
        this.value = value;
    }
    public DoubleSolenoid.Value getValue() {
        return value;
    }
}
