import java.util.LinkedList;

class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Limone"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Melone"));

        for(Fruit fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.addFirst(new Fruit("Arancia"));
        fruits.addLast(new Fruit("Anguria"));

        System.out.println("Dopo aver aggiunto degli elementi:");
        for(Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
