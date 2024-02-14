public class CostePersonal {

    public static float calcularCosteDelPersonal(Trabajador[] trabajadores) {
        if (trabajadores == null || trabajadores.length == 0) {
            throw new IllegalArgumentException("No hay trabajadores");
        }

        float costeTotal = 0;

        for (Trabajador trabajador : trabajadores) {
            
			float nomina = trabajador.getNomina();
            float horasExtras = trabajador.getHorasExtras();

            if  (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR || trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
                costeTotal += nomina;
            } else {
                costeTotal += nomina + (horasExtras * 20);
            }
        }

        return costeTotal;
    }
}
