package chapter13.after.elevatorfactory;

import chapter13.after.VendorId;

public class ElevatorFactoryFactory {
    public static ElevatorFactory getFactory(VendorId vendorId){
        ElevatorFactory elevatorFactory = null;
        switch (vendorId){
            case LG:
                elevatorFactory = new LgElevatorFactory();
                break;
            case HYUNDAI:
                elevatorFactory = new HyundaiElevatorFactory();
                break;
        }
        return elevatorFactory;
    }
}
