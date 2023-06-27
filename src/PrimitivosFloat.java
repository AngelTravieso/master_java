public class PrimitivosFloat {
    public static void main(String[] args) {
        /*
 Para indicar que la literal es un float
        float real = 2120.0f;
        float real = 2.12e3f; // 2.12 x 10 elevado a 3 = 2120f (se corre la coma a la derecha)
        float realFloat = 1.5e4f; // 15000f
*/
        float realFloat = 1.5e-10f; // 0.000000000015f
        System.out.println("realFloat = " + realFloat);

        // -9223372036854775808 / 9223372036854775807
        float numberFloat = 9223372036854775807F;
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE);

        // doble precisión
        double realDouble = 3.4028235E38; // el punto indica la literal como double
        System.out.println("realDouble = " + realDouble);

        System.out.println("\n");

        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE);

        float varFlotante = 3.1416F; // var la infiere como double (siempre)
        System.out.println("varFlotante = " + varFlotante);

    }
}
