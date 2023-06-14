public class BonusMilesService {
    public int calculate(int price) {
        int amount;
        int miles = 20;
        amount = price / miles;
        return amount;
    }
}
