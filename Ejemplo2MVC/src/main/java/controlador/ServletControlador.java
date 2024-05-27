package controlador;

import Modelo.Rectangulo;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1.procesamos parametros
        String accion = request.getParameter("accion");

        //2.creamos los javaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);//SCOPE request
        Rectangulo recSesion = new Rectangulo(3, 4);//SCOPE sesion
        Rectangulo recAplicacion = new Rectangulo(5, 6);//SCOPE Aplicacion

        //3.Agregamos el javaBean a alcun alcance
        if ("agregarVariables".equals(accion)) {
            //alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            //alcance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            //alcance aplicacion
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);
            //agregamos un mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
            //4. redireccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if ("listarVariable".equals(accion)) {
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        } else {
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
