package Q_02;

abstract class Pet {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public  abstract String getType();

}
