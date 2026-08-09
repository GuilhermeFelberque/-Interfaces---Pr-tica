package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities;

import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.Manutenivel;

public class EsteiraTransportadora extends MaquinaProducao implements Manutenivel {

    private String statusAtual;

    public EsteiraTransportadora(String codigo, String nomeEquipamento, String statusAtual) {
        super(codigo, nomeEquipamento);
        this.statusAtual = statusAtual;
    }

    @Override
    public String status() {
        return "Esteira " + nomeEquipamento + " (" + codigo + ") está: " + statusAtual;
    }

    @Override
    public String produzir() {
        return "Esteira " + nomeEquipamento + " transportando peças na linha.";
    }

    @Override
    public void agendarManutencao() {
        System.out.println("Manutenção agendada para a esteira " + nomeEquipamento);
    }

    @Override
    public void registrarFalha(String descricao) {
        System.out.println("Falha registrada na esteira " + nomeEquipamento + ": " + descricao);
    }

    @Override
    public void diagnosticar() {
        System.out.println("Diagnóstico da esteira " + nomeEquipamento + ": correia sem desgaste aparente.");
    }
}