import java.util.Scanner;

public class EditarUsuario {
    public static void ejecutar(Scanner scanner) {
        if (BaseDatosUsuarios.cantidad == 0) {
            System.out.println("No hay usuarios para editar.");
            return;
        }

        SeleccionarUsuario.ejecutar(scanner);
        Usuario u = BaseDatosUsuarios.usuarios[BaseDatosUsuarios.indiceSeleccionado];

        System.out.print("Ingrese nuevo nombre (" + u.nombre + "): ");
        u.nombre = scanner.nextLine();

        System.out.print("Ingrese nuevo salario (" + u.salario + "): ");
        u.salario = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ingrese nuevo género (" + u.genero + "): ");
        u.genero = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Ingrese nuevo cargo (" + u.cargo + "): ");
        u.cargo = scanner.nextLine();

        System.out.println("Usuario editado correctamente.");
    }
}