package examen;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;




public class Application {



    private static Application instance = null;
    //Constructor
    private Application(){



    }
    //Para Singleton
    public static Application getInstance()
    {
        if (instance == null)
        {
            synchronized(Application.class)
            {
                instance = new Application();
            }
        }
        return instance;
    }

    public static void main(String[] args) {

    }

}
