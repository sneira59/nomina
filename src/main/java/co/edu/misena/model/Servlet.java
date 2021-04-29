package co.edu.misena.model;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        float sp;
        float subsidio;
        float salud;
        float pension;
        float arl;
        float dt;
        float total;




        String nombres = request.getParameter("nombres");
        String apellido = request.getParameter("apellido");
        String quantity = request.getParameter("quantity");
        String dias = request.getParameter("dias");
        String sm = request.getParameter("sm");

        sp=Integer.parseInt(sm)/30*Integer.parseInt(dias);
        subsidio=106000;
        salud=sp*0.12F;
        pension=sp*0.16F;
        arl=sp*0.522F;

        dt=salud+pension+arl;
        total=dt+sp;




        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()) {
            out.println("Nombre:"+ nombres+"\n");
            out.println("\nApellido:"+ apellido);
            out.println("Documento"+ quantity);
            out.println("Dias"+ dias);
            out.println("Sueldo a pagar"+ sp);
            out.println("Subsidio:"+ subsidio);
            out.println("Descuento de salud:"+ salud);
            out.println("Descuento de pension"+ pension);
            out.println("Descuento de arl"+ arl);
            out.println("Descuento Total"+ dt);
            out.println("El total es"+ total);












        }





    }
}
