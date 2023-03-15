package Q2;

public class MetalElement extends Element {
    public MetalElement(String symbol, int atomic_number, double atomic_weight) {
        super(symbol, atomic_number, atomic_weight);
    }

    public void describeElement(){
        System.out.println("metals are good conductors");
    }
}
