import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/*
 *  Purpose:
 *  Manage car services
 *
 *  Oil Change:
 *  I want to change the oil every 555, 1,111, 3,333, 7,777, 9,999, 13,333, 17,777, 19,999.
 */
interface Car {
    int getMileage();
    void setMileage(int Mileage);

    void recordOilChange(int intervalMileage, LocalDate intervalDate, long intervalQuartz);
}

class BaseCar implements Car {
    protected int mileage;
    protected String oilType;
    protected Set<OilChange> oilMaintenance;

    private class OilChange {
        public int intervalMileage;
        LocalDate intervalDate;
        public long intervalQuartz;
        public String intervalOilType;


        public OilChange(int intervalMileage, LocalDate intervalDate, long intervalQuartz) {
            this.intervalMileage = intervalMileage;
            this.intervalDate = intervalDate;
            this.intervalQuartz = intervalQuartz;
            this.intervalOilType = oilType;
        }

        public OilChange(int intervalMileage, LocalDate intervalDate, long intervalQuartz, String intervalOilType) {
            this.intervalMileage = intervalMileage;
            this.intervalDate = intervalDate;
            this.intervalQuartz = intervalQuartz;
            this.intervalOilType = intervalOilType;
        }

        @Override
        public String toString() {
            return "OIL CHANGE" + "\n  Date: " + intervalDate + "\n  Mileage: " + intervalMileage +
                    "\n  Quartz: " + intervalQuartz + "\n  Oil Type: " + intervalOilType;
        }
    }

    public BaseCar() {
        mileage = 0;
        oilMaintenance = new HashSet<>();
    }

    @Override
    public int getMileage() {
        return mileage;
    }

    @Override
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    @Override
    public void recordOilChange(int intervalMileage, LocalDate intervalDate, long intervalQuartz) {
        oilMaintenance.add(new OilChange(intervalMileage, intervalDate, intervalQuartz));
    }

    public void recordOilChange(int intervalMileage, LocalDate intervalDate, long intervalQuartz,
                                String intervalOilType) {
        oilMaintenance.add(new OilChange(intervalMileage, intervalDate, intervalQuartz, intervalOilType));
    }
}

class CadillacCT5VBlackwing extends BaseCar implements Car {



}

public class AutoMaintainer {
    public static void main(String[] args) {

    }
}