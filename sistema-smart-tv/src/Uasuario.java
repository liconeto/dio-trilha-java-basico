public class Uasuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ? :" + smartTv.canal);
        System.out.println("Volume Atual ? :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuindo Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentando Volume: " + smartTv.volume);

        smartTv.mudarCanal(24);
        System.out.println("Novo canal: " + smartTv.canal);



    }
}
