package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CargoPivot extends Subsystem {
    private DoubleSolenoid jawn;
    private static CargoPivot cargoPivot;

    public CargoPivot() {
        jawn = new DoubleSolenoid(0, 0);
    }

    public static synchronized CargoPivot getInstance() {
        if (cargoPivot == null) {
            cargoPivot = new CargoPivot();
        }
        return cargoPivot;

    }

    @Override
    protected void initDefaultCommand() {
        new UseCargoPivot();
    }
}

