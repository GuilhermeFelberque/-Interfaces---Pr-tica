package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces;

public interface Manutenivel {

    void agendarManutencao();

    void registrarFalha(String descricao);

    void diagnosticar();
}
