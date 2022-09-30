package example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<Set<LocalDateTime>> consumer1 = new ConsumerFunction();

        LocalDateTime localDateTimeSogolon = LocalDateTime.of(1992, 8, 1, 6, 5);
        LocalDateTime localDateTimeIuri = LocalDateTime.of(1999, 6, 22, 8, 23);
        LocalDateTime localDateTimeMatheus = LocalDateTime.of(1991, 9, 19, 4, 59);
        LocalDateTime localDateTimeVitoria = LocalDateTime.of(1993, 8, 30, 2, 34);
        LocalDateTime localDateTimeTomas = LocalDateTime.of(1999, 8, 30, 7, 2);

        Set<LocalDateTime> localDateTimeSet1 = Set.of(localDateTimeIuri, localDateTimeTomas, localDateTimeMatheus, localDateTimeSogolon, localDateTimeVitoria);

        System.out.println("---------------- Default ----------------");

        consumer1.accept(localDateTimeSet1);

        System.out.println("---------------- Anonymous Function ----------------");

        Consumer<Set<LocalDateTime>> consumer2 = new Consumer<Set<LocalDateTime>>() {
            @Override
            public void accept(Set<LocalDateTime> localDateTimes) {
                localDateTimes.forEach(localDateTime -> System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));
            }
        };
        Set<LocalDateTime> localDateTimeSet2 = Set.of(localDateTimeIuri, localDateTimeTomas, localDateTimeMatheus, localDateTimeSogolon, localDateTimeVitoria);

        consumer2.accept(localDateTimeSet2);

        System.out.println("---------------- Lambda ----------------");

        Consumer<Set<LocalDateTime>> consumer3 = localDateTimes -> localDateTimes.forEach(localDateTime -> System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));
        Set<LocalDateTime> localDateTimeSet3 = Set.of(localDateTimeIuri, localDateTimeTomas, localDateTimeMatheus, localDateTimeSogolon, localDateTimeVitoria);

        consumer3.accept(localDateTimeSet3);
    }

    // Default
    static class ConsumerFunction implements Consumer<Set<LocalDateTime>> {
        @Override
        public void accept(Set<LocalDateTime> localDateTimes) {
            localDateTimes.forEach(localDateTime -> System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))));
        }
    }

}
