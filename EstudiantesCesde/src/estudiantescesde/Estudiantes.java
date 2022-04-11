package estudiantescesde;

public class Estudiantes {
    private int cantidadEstudiantes;
    private String nombres[] = new String[cantidadEstudiantes];
    private double [] momento1 = new double[3];private double [] momento2 = new double[3]; private double [] momento3 =  new double[3];
    private double notas[][] = new double[cantidadEstudiantes][9];
    private double promedio1 = 0, promedio2 = 0, promedio3 = 0;
    private double promedios[][] = new double[cantidadEstudiantes][3];
    private  double promedioFinal[] = new double[cantidadEstudiantes];
    private int contador = 0;
    
    
    public String [] getNombres(){
        return nombres;
    }
    
    public void setNombres(String [] nombres){
        this.nombres = nombres;
    }
    
    public int getCantidadEstudiantes(){
        return cantidadEstudiantes;
    }
    
    public void setCantidadEstudiantes(int cantidadEstudiantes){
        this.cantidadEstudiantes = cantidadEstudiantes;
    }
    
    public double [] getMomento1(){
        return momento1;
    }
    
    public void setMomento1(double [] momento1){
        this.momento1 = momento1;
    }
    
    public double [] getMomento2(){
        return momento2;
    }
    
    public void setMomento2(double [] momento2){
        this.momento2 = momento2;
    }

    public double[] getMomento3() {
        return momento3;
    }

    public void setMomento3(double[] momento3) {
        this.momento3 = momento3;
    }
    
    public void calcularResultado(){
        for (int i = 0; i < getCantidadEstudiantes(); i++) {
            for (int j = 0; j < 3; j++) {
                promedio1 = getMomento1()[j];
                promedio1 = promedio1 + getMomento1()[j];
                notas[i][contador] = getMomento1()[j];
                contador++;
            }
            promedio1 /= 3;
            promedios[i][0] = promedio1;
            for (int k = 0; k < getCantidadEstudiantes(); k++) {
                promedio2 = getMomento2()[k];
                promedio2 = promedio2 + getMomento2()[k];
                notas[i][contador] = getMomento2()[k];
                contador++;
            }
            promedio2 /= 3;
            promedios[i][1] = promedio2; 
            for (int l = 0; l < getCantidadEstudiantes(); l++) {
                promedio3 = promedio3 + getMomento3()[l];
                notas[i][contador] = getMomento3()[l];
                contador++;
            }
            promedio3 /= 3;
            promedios[i][2] = promedio3;
            promedioFinal[i] = (promedio1 + promedio2 + promedio3)/3;
            contador = 0; promedio1 = 0; promedio2 = 0; promedio3 = 0;
        }
    }
    
    public void mostrarResultado(){
        for (int i = 0; i < getCantidadEstudiantes(); i++) {
            System.out.println("El estudiantes: " + getNombres()[i]);
            System.out.println("En el primer momento obtuvo: ");
            for (int j = 0; j < getMomento1().length; j++) {
                System.out.println("Nota: " + notas[i][contador]);
                System.out.println("Promedio momento 1: " + promedios[i][0]);
                contador++;
            }
            System.out.println("En el segundo momento: ");
            for (int k = 0; k < getMomento2().length; k++) {
                System.out.println("Nota: " + notas[i][contador]);
                System.out.println("Promedio momento 2: " + promedios[i][1]);
                contador++;
            }
            System.out.println("En el tercer momento: ");
            for (int l = 0; l < getMomento2().length; l++) {
                System.out.println("Nota: " + notas[i][contador]);
                System.out.println("Promedio momento 3: " + promedios[i][2]);
                contador++;
            }
            System.out.println("El promedio final es: " + promedioFinal[i]);
            contador = 0;
        }
    }  
}
