package academy.devdojo.maratonajava.introduction;

/**
 * Prática
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */
public class PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Harry";
        String address = "4 Privet Drive";
        float earningDate = 3000;
        String date = "01-07-2023";

        System.out.println("Eu "+name+ ", morando no endereço "+address+", confirmo que recebi o salário de "+earningDate+" Dólares, na data de "+date+".");
    }
}
