package ObjectClass;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Marcin", "Nowak", "truskaweczki@gmail.com");
        Car car = new Car("Vlovo", "S40", client);

        Dog atos = new Dog("Atos", 1);
        Dog szanta = new Dog("szanta", 7);
        atos.setName("Pimpek");
        String name = szanta.getName();
        szanta.setAge(10);
        System.out.println(szanta);

    }
}
