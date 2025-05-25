package Q_04;

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

//    @Override
//    public String getType(){
//        return "Dog";
//    }

}
