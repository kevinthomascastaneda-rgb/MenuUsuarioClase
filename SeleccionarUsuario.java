import java.util.Scanner;

public class SeleccionarUsuario {
    public static void ejecutar(Scanner scanner) {
        System.out.println("Usuarios registrados:");
        for (int i = 0; i < BaseDatosUsuarios.cantidad; i++) {
            System.out.println(i + ". " + BaseDatosUsuarios.usuarios[i].nombre);
        }

        while (true) {
            System.out.print("Seleccione el número de usuario: ");
            BaseDatosUsuarios.indiceSeleccionado = scanner.nextInt();
            scanner.nextLine();

            if (BaseDatosUsuarios.indiceSeleccionado >= 0 && BaseDatosUsuarios.indiceSeleccionado < BaseDatosUsuarios.cantidad) {
                break;
            }
            System.out.println("Índice inválido. Intente de nuevo.");
        }
    }
}