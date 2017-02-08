public class CatDriver {
    public static void main(String[] args) {
        Cat c = new Cat("Dave", 250.00);
		System.out.println(c.toString());
		c.setName("Jeffery");
		System.out.println(c.toString());
    }
}