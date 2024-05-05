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

public class Calculadora {

  private Integer totalMinutos;

  public Calculadora() {
    this.totalMinutos = 0;
  }

  public void ingresarTitulo(Titulo activo) {
    totalMinutos += activo.getTiempoDeDuracionEnMinutos();
  }

  public Integer getTotalMinutos() {
    return this.totalMinutos;
  }
}
