/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Nomina;
import Modelo.Empleado;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Familia
 */
public class Captura extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Nomina obj=new Nomina();
            
            obj.setId(request.getParameter("id_empleado"));
            obj.setNombre(request.getParameter("nombre"));
            obj.setCedula(request.getParameter("cedula"));
            obj.setSalario(Double.parseDouble(request.getParameter("salarios")));
            obj.setDias(Integer.parseInt(request.getParameter("dias")));
            obj.getTotalDev();
            
            request.setAttribute("respuesta", obj);
        
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            RequestDispatcher a= request.getRequestDispatcher("index.jsp");
            a.forward(request, response);
    
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
       /* String id_empleado=request.getParameter("id_empleado");
        String nombre=request.getParameter("nombre");
        String cedula=request.getParameter("cedula");
        String salario=request.getParameter("salarios");
        String otro=request.getParameter("control");
        String dias=request.getParameter("dias");

        System.out.println("Id Empleado: "+id_empleado+"Nombre: "+nombre+"Cedula: "+cedula+"Salario: "+salario+"Otro: "+otro+"Dias: "+dias);*/

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
