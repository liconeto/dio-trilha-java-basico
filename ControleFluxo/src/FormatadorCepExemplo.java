public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
            System.out.println(cepFormatado);    
        } catch (CepInvalidoExcepion e) {
            System.out.println("O Cep não corresponde as regras do negocio");
        }
        
     
    }

    static String formatarCep(String cep) throws CepInvalidoExcepion{
        if(cep.length() != 8)
        throw new CepInvalidoExcepion();

        return "23.765-054";
    }
}
