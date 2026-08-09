package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities;

import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.ConectavelIoT;
import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.Manutenivel;
import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.Programvel;

public class CLP extends DispositivoIoT implements Manutenivel, ConectavelIoT, Programvel {

    private String statusAtual;

    public CLP(String codigo, String nomeEquipamento, String statusAtual) {
        super(codigo, nomeEquipamento);
        this.statusAtual = statusAtual;
    }

    @Override
    public String status() {
        return "CLP " + nomeEquipamento + " (" + codigo + ") está: " + statusAtual;
    }

    @Override
    public String coletarDado() {
        return "Ciclo de operação: 340 execuções/hora";
    }

    @Override
    public void agendarManutencao() {
        System.out.println("Manutenção agendada para o CLP " + nomeEquipamento);
    }

    @Override
    public void registrarFalha(String descricao) {
        System.out.println("Falha registrada no CLP " + nomeEquipamento + ": " + descricao);
    }

    @Override
    public void diagnosticar() {
        System.out.println("Diagnóstico do CLP " + nomeEquipamento + ": lógica de controle estável.");
    }

    @Override
    public void enviarDadosNuvem() {
        System.out.println("CLP " + nomeEquipamento + " enviando dado para a nuvem: " + coletarDado());
    }

    @Override
    public void receberComando(String comando) {
        System.out.println("CLP " + nomeEquipamento + " recebeu o comando: " + comando);
    }

    @Override
    public void carregarPrograma(String nomePrograma) {
        System.out.println("CLP " + nomeEquipamento + " carregando o programa: " + nomePrograma);
    }
}