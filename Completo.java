import java.util.Scanner;

public class Completo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("/--//--//--//--//--//--//--/");
            System.out.println("        MENÚ PRINCIPAL      ");
            System.out.println("/--//--//--//--//--//--//--/");
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Editar Usuario");
            System.out.println("3. Ver Usuario");
            System.out.println("4. Eliminar Usuario");
            System.out.println("5. Ordenar Usuario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: AgregarUsuario.ejecutar(scanner); break;
                case 2: EditarUsuario.ejecutar(scanner); break;
                case 3: VerUsuarios.ejecutar(); break;
                case 4: EliminarUsuario.ejecutar(scanner); break;
                case 5: OrganizarUsuarios.ejecutar(); break;
                case 6: salir = true; break;
                default: System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}