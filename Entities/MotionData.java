package ScientificCalculator.Entities;

public class MotionData extends BaseData{
    private BaseData baseData;
    private Float initialVelocity;
    private Float acceleration;
    private Float time;

    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }

    public Float getInitialVelocity() {
        return initialVelocity;
    }

    public void setInitialVelocity(Float initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public Float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Float acceleration) {
        this.acceleration = acceleration;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }
}
