public class Jogo {
    public static void main(String[] args) throws InterruptedException{
        Personagem cacador = new Personagem("John",10,0,0);
        Personagem soneca = new Personagem("Soneca",2,6,4);
        //cacador.nome = "John";
        //cacador.nome = "Soneca";

        while (true){
            cacador.cacar();
            soneca.dormir();
            cacador.comer();
            soneca.dormir();
            cacador.dormir();
            soneca.cacar();
            soneca.comer();
            cacador.cacar();
            cacador.cacar();
            soneca.comer();
            cacador.cacar();
            System.out.println("====================");
            Thread.sleep(2000);
        }
    }
}
