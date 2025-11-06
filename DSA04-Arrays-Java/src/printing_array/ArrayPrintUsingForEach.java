package printing_array;

public class ArrayPrintUsingForEach {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Banana", "Cherry" };
        System.out.println("My Fruit is :: ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
