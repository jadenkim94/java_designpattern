package chapter13.before_1.motor;

import chapter13.before_1.VendorId;

public class MotorFactory {

    public static Motor createMotor(VendorId vendorId){
        Motor motor = null;
        switch (vendorId){
            case LG:
                motor = new LGMotor();
                break;
            case HYUNDAI:
                motor = new HyundaiMotor();
                break;
        }
        return motor;
    }

}
