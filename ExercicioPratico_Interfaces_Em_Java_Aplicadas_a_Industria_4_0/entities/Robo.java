package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities;

import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.ConectavelIoT;
import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.Manutenivel;
import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.Programvel;

public class Robo extends MaquinaProducao implements Manutenivel, ConectavelIoT, Programvel {

    private String statusAtual;

    public Robo(String codigo, String nomeEquipamento, String statusAtual) {
        super(codigo, nomeEquipamento);
        this.statusAtual = statusAtual;
    }

    @Override
    public String status() {
        return "Robô " + nomeEquipamento + " (" + codigo + ") está: " + statusAtual;
    }

    @Override
    public String produzir() {
        return "Robô " + nomeEquipamento + " realizando solda automatizada.";
    }

    @Override
    public void agendarManutencao() {
        System.out.println("Manutenção agendada para o robô " + nomeEquipamento);
    }

    @Override
    public void registrarFalha(String descricao) {
        System.out.println("Falha registrada no robô " + nomeEquipamento + ": " + descricao);
    }

    @Override
    public void diagnosticar() {
        System.out.println("Diagnóstico do robô " + nomeEquipamento + ": sistemas dentro do esperado.");
    }

    @Override
    public void enviarDadosNuvem() {
        System.out.println("Robô " + nomeEquipamento + " enviando dados de produção para a nuvem...");
    }

    @Override
    public void receberComando(String comando) {
        System.out.println("Robô " + nomeEquipamento + " recebeu o comando: " + comando);
    }

    @Override
    public void carregarPrograma(String nomePrograma) {
        System.out.println("Robô " + nomeEquipamento + " carregando o programa: " + nomePrograma);
    }
}