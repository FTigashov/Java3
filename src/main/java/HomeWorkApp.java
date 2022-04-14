import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWorkApp {
    public static void main(String[] args) {
        String[] array = new String[] {"computer", "keyboard", "mouse", "adapter", "monitor"};

        changePosition(array.clone());  // task 1
        makeToArrayList(array);  // task 2
        fruitsAndBoxes();  // task 3
    }

    private static void changePosition(String[] array) {
        System.out.println("Текущий массив: " + Arrays.toString(array));

        String buff;
        int pos1 = 0, pos2 = 1;
        buff = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = buff;

        System.out.println("Измененный массив: " + Arrays.toString(array));
    }

    private static void makeToArrayList(String[] array) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        System.out.println(list);
    }

    private static void fruitsAndBoxes() {
        Apple apple = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> boxWithApples = new Box<>();
        Box<Apple> newBoxWithApples = new Box<>();
        Box<Orange> boxWithOranges = new Box<>();

        // добавление фруктов в коробку
        boxWithApples.addFruit(apple);
        boxWithApples.addFruit(apple2);
        boxWithApples.addFruit(apple3);

//        boxWithApples.addFruit(orange);

        boxWithOranges.addFruit(orange);
        boxWithOranges.addFruit(orange2);

        System.out.println("Вес коробки с яблоками: " + boxWithApples.getWeightOfBox());
        System.out.println("Вес коробки с апельсинами: " + boxWithOranges.getWeightOfBox());

        System.out.println("Коробки с апельсинами и яблоками имеют одинаковый вес: " + boxWithApples.compareBoxes(boxWithOranges));

        boxWithApples.replaceBox(newBoxWithApples);
    }
}
