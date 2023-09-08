import java.time.ZonedDateTime;

public class exercicio5 {
    public static void main(String[] args) {

        ZonedDateTime data = ZonedDateTime.now();

        var fimDoDia = data.withHour(23).withMinute(59).withSecond(59);
        var incioDoDia = data.withHour(00).withMinute(00).withSecond(00);

        System.out.println("Se passaram " + (data.toEpochSecond() - incioDoDia.toEpochSecond())
                + " segundos desde o inicio do dia.\nFaltam " + (fimDoDia.toEpochSecond() + 1 - data.toEpochSecond())
                + " segundos para o fim do dia.");
    }
}
