package guru.springframework;

/**
 * @author seanbowen
 * @version 1.0
 * <p>
 * Creation date: 2021-04-17
 */
public class Dollar {
    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
