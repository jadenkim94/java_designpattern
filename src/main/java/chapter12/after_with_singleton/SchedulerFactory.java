package chapter12.after_with_singleton;

import java.util.Calendar;

public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyId strategyId){
        ElevatorScheduler scheduler = null;
        switch (strategyId){
            case RESPONSE_TIME:
                scheduler = ResponseTimeScheduler.getInstance();
                break;
            case THROUGHPUT:
                scheduler = ThroughputScheduler.getInstance();
                break;
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12) {
                    scheduler = ResponseTimeScheduler.getInstance();
                } else {
                    scheduler = ThroughputScheduler.getInstance();
                }
                break;
        }
        return scheduler;
    }
}
