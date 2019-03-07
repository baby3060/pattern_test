package patterns.command;

public class FantaPicker implements Picker {
    @Override
    public void pick(DrinkingWater waterType) {
        System.out.println(waterType + "를 뽑았습니다.");
    }
}