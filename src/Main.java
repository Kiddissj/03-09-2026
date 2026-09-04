import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("ingrese el nombre");
        String nombre = input.nextLine();

        System.out.println("ingrese la carrera");
        String carrera = input.nextLine();

        System.out.println("ingrese la edad");
        int edad = input.nextInt();

        Estudiante estudiante = new Estudiante(nombre,carrera,edad);

        if (edad < 18) {
            System.out.println("Estudiante menor de edad");
        }else if (edad < 25) {
            System.out.println("Estudiante joven.");
            }else {
                System.out.println("Estudiante adulto.");



            }
        estudiante.mostrarinformacion();
        }









}
