package ScientificCalculator.Entities;

public class InterestData extends BaseData {
    PhysicsData physicsData;
    Float principal;
    Float rate;
    Float time;

    public PhysicsData getPhysicsData() {
        return physicsData;
    }

    public void setPhysicsData(PhysicsData physicsData) {
        this.physicsData = physicsData;
    }

    public Float getPrincipal() {
        return principal;
    }

    public void setPrincipal(Float principal) {
        this.principal = principal;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }
}
