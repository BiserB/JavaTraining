package hospitalsystem.insurance;

public class GoldPlan extends HealthInsurancePlan {

    private static final double GOLD_COVERAGE = 60;

    public GoldPlan(String offeredBy) {
        super(offeredBy,GOLD_COVERAGE);
    }
}
