public class BarraDeProgresso {

    public static void main(String[] args) {
        int total = 100; // Total de iterações
        int larguraBarra = 50; // Largura da barra de progresso no console

        for (int i = 0; i <= total; i++) {
            // Calcula o progresso em porcentagem
            int progresso = (i * 100) / total;

            // Calcula quantos caracteres da barra devem ser preenchidos
            int caracteresPreenchidos = (i * larguraBarra) / total;

            // Cria a barra de progresso
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < larguraBarra; j++) {
                if (j < caracteresPreenchidos) {
                    barra.append("=");
                } else if (j == caracteresPreenchidos) {
                    barra.append(">");
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(progresso).append("%");

            // Exibe a barra de progresso no console
            System.out.print("\r" + barra.toString());

            // Simula um delay para visualizar a barra de progresso
            try {
                Thread.sleep(50); // Pausa por 50 milissegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nConcluído!");
    }
}
