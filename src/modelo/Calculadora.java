package modelo;

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
