/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;


public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
//    public void entrarNoSistema(){
//        Usuario usuario = this.helper.obterModelo();
//        UsuarioDAO usuarioDAO = new UsuarioDAO();
//        Usuario usuarioAutenticado =  usuarioDAO.selectPorNomeESenha(usuario);
//        
//        if(usuarioAutenticado != null) {
//            MenuPrincipal menu = new MenuPrincipal();
//            menu.setVisible(true);
//            view.dispose();
//        } else {
//            view.exibeMensagem("Usuario ou senha invalidos");
//        }
//    }
}
