public class RewardValue {
    private double cash;
    private double miles;
    public RewardValue(double cash){
        miles = ((1/0.0035) * cash);
    }
    public RewardValue(int miles){
        cash = (0.0035 * miles);
    }

    double getCashValue() {
        return cash;
    }
    double getMilesValue() {
        return miles;
    }
}
