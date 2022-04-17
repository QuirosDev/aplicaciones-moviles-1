package libro.calificaciones;

import java.util.Scanner;
public class PrubeLibroCalificaciones {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        LibroCalificaciones miliLibroCalificaciones1 = new LibroCalificaciones(""
                + "CS101 Introduccion a la programacion en Java");
        LibroCalificaciones miLibroCalificaciones2 = new LibroCalificaciones(""
                + "CS102 Estructura de datos en Java");
        
        System.out.println("El nombre del curso de librocalificaciones 1 es:\n " +
                miliLibroCalificaciones1.obtenerNombreDelcurso());
        System.out.println("El nombre del curso de librocalificaciones 2 es: \n" + 
                miLibroCalificaciones2.obtenerNombreDelcurso());
    }
}
