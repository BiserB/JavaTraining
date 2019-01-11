package hospitalsystem.insurance;

public class HealthInsurancePlan {

    private static final double MIN_COVERAGE = 50;
    private static final double MAX_COVERAGE = 100;
    private String offeredBy;
    private double coveragePercent;

    public HealthInsurancePlan(String offeredBy, double percent){
        setOfferedBy(offeredBy);
        this.setCoveragePercent(percent);
    }

    private void setCoveragePercent() {
    }

    public String getOfferedBy() {
        return this.offeredBy;
    }

    public void setOfferedBy(String offeredBy) {
        checkString(offeredBy);
        this.offeredBy = offeredBy;
    }

    public double getCoveragePercent() {
        return this.coveragePercent;
    }

    private void setCoveragePercent(double percent){
        if(percent < MIN_COVERAGE || percent > MAX_COVERAGE ){
            throw new IllegalArgumentException();
        }
        this.coveragePercent = percent;
    }

    private void checkString(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
    }

}
