public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();
        smartTv.mudarCanal(25);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("A TV está atualmente " +smartTv.ligada+", com o volume: "+smartTv.volume+", no canal "+smartTv.canal+"!");
    }
}