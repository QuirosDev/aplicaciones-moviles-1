import java.util.Scanner;
public class Estudiantes {
public static void main(String[] args) {
    Scanner inputData = new Scanner(System.in);
        double momento1[] = new double[3]; double momento2[] = new double[3]; double momento3[] = new double [3];
        double promedio1 = 0, promedio2 = 0, promedio3 = 0;
        double momentos[][];
        double promedios[][];
        double[] promedioFinal;
        String nombres[];
        int posiciones = 0;
        int numeroEstudiantes;
        
        System.out.println("Digite el numero de estudiantes: ");
        numeroEstudiantes = Integer.parseInt(inputData.next());
        nombres = new String[numeroEstudiantes];
        momentos = new double[numeroEstudiantes][9];
        promedios = new double[numeroEstudiantes][3];
        promedioFinal = new double[numeroEstudiantes];
       
              
        
        
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Digite el nombre del estudiante: ");
            nombres[i] = inputData.next();
            System.out.println(" ");
            for (int j = 0; j < momento1.length; j++) {
                System.out.println("Digite la nota [" + (j+1) + "] del momento 1: ");
                momento1[j] = inputData.nextDouble();
                momentos[i][posiciones] = momento1[j];
                promedio1 = promedio1 + momento1[j];
                posiciones++;
            }
            promedio1 /=3;
            promedios[i][0] = promedio1;
            System.out.println(" ");
           
            for (int k = 0; k < momento2.length; k++) {
                System.out.println("Digite la nota [" + (k+1) + "] del momento 2: ");
                momento2[k] = inputData.nextDouble();
                momentos[i][posiciones] = momento2[k];
                promedio2 = promedio2 + momento2[k];
                posiciones++;
            }
            promedio2 /=3;
            promedios[i][1] = promedio2;
            System.out.println(" ");
            
            for (int l = 0; l < momento3.length; l++) {
            System.out.println("Digite la nota [" + (l+1) + "] del momento 3: ");
            momento3[l] = inputData.nextDouble();
            momentos[i][posiciones] = momento3[l];
            promedio3 = promedio3 + momento3[l];
            posiciones++;        
        }
            promedio3 /=3;
            promedios[i][2] = promedio3;
            promedioFinal[i] = (promedio1 + promedio2 + promedio3)/3;
            System.out.println("Su promedio final es: " + promedioFinal[i]);
            posiciones = 0; promedio1 = 0; promedio2 = 0; promedio3 = 0;
            System.out.println(" ");
            
    }
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("El estudiante " + nombres[i]);
            for (int j = 0; j < momento1.length; j++) {
                System.out.println("obtuvo en la nota " +(j+1) + " del primer momento: " + momentos[i][posiciones]);
                posiciones++;
            }
            System.out.println("su promedio en el primer momento fue: " + promedios[i][0] + "\n");
            for (int k = 0; k < momento2.length; k++) {
                System.out.println("obtuvo en la nota " +(k+1) + " del segundo momento: "+ momentos[i][posiciones]);
                posiciones++;
            }
            System.out.println("su promedio en el segundo momento fue: " + promedios[i][1] + "\n");
            for (int l = 0; l < momento3.length; l++) {
                System.out.println("obtuvo en la nota " +(l+1) + " del tercer momento: "+ momentos[i][posiciones]);
                posiciones++;
            }
            System.out.println("su promedio en el tercer momento fue: " + promedios[i][2]);
            System.out.println("su promedio final es: " + promedioFinal[i]);
            posiciones = 0;
            System.out.println(" ");
        }
}
    
}
