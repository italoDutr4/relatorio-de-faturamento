package relatorio;

        import java.time.LocalDate;
        import java.util.*;

public class Relatorio {

    public static void main(String[] args) {

        int mes = 2;
        double valor = 0;
        int count = 0;
        double media;
        double compara = 0;

        Faturamento faturamento1 = new Faturamento(LocalDate.parse("2022-07-02"),1500.00);
        Faturamento faturamento2 = new Faturamento(LocalDate.parse("2022-02-04"),3000.00);
        Faturamento faturamento3 = new Faturamento(LocalDate.parse("2022-02-02"),1100.00);
        Faturamento faturamento4 = new Faturamento(LocalDate.parse("2022-02-03"),2000.00);

        List<Faturamento> faturamento = Arrays.asList(faturamento1,faturamento2,faturamento3, faturamento4);

        for (Faturamento value : faturamento) {
            if (mes == value.getData().getMonthValue() && value.getValor() > compara) {
                compara = value.getValor();
            }
        }
        System.out.println("Maior faturamento do Mes "+mes+ " é "+compara);

        for (Faturamento value : faturamento) {
            if (mes == value.getData().getMonthValue() && value.getValor() < compara) {
                compara = value.getValor();
            }
        }
        System.out.println("Menor faturamento do Mes "+mes+ " é "+compara);

        for (Faturamento value : faturamento) {
            if (mes == value.getData().getMonthValue()) {
                valor += value.getValor();
                count++;
            }
        }

        media = valor / count;
        count = 0;

        for (Faturamento value : faturamento) {
            if (mes == value.getData().getMonthValue() && value.getValor() > media) {
                count++;
            }
        }
        System.out.print("Numero de Dias que faturamento maior que a media "+count);
    }
}

