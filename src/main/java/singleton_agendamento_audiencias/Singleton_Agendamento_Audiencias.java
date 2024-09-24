/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package singleton_agendamento_audiencias;

/**
 *
 * @author rafaelamoreira
 */
public class Singleton_Agendamento_Audiencias {

    public static void main(String[] args) {
       
        GerenciadordeAgendamento g1 = GerenciadordeAgendamento.getInstancia();

        // Agendando uma audiência
        System.out.println(g1.agendarAudiencia("2024-09-24 10:00", "Caso A"));

        // Tentativa de agendar no mesmo horário (deve retornar um conflito)
        System.out.println(g1.agendarAudiencia("2024-09-24 10:00", "Caso B"));

        // Agendando em um novo horário
        System.out.println(g1.agendarAudiencia("2024-09-24 11:00", "Caso B"));

        // Visualizando a agenda completa
        System.out.println(g1.visualizarAgenda());

        // Tentativa de obter outra instância
        GerenciadordeAgendamento g2 = GerenciadordeAgendamento.getInstancia();

        // Verificando se as instâncias são as mesmas
        System.out.println(g1 == g2);  
    }

}

