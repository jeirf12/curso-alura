package utilidades;

public class Menu {

  private String titulo;

  private String[] menuOpciones;

  protected int opcion;

  private int opcionSalida;

  public Menu(String titulo, String[] menuOpciones){
    this.titulo = titulo;
    this.menuOpciones = menuOpciones;
    this.opcionSalida = menuOpciones.length + 1;
  }

  protected void repetirMenu() {
    do {
      this.mostrarMenu();
      this.leerOpcion();
      this.procesarOpcion();
    } while (this.opcion != this.opcionSalida);
  }

  private void mostrarMenu(){
    Consola.escribirSaltandoLinea("\n\t\t" + this.titulo + "\n");
    Consola.escribirSaltandoLinea(this.menuOpciones);
    Consola.escribirSaltandoLinea(this.opcionSalida + ".Salir...");
  }

  private void leerOpcion() {
    this.opcion = 0;
    this.opcion = Consola.leer("Ingrese la opción: ", this.opcion);
    if(this.opcion < 1 || this.opcion > this.opcionSalida) {
      Consola.escribirSaltandoLinea("Opción invalida");
    }
  }

  protected void procesarOpcion() { }
}
