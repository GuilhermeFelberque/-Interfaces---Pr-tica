package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities;

import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.ConectavelIoT;

public class SensorTemperatura extends DispositivoIoT implements ConectavelIoT {

    private String statusAtual;

    public SensorTemperatura(String codigo, String nomeEquipamento, String statusAtual) {
        super(codigo, nomeEquipamento);
        this.statusAtual = statusAtual;
    }

    @Override
    public String status() {
        return "Sensor " + nomeEquipamento + " (" + codigo + ") está: " + statusAtual;
    }

    @Override
    public String coletarDado() {
        return "Temperatura atual: 23.5°C";
    }

    @Override
    public void enviarDadosNuvem() {
        System.out.println("Sensor " + nomeEquipamento + " enviando dado para a nuvem: " + coletarDado());
    }

    @Override
    public void receberComando(String comando) {
        System.out.println("Sensor " + nomeEquipamento + " recebeu o comando: " + comando);
    }
}