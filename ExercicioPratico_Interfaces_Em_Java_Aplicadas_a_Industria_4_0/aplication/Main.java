package ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.aplication;

import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.entities.*;
import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.ConectavelIoT;
import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.Manutenivel;
import ExercicioPratico_Interfaces_Em_Java_Aplicadas_a_Industria_4_0.interfaces.Programvel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instancia um objeto de cada equipamento concreto da fábrica
        Robo robo = new Robo("EQ-001", "Robo Soldador Manivela", "Em operação");
        EsteiraTransportadora esteira = new EsteiraTransportadora("EQ-002", "Esteira Principal", "Ligada");
        SensorTemperatura sensor = new SensorTemperatura("EQ-003", "Sensor de Temperatura A1", "Ativo");
        CLP clp = new CLP("EQ-004", "CPL Linha 1", "Ativo");

        // Lista geral de equipamentos. Graças ao polimorfismo, podemos guardar
        // qualquer objeto que herde de Equipamento (direta ou indiretamente).
        List<Equipamento> equipamentos = new ArrayList<>();
        equipamentos.add(robo);
        equipamentos.add(esteira);
        equipamentos.add(sensor);
        equipamentos.add(clp);

        // // Percorre a lista exibindo o status de cada item.
        // O 'instanceof' confirma o tipo exato do objeto para podermos converter (fazer o casting) e chamar o status() correto com segurança.
        List<Manutenivel> manutenivels = new ArrayList<>();
        for (Equipamento eq : equipamentos) {
            if (eq instanceof Manutenivel) {
                manutenivels.add((Manutenivel) eq);
            }
        }

        // Chama os métodos de manutenção apenas para quem entrou na lista filtrada
        // Sensor não aparece aqui, pois não implementa Manutenivel
        System.out.println("MANUTENÇÃO");
        for (Manutenivel m : manutenivels) {
            m.agendarManutencao();
            m.diagnosticar();
        }

        // Executa a manutenção apenas nos itens filtrados.
        // Sensores ficam de fora por não precisarem/possuírem rotina de manutenção.
        List<ConectavelIoT> conectaveis = new ArrayList<>();
        for (Equipamento eq : equipamentos) {
            if (eq instanceof ConectavelIoT) {
                conectaveis.add((ConectavelIoT) eq);
            }
        }

        // Envia os dados apenas dos dispositivos filtrados.
        // Esteiras são ignoradas por não possuírem conexão IoT.
        System.out.println("ENVIO DE DADOS IOT");
        for (ConectavelIoT c : conectaveis){
            c.enviarDadosNuvem();
        }
        List<Programvel> programvel = new ArrayList<>();
        for (Equipamento eq : equipamentos){
            if (eq instanceof Programvel){
                programvel.add((Programvel) eq);
            }
        }
        System.out.println("CARREGAMENTO DE PROGRAMA");
        for (Programvel p : programvel){
            p.carregarPrograma("Rotina_Producao_v1");
        }
    }
}