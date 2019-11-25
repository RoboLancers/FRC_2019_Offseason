package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    private Transmission left, right;
    private static Drivetrain drivetrain;

    public Drivetrain() {
        left = new Transmission(0, 1, 2, TransmissionSide.LEFT);
        right = new Transmission(0, 1, 2, TransmissionSide.RIGHT);
    }

    public static synchronized Drivetrain getInstance() {
        if (drivetrain == null) {
            drivetrain = new Drivetrain();
        }
        return drivetrain;
    }

    public Transmission getLeft() {
        return left;
    }

    public Transmission getRight() {
        return right;
    }

    public TalonSRX getRightMaster(){
        return right.getMaster();
    }

    public TalonSRX getLeftMaster(){
        return left.getMaster();
    }
    @Override
    protected void initDefaultCommand() {

    }
}
