package libro.calificaciones;

public class LibroCalificaciones {
    
    private String nombreDelCurso;
    
    public LibroCalificaciones(String nombre){
        nombreDelCurso = nombre;
    }
    
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }
    
    public String obtenerNombreDelcurso(){
        return nombreDelCurso;
    }
    
    public void mostrarMensaje(String nombreDelCurso){
        System.out.println("Bienvenido al libro calificaciones para \n\n" + obtenerNombreDelcurso());
    }
}
