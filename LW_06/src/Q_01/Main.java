package Q_01;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();

        myCat.setName("Kitty");
        myDog.setName("Scooby");

        System.out.println("My Cat's name: "+myCat.getName()+". He says "+myCat.speak());
        System.out.println("My Dog's name: "+myDog.getName()+". He says "+myDog.speak());
    }

}
