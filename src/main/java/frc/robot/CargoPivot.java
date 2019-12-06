package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

        public class CargoPivot extends Subsystem {
            public static CargoPivot cargoPivot;
            private static DoubleSolenoid soloenoid;
            private static CargoPivotState values;

            public CargoPivot() {
                soloenoid = new DoubleSolenoid(0, 1);
                values = CargoPivotState.NEUTRAL;
            }

            public CargoPivotState getDoubleSolenoidValue() {
                return values;
            }

            public void setDoubleSolenoidValue(CargoPivotState value) {
                soloenoid.set(value.getValue());
                values = value;
            }

            public static CargoPivot getInstance(){
                if(cargoPivot == null){
                    cargoPivot = new CargoPivot();
                }
                return cargoPivot;
            }

            @Override
            protected void initDefaultCommand() {

            }
        }