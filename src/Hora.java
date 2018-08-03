

public class Hora implements Comparable<Hora> {
	
	private int hh;

	private int mm;

	public Hora(int h, int m) {
		if (h < 0 || h > 23 || m < 0 || m > 59)
			throw new IllegalArgumentException("La hora o los minutos no están en el rango adecuado: " + h + ":" + m);
		hh = h;
		mm = m;
	}

	public int getHora() {
		return hh;
	}

	public int getMinuto() {
		return mm;
	}

	public boolean equals(Object o) {
		boolean res = o instanceof Hora;
		Hora hora = res ? (Hora) o : null;
		return res && hh == hora.hh && mm == hora.mm;
	}

	public int hashCode() {
		return Integer.hashCode(hh * 60 + mm);
	}

	public int compareTo(Hora hora) {
		int res = Integer.compare(hh, hora.hh);
		if (res == 0)
			res = Integer.compare(mm, hora.mm);
		return res;
	}


	public int diferenciaMinutos(Hora hora) {
		int minutos = hh * 60 + mm;
		int minutosHora = hora.hh * 60 + hora.mm;
		return Math.abs(minutos - minutosHora);
	}


	public Hora horaTrasMinutos(int minutos) {
		int minTotales = mm + minutos;
		return new Hora((hh + minTotales / 60) % 24, minTotales % 60);
	}

	
	public String toString() {
		return cero(hh) + ":" + cero(mm);
	}

	private static String cero(int i) {
		return (i < 10 ? "0" : "") + i;
	}
}
