package Q_06;

public class Dog extends Pet {
    private double weight;

    public Dog(String name){
        super(name);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
