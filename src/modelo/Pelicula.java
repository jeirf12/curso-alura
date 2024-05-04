package modelo;

import utilidades.Consola;

public class Pelicula extends Titulo {

  private String director;

  public Pelicula() {
    super();
    this.director = "";
  }

  public Pelicula(String nombre, Integer fechaDeLanzamiento, Boolean estaIncluidoEnelPlanBasico, String sinopsis, Integer tiempoDeDuracionEnMinutos) {
    super(nombre, fechaDeLanzamiento, estaIncluidoEnelPlanBasico, sinopsis, tiempoDeDuracionEnMinutos);
  }

  public Pelicula(String nombre, Integer fechaDeLanzamiento, Boolean estaIncluidoEnelPlanBasico, String sinopsis, Integer tiempoDeDuracionEnMinutos, String director) {
    super(nombre, fechaDeLanzamiento, estaIncluidoEnelPlanBasico, sinopsis, tiempoDeDuracionEnMinutos);
    this.director = director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getDirector() {
    return this.director;
  }

  @Override
  public void mostrarFichaTecnica() {
      super.mostrarFichaTecnica();
      Consola.escribirSaltandoLinea("Director:\t\t" + this.director);
  }
}
