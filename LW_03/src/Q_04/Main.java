package Q_04;

public class Main {
    public static void main(String[] args) {
        Owner kumar = new Owner("Kumar","+94766354821");
        Owner kavi = new Owner("Kavi","+94766354822");
        Owner keshan = new Owner("Keshan","+94766354823");

        BicycleNew bicycle1 = new BicycleNew(kumar);
        BicycleNew bicycle2 = new BicycleNew(kavi);
        BicycleNew bicycle3 = new BicycleNew(keshan);

        System.out.println("Owner name: "+bicycle1.getBicycleOwner().getOwnerName()+"\nPhone number: "+bicycle1.getBicycleOwner().getPhoneNo());
        System.out.println("Owner name: "+bicycle2.getBicycleOwner().getOwnerName()+"\nPhone number: "+bicycle2.getBicycleOwner().getPhoneNo());
        System.out.println("Owner name: "+bicycle3.getBicycleOwner().getOwnerName()+"\nPhone number: "+bicycle3.getBicycleOwner().getPhoneNo());

    }
}
