public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
            // break para a iteração do for 
            // continue pula a iteração do for
            continue;

            System.out.println(numero);
        }
    }
}
