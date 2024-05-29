package examen;

public class Hora {
	/**
	 * @author Javier Ruiz
	 * @version 1.0
	 */
	public static boolean horaValida;
/**
 * Es un método para comprobar si la hora es válida o correcta, ya que va comprobando los valores de la hora minutos y segundos.
 * @param segundos
 * @param minutos
 * @param horas
 * @return Devuelve el valor de horaValida.
 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}