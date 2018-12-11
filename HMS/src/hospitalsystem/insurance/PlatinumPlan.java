package hospitalsystem.insurance;

public class PlatinumPlan extends HealthInsurancePlan {

    private static final double PLATINUM_COVERAGE = 90;

    public PlatinumPlan(String offeredBy) {
        super(offeredBy, PLATINUM_COVERAGE);
    }
}
