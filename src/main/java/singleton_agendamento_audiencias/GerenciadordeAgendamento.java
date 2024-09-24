/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_agendamento_audiencias;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rafaelamoreira
 */
public class GerenciadordeAgendamento {

    private static GerenciadordeAgendamento instancia;

    // Armazenar os agendamentos
    private Map<String, String> agenda;

    private GerenciadordeAgendamento() {
        agenda = new HashMap<>();
    }

    // Obter a instância única
    public static GerenciadordeAgendamento getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadordeAgendamento();
        }
        return instancia;
    }

    // Agendar uma audiência
    public String agendarAudiencia(String dataHora, String caso) {
        if (agenda.containsKey(dataHora)) {
            return "Horário já agendado para o caso: " + agenda.get(dataHora);
        } else {
            agenda.put(dataHora, caso);
            return "Audiência agendada para o caso " + caso + " em " + dataHora;
        }
    }

    // Visualizar a agenda completa
    public Map<String, String> visualizarAgenda() {
        return agenda;
    }
}
