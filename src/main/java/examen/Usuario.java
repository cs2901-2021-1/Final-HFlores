package examen;

import java.util.Scanner;

public class Usuario {

    private String usuario;
    private String password;

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public boolean Login() {
        return Verificar.getInstance().login(usuario,password);
    }


}
