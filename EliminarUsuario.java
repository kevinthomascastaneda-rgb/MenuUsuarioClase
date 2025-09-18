import java.util.Scanner;

public class EliminarUsuario {
    public static void ejecutar(Scanner scanner) {
        if (BaseDatosUsuarios.cantidad == 0) {
            System.out.println("No hay usuarios para eliminar.");
            return;
        }

        SeleccionarUsuario.ejecutar(scanner);

        for (int i = BaseDatosUsuarios.indiceSeleccionado; i < BaseDatosUsuarios.cantidad - 1; i++) {
            BaseDatosUsuarios.usuarios[i] = BaseDatosUsuarios.usuarios[i + 1];
        }
        BaseDatosUsuarios.usuarios[BaseDatosUsuarios.cantidad - 1] = null;
        BaseDatosUsuarios.cantidad--;

        System.out.println("Usuario eliminado correctamente.");
    }
}