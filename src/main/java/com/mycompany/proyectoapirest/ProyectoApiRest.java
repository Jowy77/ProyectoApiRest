package com.mycompany.proyectoapirest;


import com.mycompany.proyectoapirest.vistas.principalView;


/**
 *
 * @author Iproy
 */
public class ProyectoApiRest {

    public static void main(String[] args) {

        RestClient client = new RestClient();
        
        
        principalView view = new principalView();
        view.setVisible(true);
    }
}
