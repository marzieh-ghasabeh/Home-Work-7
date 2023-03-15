package Q2;

public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, int atomic_number, double atomic_weight) {
        super(symbol, atomic_number, atomic_weight);
    }

    public void describeElement(){
        System.out.println("nonmetals are poor conductors");

    }
}
