public class VerUsuarios {
    public static void ejecutar() {
        if (BaseDatosUsuarios.cantidad == 0) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        System.out.println("/--//--//--//--//--//--//--/");
        System.out.println("     LISTA DE USUARIOS     ");
        System.out.println("/--//--//--//--//--//--//--/");

        for (int i = 0; i < BaseDatosUsuarios.cantidad; i++) {
            Usuario u = BaseDatosUsuarios.usuarios[i];
            System.out.println("Usuario #" + i);
            System.out.println("Nombre: " + u.nombre);
            System.out.println("Salario: " + u.salario);
            System.out.println("Género: " + u.genero);
            System.out.println("Cargo: " + u.cargo);
            System.out.println("/--//--//--//--/");
        }
    }
}