public class ZabbitTest {
    public static void main(String[] args) {
        Zabbit ye = new Zabbit("Mr West", 1977, "Savanna", 0);
        System.out.println(ye);
        ye.setHabitat("Grasslands");
        System.out.println(ye);
        ye.setFeed(1);
        System.out.println(ye);
        ye.talk();
        ye.eat();
        Zabbit cartman = new Zabbit("Cartman", 1990, "Jungle", 2);
        System.out.println(cartman);
    }
}
