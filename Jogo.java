public class Jogo {
    public static void main(String[] args) throws InterruptedException{
        Personagem cacador = new Personagem("John",10,0,0);
        Personagem soneca = new Personagem("Soneca",2,6,4);
        Personagem faminto = new Personagem("Urso", 5, 10, 3);
        //cacador.nome = "John";
        //cacador.nome = "Soneca";

        while (true){
            cacador.cacar();
            faminto.cacar();
            soneca.dormir();
            cacador.comer();
            faminto.comer();
            faminto.comer();
            soneca.dormir();
            cacador.dormir();
            soneca.cacar();
            faminto.dormir();
            faminto.dormir();
            soneca.comer();
            soneca.comer();
            cacador.cacar();
            System.out.println("==================================");
            Thread.sleep(5000);
        }
    }
}
