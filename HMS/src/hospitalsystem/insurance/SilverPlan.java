package hospitalsystem.insurance;

public class SilverPlan extends HealthInsurancePlan {

    private static final double SILVER_COVERAGE = 60;

    public SilverPlan(String offeredBy) {
        super(offeredBy,SILVER_COVERAGE);
    }
}
