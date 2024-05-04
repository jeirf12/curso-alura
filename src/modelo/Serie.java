package modelo;

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
