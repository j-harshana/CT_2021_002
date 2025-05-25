package Q_01;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.setName("Kitty");
        System.out.println("My Cat is '"+myCat.getName()+"' and he says, "+myCat.speak());

        Dog myDog = new Dog();
        myDog.setName("Dingo");
        System.out.println("My Dog is '"+myDog.getName()+"' and he says, "+myDog.speak());
    }
}
