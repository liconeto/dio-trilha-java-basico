public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        int numero = 5;

        System.out.println( ++ numero);
        System.out.println(numero);
        System.out.println(-- numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        // Operador ternario

        int a, b;

        a=5;
        b=6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        
    }
    
}
