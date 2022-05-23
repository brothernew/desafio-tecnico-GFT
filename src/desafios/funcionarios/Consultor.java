package desafios.funcionarios;

public class Consultor extends Funcionario{

    private double valorHora;
    private long horastrabalhadas;

    public Consultor(String nome, long cpf, double valorHora, long horastrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horastrabalhadas = horastrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horastrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public long getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(long horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }
}
