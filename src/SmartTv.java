public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando o valume para " + volume);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo o valume para " + volume);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o valume para " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o valume para " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

}
