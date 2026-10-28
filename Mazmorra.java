
import java.util.Random;
import java.util.Scanner;

public class Mazmorra {
    private static int tirarDado20() {
        Random dado = new Random();
        return dado.nextInt(20) + 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int accionAventurero;
        Enemigo enemigo = new Enemigo("Paco", 4, 4, 2);
        Aventurero aventurero = new Aventurero("Juan", 5, 5, 1, 2);
        do {
            System.out.printf("El enemigo tiene %d y tu tienes %d de salud y %d posiciones\n",
                    enemigo.getVidaAhoraMonstruo(), aventurero.getVidaAhoraAventurero(),
                    aventurero.getCantidadPosiciones());

            System.out.println("Turno del jugador");
            System.out.println("Opciones:");
            System.out.println("1. Atacar con arma.");
            System.out.println("2. Beber poción.");
            accionAventurero = scanner.nextInt();
            switch (accionAventurero) {
                case 1:
                    if (tirarDado20() >= 2 || tirarDado20() <= 19) {
                        aventurero.atacar(enemigo);
                    }
                    if (tirarDado20() == 1) {
                        System.out.println("Pifia");
                    }
                    if (tirarDado20() == 20) {
                        aventurero.atacar(enemigo);
                        aventurero.atacar(enemigo);
                    }

                    break;
                case 2:
                    if (aventurero.getCantidadPosiciones() > 0) {
                        aventurero.beberPocion();
                        break;
                    }
                default: {
                    System.out.println("Accion no reconocida");
                    break;
                }
                   
            }
            aventurero.recibirDano(enemigo);
        } while (!(enemigo.estaDerrotado() || aventurero.estaCaido()));

        if (enemigo.estaDerrotado()) {
            System.out.println("Ganaste");
        }
        if (aventurero.estaCaido()) {
            System.out.println("Perdiste");
        }
    }
}
