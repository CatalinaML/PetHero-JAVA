package DAO;

import Models.Duenio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DuenioDAO implements IAccesoDatos<Duenio> {

    private static final String JDBC_SELECT = "SELECT * FROM duenio INNER JOIN user u ON duenio.id_duenio = u.id_user";
    private static final String JDBC_BUSCAR = "SELECT * FROM duenio INNER JOIN user u ON duenio.id_duenio = u.id_user WHERE id_duenio = ?";
    private static final String INSERT_USER = "INSERT INTO user (username, pass, nombre, apellido, nacimiento, email, ciudad) VALUES (?,?,?,?,?,?,?) ";
    private static final String BUSCAR_USER = "SELECT * FROM user WHERE username = ?";
    static final String INSERT_DUENIO = "INSERT INTO duenio (id_duenio) VALUE (?)";

    @Override
    public List listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Duenio duenio = null;
        List<Duenio> duenios = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(JDBC_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                duenio = new Duenio(rs.getInt("id_duenio"),
                        rs.getString("username"),
                        rs.getString("pass"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("nacimiento"),
                        rs.getString("email"),
                        rs.getString("ciudad"));
                duenios.add(duenio);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return duenios;
    }

    @Override
    public Duenio buscar(Duenio buscar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insertar(Duenio insertar) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        //COMPROBACION PARA QUE NO HAYA 2 USERNAME IGUALES, SI EXISTE NO SE INSERTA
        Duenio existe = this.buscarUser(insertar.getUserName());
        System.out.println("existe = " + existe);
        if (existe == null) {
            try {
                conn = Conexion.getConnection();
                stmt = conn.prepareStatement(INSERT_USER);
                //apellido, nacimiento, email, ciudad
                stmt.setString(1, insertar.getUserName());
                stmt.setString(2, insertar.getPassword());
                stmt.setString(3, insertar.getNombre());
                stmt.setString(4, insertar.getApellido());
                stmt.setString(5, insertar.getNacimiento());
                stmt.setString(6, insertar.getEmail());
                stmt.setString(7, insertar.getCiudad());

                rows = stmt.executeUpdate();
                System.out.println("registros user = " + rows);
                if (rows == 1) {
                    //BUSCO EL USER RECIÉN INSERTADO
                    Duenio duenioBuscado = this.buscarUser(insertar.getUserName());
                    //INSERTO DUEÑO
                    this.insertarDuenio(duenioBuscado.getIdUser());

                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            } finally {
                Conexion.close(stmt);
                Conexion.close(conn);
            }
        }
        return rows;
    }

    private int insertarDuenio(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(INSERT_DUENIO);
            stmt.setInt(1, id);

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DuenioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    //busca el dueño por su username
    public Duenio buscarUser(String username) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Duenio duenio = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(BUSCAR_USER);
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            rs.next();

                duenio = new Duenio(rs.getInt("id_user"),
                        rs.getString("username"),
                        rs.getString("pass"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("nacimiento"),
                        rs.getString("email"),
                        rs.getString("ciudad"));
                Conexion.close(rs);

            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        System.out.println("duenio = " + duenio);
        return duenio;
    }

    @Override
    public int actualizar(Duenio actualizar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar(Duenio eliminar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}