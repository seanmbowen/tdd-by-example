package guru.springframework;

/**
 * @author seanbowen
 * @version 1.0
 * <p>
 * Creation date: 2021-04-17
 */
public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return dollar.amount == amount;
    }
}
