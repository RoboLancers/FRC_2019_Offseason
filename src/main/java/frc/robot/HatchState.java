package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public enum HatchState {
    DOWN(DoubleSolenoid.Value.kReverse), UP(DoubleSolenoid.Value.kForward);

    private DoubleSolenoid.Value value;

    HatchState(DoubleSolenoid.Value value) {
        this.value = value;
    }
    public DoubleSolenoid.Value getValue() {
        return value;
    }
}
