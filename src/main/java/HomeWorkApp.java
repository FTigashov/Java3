public class HomeWorkApp {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> boxWithApples = new Box<>();
        Box<Orange> boxWithOranges = new Box<>();

        boxWithApples.addFruit(apple);
        boxWithApples.addFruit(apple2);
//        boxWithApples.addFruit(apple3);

        boxWithOranges.addFruit(orange);
        boxWithOranges.addFruit(orange2);

        System.out.println(boxWithApples.compareBoxes(boxWithOranges));

    }
}
