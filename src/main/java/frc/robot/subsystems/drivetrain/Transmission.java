package frc.robot.subsystems.drivetrain;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.enums.TransmissionSide;

import java.util.ArrayList;

//this is the transmission
public class Transmission {
    private TalonSRX master, slave1, slave2;
    private ArrayList<TalonSRX> TalonSRXList;

    public Transmission(TransmissionSide side, int masterPortNum, int slave1PortNum, int slave2PortNum) {


        master = new TalonSRX(masterPortNum);
        slave1 = new TalonSRX(slave1PortNum);
        slave2 = new TalonSRX(slave2PortNum);


        slave1.follow(master);
        slave2.follow(master);

        if (side == TransmissionSide.LEFT) {
            slave1.setInverted(true);
            slave2.setInverted(true);
            master.setInverted(true);
        }
        TalonSRXList.add(master);
        TalonSRXList.add(slave1);
        TalonSRXList.add(slave2);
    }

    public TalonSRX getMaster() {
        return master;

    }

    public ArrayList<TalonSRX> getAll() {
        return TalonSRXList;
    }
}
