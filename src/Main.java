import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    System.out.println("DIME TU NOMBRE");
    System.out.println(nombre());
    System.out.println("Dime tu edad");
    System.out.println(edad());
    System.out.println("Has aprobado?Si/No");
    if(aprobado()){
        System.out.println("Felicidades");
    } else {
        System.out.println("A repetir");
    }
    }
    public static String nombre(){
     String nombre;
     Scanner sc = new Scanner(System.in);
     return nombre = sc.nextLine();
    }
     public static int edad(){
     int edad;
     Scanner sc = new Scanner(System.in);
     return edad = sc.nextInt();
    }
    public static boolean aprobado(){
        String apruebas;
        Scanner sc = new Scanner(System.in);
        apruebas = sc.nextLine();
        if (apruebas.equals("Si")){
            return true;
        } else {
            return false;
        }
    }
}