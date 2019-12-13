package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public enum HatchPistonState {
    in(DoubleSolenoid.Value.kReverse), out(DoubleSolenoid.Value.kForward);

    private DoubleSolenoid value;

    HatchPistonState(DoubleSolenoid.Value value) {
        this.value = value;
    }
    public DoubleSolenoid.Value getValue() {
        return value;
    }
}
