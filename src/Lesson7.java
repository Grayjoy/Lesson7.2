import java.util.Scanner;

public class Lesson7 {

    private static Scanner scanner = new Scanner(System.in);
    private int onePullingUp = 5;
    private int rest = 60;

    private int scr;
    private int valueInWork;

    public int input() {

        System.out.println("Введите количество подходов");
        scr = scanner.nextInt();

        return scr;
    }

    public int pullingUp(int scr) {
        int value = scr * (scr + 1) / 2;
        System.out.println("Кол-во подтягиваний: " + value);

        valueInWork = value * onePullingUp;
        int valueInRest = scr * rest;
        int valueAll = valueInWork + valueInRest - 60;

        System.out.println("Количество времени выполнения: " + valueAll / 60 + " минуты " + valueAll % 60 + " секунд");
        return valueInWork;
    }

    public void pullingUpForTwenty() {
        double restForTwenty = 60;
        for (int i = 1; i < scr - 1; i++) {
            double scr1 = restForTwenty * 0.2;
            restForTwenty += restForTwenty;
            restForTwenty = scr1 + restForTwenty;

        }
        if (scr > 1) {
            int valueAll2 = (int) (restForTwenty + valueInWork);
            System.out.println("Количество времени выполнения с учетом добавления 20%: " + valueAll2 / 60 + " минуты " + valueAll2 % 60 + " секунд");

        } else {
            System.out.println("Количество времени выполнения: " + 0);
        }

    }
}

