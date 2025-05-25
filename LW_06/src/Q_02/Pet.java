package Q_02;

class Pet {
    String name;
    char type; // 'c' for cat, 'd' for dog

    public Pet(String name, char type) {
        this.name = name;
        this.type = type;
    }

    public String getTypeName() {
        if (type == 'c') return "Cat";
        else if (type == 'd') return "Dog";
        else return "Unknown";
    }
}
