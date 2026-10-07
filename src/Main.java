import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("DIME TU NOMBRE");
        System.out.println(nombre());
    }
    public static String nombre(){
        String nombre;
        Scanner sc = new Scanner(System.in);
        return nombre = sc.nextLine();
    }
}