import java.util.ArrayList;
import java.util.List;
import utilidades.Consola;

public class Main {

  public static void main(String[] args) {
    Boolean bandera = false;
    Double suma = 0.0; 
    Integer contador = 0;
    List<Double> calificaciones = new ArrayList<>();
    String nombre = Consola.leer("Ingrese el nombre de la película que desea calificar: ", "");
    Consola.escribirSaltandoLinea("Ingrese las calificaciones de la película " + nombre);

    while (!bandera) {
      Double calificación = Consola.leer("Ingrese calificación (1 a 5) siendo 5 la mejor: ", -1.0);

      if(calificación < -1 || calificación > 5) {
        Consola.escribirSaltandoLinea("La calificación no es correcta. Por favor, intente nuevamente");
      } else {
        calificaciones.add(calificación);
        suma += calificación;
        contador++;
      }

      String tecla = Consola.leer("¿Desea continuar ingresando calificaciones?. S: si, cualquier tecla: no", "");

      if(!tecla.equalsIgnoreCase("S")) {
        bandera = true;
      }
    }

    if(contador > 0) {
      Double promedio = suma / contador;
      Consola.escribirSaltandoLinea("La calificación media de la película " + nombre + " es: " + promedio);
      Consola.escribirSaltandoLinea("El detalle de las calificaciones es el siguiente: ");
      Consola.escribirSaltandoLinea(calificaciones);
    } else {
      Consola.escribirSaltandoLinea("No se ingresaron calificaciones validas para hacer el calculo");
    }
  }
}
