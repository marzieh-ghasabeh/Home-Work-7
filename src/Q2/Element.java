package Q2;

public abstract class Element {
    private String symbol;
    private int atomic_number;
    private double atomic_weight;

    public Element(String symbol, int atomic_number, double atomic_weight) {
        this.symbol = symbol;
        this.atomic_number = atomic_number;
        this.atomic_weight = atomic_weight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomic_number() {
        return atomic_number;
    }

    public double getAtomic_weight() {
        return atomic_weight;
    }

    public abstract void describeElement();
}

