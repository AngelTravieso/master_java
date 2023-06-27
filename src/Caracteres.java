public class Caracteres {
    public static void main(String[] args) {
        char caracter = '1'; // con var se infiere la variable a tipo char
        char unicode = '\u0040'; // @
        char carDecimal = 64; // Lo transforma automáticamente
        
        System.out.println("carácter = " + caracter);
        System.out.println("unicode = " + unicode);
        System.out.println("carDecimal = " + carDecimal);

        System.out.println(carDecimal == caracter);
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println(simbolo == unicode);

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("char.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("char.MIN_VALUE = " + Character.MIN_VALUE);


    }
}
