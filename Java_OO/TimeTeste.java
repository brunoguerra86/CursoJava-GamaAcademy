public class TimeTeste {
    public static void main(String args[]){
        Time t1 = new Time();

        t1.setTime(00,30,00);
        System.out.println(t1.exibirHoraPadrao());

        t1.setTime(12,30,00);
        System.out.println(t1.exibirHoraPadrao());

        t1.setTime(11,59,00);
        System.out.println(t1.exibirHoraPadrao());

        t1.setTime(23,59,00);
        System.out.println(t1.exibirHoraPadrao());

        t1.setTime(13,59,00);
        System.out.println(t1.exibirHoraPadrao());
    }
}