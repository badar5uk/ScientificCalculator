package ScientificCalculator.Entities;

public class PhysicsData extends BaseData{
    private MotionData motionData;
    private Float mass;
    private Float acceleration;

    public MotionData getMotionData() {
        return motionData;
    }

    public void setMotionData(MotionData motionData) {
        this.motionData = motionData;
    }

    public Float getMass() {
        return mass;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }

    public Float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(Float acceleration) {
        this.acceleration = acceleration;
    }
}
