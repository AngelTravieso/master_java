public class HelloWorld {
    public static void main(String[] args) {
        String greet = "Hello World from Java";
        System.out.println("greet.toUpperCase() = " + greet.toUpperCase());
        
        int number = 11;
        System.out.println("number = " + number);

        boolean value = true;
        int number2 = 5;
        if(value) {
            System.out.println("number = " + number);
            number2 = 10;
        }

        System.out.println("number = " + number2);

        // Esto infiere el tipo de dato
        var number3 = "15";

        String name;

        name = "Angel";

        if(number > 10) {
            name = "Gustavo";
        }

        System.out.println("name = " + name);

    }
}
