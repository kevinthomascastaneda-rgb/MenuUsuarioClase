import java.util.Scanner;

public class AgregarUsuario {
    public static void ejecutar(Scanner scanner) {
        if (BaseDatosUsuarios.cantidad >= BaseDatosUsuarios.MAX_USUARIOS) {
            System.out.println("No se pueden agregar más usuarios.");
            return;
        }

        Usuario u = new Usuario();
        u.numUsua = BaseDatosUsuarios.cantidad;

        System.out.print("Ingrese nombre: ");
        u.nombre = scanner.nextLine();

        System.out.print("Ingrese salario: ");
        u.salario = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Ingrese género (M/F): ");
        u.genero = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("Ingrese cargo: ");
        u.cargo = scanner.nextLine();

        BaseDatosUsuarios.usuarios[BaseDatosUsuarios.cantidad] = u;
        BaseDatosUsuarios.cantidad++;

        System.out.println("Usuario agregado correctamente.");
    }
}