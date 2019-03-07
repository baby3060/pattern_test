package patterns.command;

public class CokePicker implements Picker {
    @Override
    public void pick(DrinkingWater waterType) {
        System.out.println(waterType + "를 뽑았습니다.");
    }
}