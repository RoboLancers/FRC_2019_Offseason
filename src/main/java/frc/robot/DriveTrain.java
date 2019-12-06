package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
    private Transmission left, right;

    private static DriveTrain driveTrain;

    public DriveTrain() {
        left = new Transmission(TransmissionSide.LEFT, 0, 1, 2);
        right = new Transmission(TransmissionSide.RIGHT, 0, 1, 2);
    }


    public static DriveTrain getInstance() {
        if (driveTrain == null) {
            driveTrain = new DriveTrain();
        }

        return driveTrain;
    }

    public Transmission getTransmissionLeft() {
        return left;
    }

    public TalonSRX getMasterLeft() {
        return left.getMaster();
    }

    public Transmission getTransmissionRight() {
        return right;
    }

    public TalonSRX getMasterRight() {
        return right.getMaster();
    }

    @Override
    protected void initDefaultCommand() {

    }

}

