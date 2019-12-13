package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public enum   CargoPivotState {
    UP(DoubleSolenoid.Value.kForward), DOWN(DoubleSolenoid.Value.kReverse), NEUTRAL(DoubleSolenoid.Value.kOff);

}
