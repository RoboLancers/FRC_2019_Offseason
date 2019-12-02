package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    private Transmission left, right;
    private static Drivetrain drivetrain;

    private Drivetrain() {
        left = new Transmission(TransmissionSide.left, 0, 1, 2);
        right = new Transmission(TransmissionSide.right, 0, 1, 2);
    }

    public static synchronized Drivetrain getInstance() {
        if (drivetrain == null) {
            drivetrain = new Drivetrain();
        }
        return drivetrain;
    }

    public Transmission getLeftTransmission() {
        return left;
    }

    public Transmission getRightTransmission() {
        return right;
    }

    public TalonSRX getLeftMasterMotor() {
        return left.getMaster();
    }

    public TalonSRX getRightMasterMotor() {
        return right.getMaster();
    }


    @Override
    protected void initDefaultCommand() {
            new UseDrivetrain();
    }
}
