/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadejemplo;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author facun
 */
public class UniversidadEjemplo {

    /**
     * @param args the command line arguments
     */
    public void cargarAlumnos() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");

            String sqlAlumno = "INSERT INTO alumno(idAlumno,dni,apellido,nombre,fechaNacimiento,estado)"
                    + "VALUES()";

            PreparedStatement ps = conexion.prepareStatement(sqlAlumno);
            int registros = ps.executeUpdate();
            System.out.println(registros);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de drivers" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }
    }

    public void cargarMaterias() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");

            String sqlMateria = "INSERT INTO materia(idMateria,nombre,año,estado)"
                    + "VALUES()";

            PreparedStatement ps = conexion.prepareStatement(sqlMateria);
            int registroMat = ps.executeUpdate();
            System.out.println(registroMat);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de drivers" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }
    }

   

    public static void main(String[] args) throws SQLException {

       

    }
}
