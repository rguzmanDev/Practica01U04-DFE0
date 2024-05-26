/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.Rectangulo;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rguzm
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        //1. Instanciamos el JavaBeans
        Rectangulo rectangulo = new Rectangulo(3,8);
        //2. Agregamos el bean a algun alcance
        request.setAttribute("mensaje","saludo desde el servlet");
        //3.Creando la sesion para el manejo de la variable
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rectangulo);
        //4.Redireccionar a la vista
        RequestDispatcher rd = request.getRequestDispatcher("vista/mostrar.jsp");
    }
}
