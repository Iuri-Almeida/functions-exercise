package example;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<LocalDateTime> predicateDefault = new PredicateFunction();

        LocalDateTime localDateTimeSogolon = LocalDateTime.of(1992, 8, 1, 6, 5);
        LocalDateTime localDateTimeIuri = LocalDateTime.of(1999, 6, 22, 8, 23);
        LocalDateTime localDateTimeMatheus = LocalDateTime.of(1991, 9, 19, 4, 59);
        LocalDateTime localDateTimeVitoria = LocalDateTime.of(1993, 8, 30, 2, 34);
        LocalDateTime localDateTimeTomas = LocalDateTime.of(1999, 8, 30, 7, 2);

        Set<LocalDateTime> localDateTimeSet = Set.of(localDateTimeIuri, localDateTimeTomas, localDateTimeMatheus, localDateTimeSogolon, localDateTimeVitoria);

        System.out.println("---------------- Default ----------------");
        localDateTimeSet.forEach(date -> System.out.println("Geração Z ? " + predicateDefault.test(date)));


        System.out.println("---------------- Anonymous Function ----------------");
        Predicate<LocalDateTime> predicateAnonymousFunc = new Predicate<LocalDateTime>() {
            @Override
            public boolean test(LocalDateTime localDateTime) {
                return localDateTime.getYear() >= 1995 && localDateTime.getYear() <= 2010;
            }
        };

        localDateTimeSet.forEach(date -> System.out.println("Geração Z ? " + predicateAnonymousFunc.test(date)));

        System.out.println("---------------- Lambda ----------------");
        Predicate<LocalDateTime> predicateLambda = dateTime -> dateTime.getYear() >= 1995 && dateTime.getYear() <= 2010;

        localDateTimeSet.forEach(date -> System.out.println("Geração Z ? " + predicateLambda.test(date)));

    }

    static class PredicateFunction implements Predicate<LocalDateTime> {

        @Override
        public boolean test(LocalDateTime dateTime) {
            return dateTime.getYear() >= 1995 && dateTime.getYear() <= 2010;
        }
    }
}
