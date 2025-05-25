package Q_01;

abstract class Pet {
    private String name;

    public String getName(){
        return name;
    }

    public void setName (String petName){
        name = petName;
    }

    public String speak(){
        return "I'm your cuddly pet.";
    }
}
