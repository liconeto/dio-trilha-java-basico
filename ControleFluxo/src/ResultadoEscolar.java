public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        //IF ELSE condicional
        /*
        if(nota >=7)
            System.out.println("Aprovado");
        
        else if (nota > 5 && nota < 7)
            System.out.println("Prova de Recuperação");

        else
            System.out.println("Reprovado");
        */

        //Operador Ternario
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado" ;

        System.out.println(resultado);

    }
}
