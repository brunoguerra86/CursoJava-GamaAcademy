public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public void setTime(int h, int m, int s) {
        hora = h;
        minuto = m;
        segundo = s;
    }

    public String exibirHoraUniversal() {
        return (String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo));
    }

    public String exibirHoraPadrao() {
        if (hora > 12)
            return (String.format("%02d", hora - 12) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo) + " PM");
        else if (hora == 12)
            return (String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo) + " PM");
        else
            return (String.format("%02d", hora) + ":" + String.format("%02d", minuto) + ":" + String.format("%02d", segundo) + " AM");
    }
}
