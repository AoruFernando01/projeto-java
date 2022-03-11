/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
   ░░░░░░░███████████]▄▄▄▄▄▄▄▄▄▄▄▃
           ▂▄▅███𝕱𝔢𝔯𝔫𝔫𝔡███▅▄▃▂
   I█████████████████████████].
   ◥⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙▲⊙◤
 **/

public class Main {
    
    public static void main(String[] args){
        
        Cliente cliente = new Cliente(666, "SKSS", "1111-11", "RUA-DAS-CORRIDAS"); 
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(666, "SKSS", "senha");
        System.out.println(usuario.getNome());
        
        Servico servico = new Servico(666, "SKSS", 1000);
        
        Agendamento agendamento = new Agendamento(666, cliente, servico, 1000, "22/22/2202 09:15");
        System.out.println(agendamento.getCliente().getNome());
    }
}
