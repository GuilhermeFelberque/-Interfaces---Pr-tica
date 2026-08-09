package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities;

public abstract class MaquinaProducao extends Equipamento {

    public MaquinaProducao(String codigo, String nomeEquipamento) {
        super(codigo, nomeEquipamento);
    }

    public abstract String produzir();
}