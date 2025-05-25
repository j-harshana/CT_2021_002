package Q_03;

public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }

    @Override
    public String getType(){
        return "Dog";
    }

}
