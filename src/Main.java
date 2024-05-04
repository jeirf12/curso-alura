import presentacion.MenuUsuario;
import utilidades.Menu;

public class Main {

  public static void main(String[] args) {
    Menu menu = new MenuUsuario("Gestor Multimedia", new String[]{ "Registrar Pelicula", "Registrar Serie", "Mostrar Peliculas", "Mostrar Series", "Calcular tiempo para ver peliculas y series" });
  }
}
