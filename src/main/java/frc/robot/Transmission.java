package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import javax.crypto.KeyGenerator;

public class Transmission {
    private TalonSRX master;
    private TalonSRX follow;
    private TalonSRX follow2;
    private List<TalonSRX> allMotors;

    Transmission(TransmissionSide side, int masterPort, int followPort, int follow2Port){
        master = new TalonSRX(masterPort);
        follow = new TalonSRX(followPort);
        follow2 = new TalonSRX(follow2Port);

        follow.follow(master);
        follow2.follow(master);

        allMotors = Arrays.asList(master, follow, follow2);

        if(side == TransmissionSide.LEFT){
            master.setInverted(true);
            follow.setInverted(true);
            follow2.setInverted(true);
        }else {

        }
    }

    public TalonSRX getMaster(){
        return master;
    }

    public List<TalonSRX> getAllMotors(){
        return allMotors;
    }


}
