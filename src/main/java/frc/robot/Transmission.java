package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Transmission {
    private TalonSRX master;
    private TalonSRX slave1;
    private TalonSRX slave2;

    public Transmission(TransmissionSide side) {
        master = new TalonSRX(0);
        slave1 = new TalonSRX(1);
        slave2 = new TalonSRX(2);

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

