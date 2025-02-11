public class Bicycle {

    public String brand;

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.brand = "Nakamura";
        System.out.println("La marque du vélo est : " + b.brand);
        b.brand = "Btwin";
        System.out.println("La nouvelle marque du vélo est : " + b.brand);
    }
    
}
