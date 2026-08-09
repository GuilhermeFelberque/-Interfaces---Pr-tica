package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities;

public abstract class DispositivoIoT extends Equipamento {

    public DispositivoIoT(String codigo, String nomeEquipamento) {
        super(codigo, nomeEquipamento);
    }

    public abstract String coletarDado();
}