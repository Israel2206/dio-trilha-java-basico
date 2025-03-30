public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atul: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
    }   

}

