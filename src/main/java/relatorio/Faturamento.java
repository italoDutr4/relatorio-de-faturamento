package relatorio;

import java.time.LocalDate;
        import java.util.Date;

public class Faturamento{

    LocalDate data;
    Double valor;


    public Faturamento(LocalDate data, Double valor){

        this.data = data;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Faturamento{" +
                "data=" + data +
                ", valor=" + valor +
                '}';
    }



}

