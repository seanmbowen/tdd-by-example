package guru.springframework;

/**
 * @author seanbowen
 * @version 1.0
 * <p>
 * Creation date: 2021-04-17
 */
public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return franc.amount == amount;
    }
}
