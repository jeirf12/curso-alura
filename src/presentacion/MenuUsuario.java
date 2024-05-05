package presentacion;

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

import java.util.ArrayList;
import java.util.List;
import modelo.Calculadora;
import modelo.Pelicula;
import modelo.Serie;
import modelo.Titulo;
import utilidades.Consola;
import utilidades.Menu;

public class MenuUsuario extends Menu {

  private List<Titulo> activos;

  private Calculadora calculadora;

  public MenuUsuario(String titulo, String [] opciones) {
    super(titulo, opciones);
    this.activos = new ArrayList<>();
    this.calculadora = new Calculadora();
    this.repetirMenu();
  }

  @Override
  protected void procesarOpcion() {
    switch(this.opcion) {
      case 1: {
        this.registrar(Pelicula.class.getSimpleName());
        break;
      }
      case 2: {
        this.registrar(Serie.class.getSimpleName());
        break;
      }
      case 3: {
        this.mostrar(Pelicula.class);
        break;
      }
      case 4: {
        this.mostrar(Serie.class);
        break;
      }
      case 5: {
        this.calcularTiempoParaVerPeliculasEnMinutos();
        break;
      }
      case 6: {
        Consola.escribirSaltandoLinea("Saliendo...");
        break;
      }
    }
  }

  private void registrar(String tipo) {
    String nombre = " ";
    nombre = Consola.leer("Ingrese el nombre de la " + tipo.toLowerCase() + ": ", nombre);
    Integer fechaDeLanzamiento = 0;
    fechaDeLanzamiento = Consola.leer("Ingrese el año de lanzamiento: ", fechaDeLanzamiento);
    Integer tiempoDeDuracionEnMinutos = 0;
    Integer temporadas = 0;
    Integer episodioPorTemporada = 0;
    Integer duracionEnMinutosPorEpisodio = 0;
    if(tipo.toUpperCase().equals("SERIE")) {
      temporadas = Consola.leer("Ingrese el número de temporadas: ", temporadas);
      episodioPorTemporada = Consola.leer("Ingrese el número de episodios por temporada", episodioPorTemporada);
      duracionEnMinutosPorEpisodio = Consola.leer("Ingrese la duración de episodios por temporada: ", duracionEnMinutosPorEpisodio);
    } else if(tipo.toUpperCase().equals("PELICULA")) {
      tiempoDeDuracionEnMinutos = Consola.leer("Ingrese el tiempo de duración en minutos: ", tiempoDeDuracionEnMinutos);
    }

    if(tipo.toUpperCase().equals("SERIE")) {
      Serie serie = new Serie(nombre, fechaDeLanzamiento, true, "", temporadas, episodioPorTemporada, duracionEnMinutosPorEpisodio);
      this.activos.add(serie);
      calculadora.ingresarTitulo(serie);
    } else if(tipo.toUpperCase().equals("PELICULA")) {
      Pelicula pelicula = new Pelicula(nombre, fechaDeLanzamiento, true, "", tiempoDeDuracionEnMinutos);
      this.activos.add(pelicula);
      calculadora.ingresarTitulo(pelicula);
    }
  }

  private void mostrar(Class<?> clase) {
    Integer tamanio = 0;

    for (Titulo activo : this.activos) {
      if(clase.isInstance(activo)) {
        activo.mostrarFichaTecnica();
        tamanio++;
      }
    }

    if(tamanio == 0) Consola.escribirSaltandoLinea("No hay " + clase.getSimpleName().toLowerCase() + "s ingresadas todavia");
  }

  private void calcularTiempoParaVerPeliculasEnMinutos() {
    Integer minutos = 0;
    minutos = calculadora.getTotalMinutos();
    Consola.escribirSaltandoLinea("El tiempo que le va tomar las peliculas y series es de " + minutos + " minutos");
  }
}
