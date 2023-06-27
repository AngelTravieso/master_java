public class Primitivos {
    public static void main(String[] args) {
        // -128 / 127
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);

        System.out.println("\n");

        // -32768 / 32767
        short numeroShort = 32767;
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        System.out.println("\n");

        // -2147483648 / 2147483647
        int numberInt = 2147483647;
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        System.out.println("\n");

        // -9223372036854775808 / 9223372036854775807
        long numberLong = 9223372036854775807L;
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);


        // var es soportado desde JDK 10 en adelante
        var numberVar = 127; // en literal numérica var siempre será un int, a menos que se coloque el L (Long) o F (Float)

    }
}
