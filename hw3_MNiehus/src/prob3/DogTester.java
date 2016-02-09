package prob3;
public class DogTester {
	
public static void main(String[] args) {
	
	Dog d1 = new Dog();
	Dog d2 = new Dog("Lucky");
	Dog d3 = new Dog(7, "GG");
	Dog d4 = new Dog(12);
	WolfDog w1 = new WolfDog(9001, 5, "Juno");
	WolfDog w2 = new WolfDog(10, 1);
	WolfDog w3 = new WolfDog(100, 5, "Venti");
	System.out.println(d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" +
			w1 + "\n" + w2 + "\n" + w3);
	}
}