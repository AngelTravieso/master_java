public class PrimitivosCaracteres {
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

//        char espacio = ' ';
        char espacio = '\u0020';
        char retroceso = '\b'; // backspace (hace la función de borrado)
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        // obtiene el separador por defecto del SO
        // System.getProperty("line.separator")
        // System.lineSeparator()

        System.out.println("char corresponde en byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bites:" + espacio + Character.SIZE);
        System.out.println("char.MAX_VALUE = " + Character.MAX_VALUE);
        System.out.println("char.MIN_VALUE = " + Character.MIN_VALUE);

    }
}
