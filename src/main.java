import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        CuentaCorriente c1 = new CuentaCorriente(123, 1000);
        CuentaAhorros c2 = new CuentaAhorros(123, 0.1780);
        double monto = 100;
        while (opcion != 3) {
            System.out.println("-------Bienvenido--------:");
            System.out.println("Menú de opciones:");
            System.out.println("1. Cuenta corriente");
            System.out.println("2. Cuenta ahorros");
            System.out.println("3. Salir");

            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    double retiro = 200;
                    c1.retirar(retiro);
                    break;
                case 2:
                    c2.calcularInteres(monto);
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opcion de salir");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, intentelo de nuevo.");
            }
        }

        scanner.close();
    }
}