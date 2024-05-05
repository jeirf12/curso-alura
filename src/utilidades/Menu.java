package utilidades;

/**
    Gestor de peliculas y series
    Copyright (C) 2024  Jhonfer Ruiz <jruizf@unicauca.edu.co>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 **/

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
