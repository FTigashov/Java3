import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruit> {
    private List<T> box;
    private float weightOfBox;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeightOfBox() {
        weightOfBox = 0.0f;
        for (T fruit : box) {
            weightOfBox += fruit.getWeight();
        }
        return weightOfBox;
    }

    public boolean compareBoxes(Box<?> b) {
//        System.out.println(this.getWeightOfBox());
//        System.out.println(b.getWeightOfBox());

        return Math.abs(this.weightOfBox) == Math.abs(b.getWeightOfBox());
    }

    public void replaceBox(Box<T> newBox) {
        newBox.box.addAll(box);
        box.clear();
    }
}
