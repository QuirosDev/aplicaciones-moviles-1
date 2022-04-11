package test;
import estudiantescesde.Estudiantes;
import java.util.Scanner;

public class TestEstudiantes {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        Estudiantes estudiante = new Estudiantes();
        String nombres[];
        double [] momento1 = new double[3]; double [] momento2 = new double[3]; double [] momento3 =  new double[3];
        int cantidadEstudiantes;
        
        System.out.println("Digite la cantidad de estudiantes: ");
        cantidadEstudiantes = Integer.parseInt(inputData.nextLine());
        estudiante.setCantidadEstudiantes(cantidadEstudiantes);
        nombres = new String [estudiante.getCantidadEstudiantes()];
        
        for (int i = 0; i < estudiante.getCantidadEstudiantes(); i++) {
            System.out.println("Digite el nombre del estudiante: ");
            nombres[i] = inputData.next();
            estudiante.setNombres(nombres);
            for (int j = 0; j < estudiante.getMomento1().length; j++) {
                System.out.println("Digite la nota [" +(j+1) + "] del momento 1 para el estudiante " + estudiante.getNombres()[i] + ": ");
                momento1[j] = inputData.nextDouble();
                estudiante.setMomento1(momento1);
            }
            for (int k = 0; k < estudiante.getMomento3().length; k++) {
                 System.out.println("Digite la nota [" +(k+1) + "] del momento 1 para el estudiante " + estudiante.getNombres()[i] + ": ");
                momento2[k] = inputData.nextDouble();
                estudiante.setMomento1(momento2);
            }
            for (int l = 0; l < estudiante.getMomento3().length; l++) {
                 System.out.println("Digite la nota [" +(l+1) + "] del momento 1 para el estudiante " + estudiante.getNombres()[i] + ": ");
                momento1[l] = inputData.nextDouble();
                estudiante.setMomento1(momento1);
            }
        }
     
        estudiante.mostrarResultado();
    }
    
}
