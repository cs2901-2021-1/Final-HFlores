package examen;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

            Scanner myObj = new Scanner(System.in);
            System.out.println("Ingrese su Usuario");

            String userName = myObj.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Ingrese su Contraseña");

            String password = myObj2.nextLine();

            if (ValidarPassword(userName, password)){
                System.out.println("Sesion Iniciada!");

            }

            else {
                System.out.println("Contraseña Incorrecta");

            }


            System.out.println("Bienvenido");
            System.out.println("-------------------------------------------------");
            System.out.println("Avance de la vacunacion == 1");
            System.out.println("Cobertura de la vacunacion == 2");
            System.out.println("Info de Centros de Vacunacion == 3");
            System.out.println("Numero de personas vacunadas parcialmente == 4");
            System.out.println("Numero de personas vacunadas completamente == 5");
            System.out.println("Cerrar Sesion == 0");
            System.out.println("-------------------------------------------------");

            System.out.println("Escoja el numero de su operacion");


            Scanner myObj3 = new Scanner(System.in);
            int operacion = myObj3.nextInt();


            switch (operacion)
            {
                case 1:{} ;
                break;
                case 2:  ;
                    break;
                case 3:{

                    System.out.println("Desea dar de Alta o baja un centro?");
                    System.out.println("Ingresar si o no");

                    Scanner myObj4 = new Scanner(System.in);
                    String rpta = myObj4.nextLine();

                    if(rpta.equals("si")){


                    }
                    else {
                        System.out.println("Total de Centros de Vacunacion:");



                    }


                }  ;
                break;
                case 4:  ;
                    break;
                case 5:  ;
                    break;
                case 6:  ;
                    break;
                case 0:  {
                    System.out.println("Cerrando Sesion");
                }
                break;
            }




        }



        public static boolean ValidarPassword(String username,String password) {
            StringBuilder sb = new StringBuilder(username);
            sb.reverse();
            if (sb.toString().equals(password))
                return true;
            else
                return false;
        }


        private void CentrosVacunacion(){

            System.out.println("Dar de Alta == 1");

            System.out.println("Dar de Baja == 2");

            System.out.println("Escoja el numero de su operacion");

            Scanner myObj3 = new Scanner(System.in);
            int operacion = myObj3.nextInt();


            switch (operacion)
            {
                case 1:{
                    System.out.println("Ingrese nombre del centro");

                    Scanner myObj4 = new Scanner(System.in);
                    String rpta = myObj4.nextLine();

                    Centro centro = new Centro(rpta,0,0,true);


                } ;
                break;
                case 2:{

                    System.out.println("Indique nombre del centro a dar de baja");

                    Scanner myObj4 = new Scanner(System.in);
                    String rpta = myObj4.nextLine();

                    Centro centro = new Centro(rpta,0,0,true);

                    centro.Bajarlo();


                }  ;
                break;
            }

        };

}
