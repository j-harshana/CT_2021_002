package Q_05;

public class DogQ5 extends PetQ5 {
    private double weight;

    public DogQ5(String name){
        super(name);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
