package example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // DEFAULT
        class SupplierFunction implements Supplier<List<String>> {
            @Override
            public List<String> get() {
                return Arrays.asList(
                        "Áries: do 21 de março a 20 de abril",
                        "Touro: de 21 de abril a 20 de maio",
                        "Gêmeos: de 21 de maio a 20 de junho",
                        "Câncer: de 21 de junho a 22 de julho",
                        "Leão: de 23 de julho a 22 de agosto",
                        "Virgem: de 23 de agosto a 22 de setembro",
                        "Libra: de 23 de setembro a 22 de outubro",
                        "Escorpião: de 23 de outubro a 21 de novembro",
                        "Sagitário: de 22 de novembro a 21 de dezembro",
                        "Capricórnio: de 22 de dezembro a 20 de janeiro",
                        "Aquário: de 21 de janeiro a 18 de fevereiro",
                        "Peixes: de 19 de fevereiro a 20 de março"
                );
            }
        }
        System.out.println(new SupplierFunction().get());

        // ANONYMOUS FUNCTION
        Supplier<List<String>> signSupplierAnonymousFunction = new Supplier<List<String>>() {
            @Override
            public List<String> get() {
                return Arrays.asList(
                        "Áries: do 21 de março a 20 de abril",
                        "Touro: de 21 de abril a 20 de maio",
                        "Gêmeos: de 21 de maio a 20 de junho",
                        "Câncer: de 21 de junho a 22 de julho",
                        "Leão: de 23 de julho a 22 de agosto",
                        "Virgem: de 23 de agosto a 22 de setembro",
                        "Libra: de 23 de setembro a 22 de outubro",
                        "Escorpião: de 23 de outubro a 21 de novembro",
                        "Sagitário: de 22 de novembro a 21 de dezembro",
                        "Capricórnio: de 22 de dezembro a 20 de janeiro",
                        "Aquário: de 21 de janeiro a 18 de fevereiro",
                        "Peixes: de 19 de fevereiro a 20 de março"
                );
            }
        };
        System.out.println(signSupplierAnonymousFunction.get());

        // LAMBDA
        Supplier<List<String>> signSupplierLambda = () -> Arrays.asList(
                "Áries: do 21 de março a 20 de abril",
                "Touro: de 21 de abril a 20 de maio",
                "Gêmeos: de 21 de maio a 20 de junho",
                "Câncer: de 21 de junho a 22 de julho",
                "Leão: de 23 de julho a 22 de agosto",
                "Virgem: de 23 de agosto a 22 de setembro",
                "Libra: de 23 de setembro a 22 de outubro",
                "Escorpião: de 23 de outubro a 21 de novembro",
                "Sagitário: de 22 de novembro a 21 de dezembro",
                "Capricórnio: de 22 de dezembro a 20 de janeiro",
                "Aquário: de 21 de janeiro a 18 de fevereiro",
                "Peixes: de 19 de fevereiro a 20 de março"
        );
        System.out.println(signSupplierLambda.get());

    }

}
