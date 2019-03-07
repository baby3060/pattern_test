package patterns.command;

public class CommandClient {
    public void run() {
        VendingMachine invoker = new VendingMachine();

        invoker.init();

        invoker.pick(DrinkingWater.CIDER);

        invoker.pick(DrinkingWater.CIDER);
        invoker.pick(DrinkingWater.CIDER);
        invoker.pick(DrinkingWater.CIDER);
        invoker.pick(DrinkingWater.CIDER);
    }
}