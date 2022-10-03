package example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ComparatorExample {

    public static void main(String[] args) {

        LocalDateTime localDateTimeSogolon = LocalDateTime.of(1992, 8, 1, 6, 5);
        LocalDateTime localDateTimeIuri = LocalDateTime.of(1999, 6, 22, 8, 23);
        LocalDateTime localDateTimeMatheus = LocalDateTime.of(1991, 9, 19, 4, 59);
        LocalDateTime localDateTimeVitoria = LocalDateTime.of(1993, 8, 30, 2, 34);
        LocalDateTime localDateTimeTomas = LocalDateTime.of(1999, 8, 30, 7, 2);

        Set<LocalDateTime> localDateTimeSet = Set.of(localDateTimeIuri, localDateTimeTomas, localDateTimeMatheus, localDateTimeSogolon, localDateTimeVitoria);

        Function<LocalDateTime, Period> toIdade = new Function<LocalDateTime, Period>() {
            @Override
            public Period apply(LocalDateTime dateTime) {
                return Period.between(dateTime.toLocalDate(), LocalDate.now());
            }
        };

        System.out.println("--- Lista de idades ---");
        List<Period> idades = new ArrayList<>();

        for (LocalDateTime d: localDateTimeSet) {
            idades.add(toIdade.apply(d));
        }

        idades.forEach(idade -> System.out.println(idade.getYears()));

        idades.sort(Comparator.comparing(Period::getYears));

        System.out.println("--- Lista de idades Ordenadas ---");

        for (Period idade : idades) {
            System.out.println(idade.getYears());
        }
    }
}
