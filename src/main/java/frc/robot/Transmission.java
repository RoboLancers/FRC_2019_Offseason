package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Transmission {
    private TalonSRX master;
    private TalonSRX slave1;
    private TalonSRX slave2;

    public Transmission(TransmissionSide side, int masterPort, int slave1Port, int slave2Port) {
        master = new TalonSRX(masterPort);
        slave1 = new TalonSRX(slave1Port);
        slave2 = new TalonSRX(slave2Port);

        slave1.follow(master);
        slave2.follow(master);

        if(side == TransmissionSide.right) {
            master.setInverted(true);
            slave1.setInverted(true);
            slave2.setInverted(true);
        }
    }

    public TalonSRX getMaster() {
        return master;
    }


}

