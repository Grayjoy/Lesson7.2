public class Main {

    public static void main(String[] args) {
        Lesson7 lesson7 = new Lesson7();
        int inp = lesson7.input();
        lesson7.pullingUpForTwenty(lesson7.pullingUp(inp), inp);
    }
}
