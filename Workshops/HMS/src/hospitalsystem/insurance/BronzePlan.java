package hospitalsystem.insurance;

public class BronzePlan extends HealthInsurancePlan {

    private static final double BRONZE_COVERAGE = 60;

    public BronzePlan(String offeredBy) {
        super(offeredBy, BRONZE_COVERAGE);
    }
}
