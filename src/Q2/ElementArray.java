package Q2;

public class ElementArray {
    static Element[] elementArray = {new MetalElement("c", 2, 2.1),
            new MetalElement("c", 2, 2.1),
            new NonMetalElement("c", 2, 2.1),
            new NonMetalElement("c", 2, 2.1),};

    public static void main(String[] args) {
        for (Element element : elementArray) {
            System.out.println(element);
        }
    }
}
