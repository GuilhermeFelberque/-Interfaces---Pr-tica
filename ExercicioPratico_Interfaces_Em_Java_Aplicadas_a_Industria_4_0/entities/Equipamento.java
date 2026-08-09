package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities;

public abstract class Equipamento {

    protected String codigo;
    protected String nomeEquipamento;

    public Equipamento(String codigo, String nomeEquipamento) {
        this.codigo = codigo;
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public abstract String status();
}