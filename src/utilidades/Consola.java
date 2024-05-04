package utilidades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Consola {

  private static BufferedReader leerPila = new BufferedReader(new InputStreamReader(System.in));

  public static <T> boolean escribirSaltandoLinea(T etiquetaMensaje) {
    try{
      System.out.println(etiquetaMensaje);
      return true;
    }catch (Exception e) {
      return false;
    }
  }

  public static <T> boolean escribirSaltandoLinea(T [] listaOpciones) { 
    for (int indice = 0; indice < listaOpciones.length; indice++) {
      if(!escribirSaltandoLinea((indice + 1) + "." + listaOpciones[indice])){
        escribirSaltandoLinea("No hay un dato correcto en la lista");
        escribirSaltandoLinea(indice + "Posición de la lista con el error");
      }
    }
    return true;
  }

  public static <T> boolean escribir(T etiquetaMensaje) {
    try {
      System.out.print(etiquetaMensaje);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @SuppressWarnings("unchecked")
  private static <T> T leer(T variableIngresada){
    String valorIngresado = "", opcion = "";
    T copiaVariableIngresada = variableIngresada;
    try{
      valorIngresado = leerPila.readLine();
      opcion = ((Object) variableIngresada).getClass().getSimpleName();
      switch(opcion) {
        case "String" -> { if(!esNumero(valorIngresado)) variableIngresada = (T) String.valueOf(valorIngresado.trim()); }
        case "Double" -> { if(esNumero(valorIngresado) || valorIngresado.contains(".")) variableIngresada = (T) Double.valueOf(valorIngresado.trim()); }
        case "Float" -> { if(esNumero(valorIngresado) && valorIngresado.contains(".")) variableIngresada = (T) Float.valueOf(valorIngresado.trim()); }
        case "Integer" -> { if(esNumero(valorIngresado)) variableIngresada = (T) Integer.valueOf(valorIngresado.trim()); }
      }
    } catch (Exception e) {
      escribirSaltandoLinea("Ocurrió un error al leer opciones");
    }
    if (copiaVariableIngresada.equals(variableIngresada)) escribirSaltandoLinea("Valor ingresado incorrecto");
    return variableIngresada;
  }

  public static <T> T leer(String etiquetaMensaje, T variableIngresada) {
    T resultado = null;
    do {
      escribirSaltandoLinea(etiquetaMensaje);
      resultado = leer(variableIngresada);
    } while (variableIngresada.equals(resultado));
    return resultado;
  }

  public static boolean esNumero(String cadena){
    return cadena.matches("[+-]?\\d*(\\.\\d+)?");
  }
}
