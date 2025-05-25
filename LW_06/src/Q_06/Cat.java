package Q_06;

public class Cat extends Pet {
    private String coatColor;

    public Cat(String name){
        super(name);
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}
