package modelo;

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

import utilidades.Consola;

public class Titulo {

  protected String nombre;

  protected Integer fechaDeLanzamiento;

  protected Double evaluacion;

  protected Boolean estaIncluidoEnelPlanBasico;

  protected String sinopsis;

  protected Integer tiempoDeDuracionEnMinutos;

  public Titulo() {
    this.nombre = "";
    this.fechaDeLanzamiento = 0;
    this.evaluacion = 0.0;
    this.estaIncluidoEnelPlanBasico = false;
    this.sinopsis = "";
    this.tiempoDeDuracionEnMinutos = 0;
  }

  public Titulo(String nombre, Integer fechaDeLanzamiento, Boolean estaIncluidoEnelPlanBasico, String sinopsis, Integer tiempoDeDuracionEnMinutos) {
    this.nombre = nombre;
    this.fechaDeLanzamiento = fechaDeLanzamiento;
    this.estaIncluidoEnelPlanBasico = estaIncluidoEnelPlanBasico;
    this.sinopsis = sinopsis;
    this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    this.evaluacion = 0.0;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setFechaDeLanzamiento(Integer fechaDeLanzamiento) {
    this.fechaDeLanzamiento = fechaDeLanzamiento;
  }

  public Integer getFechaDeLanzamiento() {
    return this.fechaDeLanzamiento;
  }

  public Double getEvaluacion() {
    return this.evaluacion;
  }

  public void setEstaIncluidoEnElPlanBasico(Boolean estaIncluidoEnelPlanBasico) {
    this.estaIncluidoEnelPlanBasico = estaIncluidoEnelPlanBasico;
  }

  public Boolean getEstaIncluidoEnElPlanBasico() {
    return this.estaIncluidoEnelPlanBasico;
  }

  public void setSinopsis(String sinopsis) {
    this.sinopsis = sinopsis;
  }

  public String getSinopsis() {
    return this.sinopsis;
  }

  public void setTiempoDeDuracionEnMinutos(Integer tiempoDeDuracionEnMinutos) {
    this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
  }

  public Integer getTiempoDeDuracionEnMinutos() {
    return this.tiempoDeDuracionEnMinutos;
  }

  public void mostrarFichaTecnica() {
    Consola.escribirSaltandoLinea("\n\t Ficha Técnica");
    Consola.escribirSaltandoLinea("Sinopsis:\t\t" + this.sinopsis);
    Consola.escribirSaltandoLinea("Evaluación:\t\t" + this.evaluacion);
    Consola.escribirSaltandoLinea("Nombre del titulo:\t" + this.nombre);
    Consola.escribirSaltandoLinea("Tiempo de duración:\t" + this.tiempoDeDuracionEnMinutos);
    Consola.escribirSaltandoLinea("Fecha de lanzamiento:\t" + this.fechaDeLanzamiento);
  }
}
