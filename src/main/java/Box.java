import java.util.ArrayList;
import java.util.List;


public class Box<T extends Fruit> {
    private List<T> box = new ArrayList<>();
    private float weightOfBox;

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
}
