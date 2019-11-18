package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Talon;

import java.util.ArrayList;
import java.util.Arrays;

public class Transmission {
    private TalonSRX master, slave1, slave2;
    private ArrayList<TalonSRX> TalonSRXList;
    public Transmission(int masterPort, int slave1Port, int slave2Port, TransmissionSide side){

        master = new TalonSRX(masterPort);
        slave1 = new TalonSRX(slave1Port);
        slave2 = new TalonSRX(slave2Port);

        TalonSRXList.add(master);
        TalonSRXList.add(slave1);
        TalonSRXList.add(slave2);

        slave1.follow(master);
        slave2.follow(master);

        if(side == TransmissionSide.RIGHT){
            master.setInverted(true);
            slave1.setInverted(true);
            slave2.setInverted(true);
        }


    }

    public TalonSRX getMaster() {
        return master;
    }

    public ArrayList getAllMotors() {
        return TalonSRXList;
    }
}
