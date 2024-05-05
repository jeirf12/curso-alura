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

public class Serie extends Titulo {

  private Integer temporadas;

  private Integer episodioPorTemporada;

  private Integer duracionEnMinutosPorEpisodio;

  public Serie() {
    super();
    this.temporadas = 0;
    this.episodioPorTemporada = 0;
    this.duracionEnMinutosPorEpisodio = 0;
  }
  
  public Serie(String nombre, Integer fechaDeLanzamiento, Boolean estaIncluidoEnelPlanBasico, String sinopsis, Integer temporadas, Integer episodioPorTemporada, Integer duracionEnMinutosPorEpisodio) {
    super(nombre, fechaDeLanzamiento, estaIncluidoEnelPlanBasico, sinopsis, temporadas * episodioPorTemporada * duracionEnMinutosPorEpisodio);
    this.temporadas = temporadas;
    this.episodioPorTemporada = episodioPorTemporada;
    this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
  }

  public void setTemporadas(Integer temporadas) {
    this.temporadas = temporadas;
  }

  public Integer getTemporadas() {
    return this.temporadas;
  }

  public void setEpisodioPorTemporada(Integer episodioPorTemporada) {
    this.episodioPorTemporada = episodioPorTemporada;
  }

  public Integer getEpisodioPorTemporada() {
    return this.temporadas;
  }

  public void setDuracionEnMinutosPorEpisodio(Integer duracionEnMinutosPorEpisodio) {
    this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
  }

  public Integer getDuracionEnMinutosPorEpisodio() {
    return this.temporadas;
  }
}
