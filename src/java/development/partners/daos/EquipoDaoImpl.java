/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development.partners.daos;

import conexionDB.ConexionDB;
import development.partners.models.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DeveloperSr
 */
public class EquipoDaoImpl implements EquipoDao {

    private ConexionDB conexion = null;

    public EquipoDaoImpl() {
        conexion = new ConexionDB();
    }

    @Override
    public List<Equipo> listaEquipos() {
        ResultSet rs;
        String queryVerEquipos = "SELECT * FROM cascaronbd";
        List<Equipo> listaEquipos = new ArrayList<>();

        try {
            rs = conexion.selectQuery(queryVerEquipos);
            conexion.conecta();
            while (rs.next()) {
                Equipo equipo = new Equipo();
                equipo.setNo_serie(rs.getString("no_serie"));
                equipo.setMarca(rs.getString("marca"));
                equipo.setModelo(rs.getString("modelo"));
                equipo.setSo(rs.getString("so"));
                equipo.setHd(rs.getString("hd"));
                equipo.setRam(rs.getString("ram"));
                equipo.setIp(rs.getString("ip"));
                equipo.setEstado(rs.getString("estado"));
                listaEquipos.add(equipo);

            }
            conexion.desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(EquipoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEquipos;
    }
}
