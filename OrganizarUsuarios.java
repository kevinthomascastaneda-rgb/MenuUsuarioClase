public class OrganizarUsuarios {
    public static void ejecutar() {
        if (BaseDatosUsuarios.cantidad <= 1) return;

        for (int i = 0; i < BaseDatosUsuarios.cantidad - 1; i++) {
            for (int j = 0; j < BaseDatosUsuarios.cantidad - 1 - i; j++) {
                if (BaseDatosUsuarios.usuarios[j].nombre.compareToIgnoreCase(BaseDatosUsuarios.usuarios[j + 1].nombre) > 0) {
                    Usuario temp = BaseDatosUsuarios.usuarios[j];
                    BaseDatosUsuarios.usuarios[j] = BaseDatosUsuarios.usuarios[j + 1];
                    BaseDatosUsuarios.usuarios[j + 1] = temp;
                }
            }
        }
        System.out.println("Se han organizado los usuarios.");
    }
}