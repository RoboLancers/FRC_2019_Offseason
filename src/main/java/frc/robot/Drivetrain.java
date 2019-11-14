package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    private Transmission leftTransmission, rightTransmission;
    private static Drivetrain instance;
    public Drivetrain() {
         leftTransmission = new Transmission(TransmissionSide.LEFT, 0, 1, 2);
         rightTransmission = new Transmission(TransmissionSide.RIGHT, 3, 4, 5);
    }

    public Transmission getLeft(){
        return leftTransmission;
    }

    public Transmission getRight(){
        return rightTransmission;
    }

    public TalonSRX getLeftMaster(){
        return leftTransmission.getMaster();
    }

    public TalonSRX getRightMaster(){
        return rightTransmission.getMaster();
    }

    public static Drivetrain getInstance(){
        if(instance == null){
            instance = new Drivetrain();
        }
        return instance;
    }

    @Override
    protected void initDefaultCommand() {

    }
}
