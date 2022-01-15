package chapter13.before_1.door;

import chapter13.before_1.VendorId;

public class DoorFactory {

    public static Door createDoor(VendorId vendorId){
        Door door = null;
        switch (vendorId){
            case LG:
                door = new LgDoor();
                break;
            case HYUNDAI:
                door = new HyundaiDoor();
                break;
        }

        return door;
    }

}
