package Q1;

public class DemoTurners2 {
    public static void main(String[] args) {
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner window = new Window();
        Turner faucet = new Faucet();

        leaf.turn();
        page.turn();
        pancake.turn();
        window.turn();
        faucet.turn();
    }
}
