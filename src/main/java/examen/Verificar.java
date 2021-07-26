package examen;


public class Verificar {

    private static Verificar instance = null;

    public static Verificar getInstance()
    {
        if (instance == null)
            instance = new Verificar();
        return instance;
    }

    public boolean login(String username, String password) {

        StringBuilder sb = new StringBuilder(username);
        sb.reverse();
        if (sb.toString().equals(password))
            return true;
        else
            return false;

    }


}
