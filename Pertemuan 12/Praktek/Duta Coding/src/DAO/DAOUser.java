/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAOInterface.ImplementUser;
import java.sql.Connection;
import java.util.List;
import model.ModUser;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;
import koneksi.koneksiDB;

/**
 *
 * @author User
 */
public class DAOUser implements ImplementUser{
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (nik, nama, jk, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?)";
    final String select = " SELECT * FROM tbl_pendaftaran";
    final String cariNama = "SELECT * FROM tbl_pendaftaran WHERE nama like ?";

    public DAOUser() {
        connection = koneksiDB.connection();
    }
    

    @Override
    public void insert(ModUser mu) {
        
        PreparedStatement statement = null;
        
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, mu.getNik());
            statement.setString(2, mu.getNama());
            statement.setString(3, mu.getJk());
            statement.setString(4, mu.getAlamat());
            statement.setInt(5, mu.getUsia());
            statement.setString(6, mu.getAlasan());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                mu.setId(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }

    @Override
    public List<ModUser> getAll() {
       List<ModUser> lmb = null;
       
       
        try {
            lmb = new ArrayList<ModUser>();
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModUser mu = new ModUser();
                mu.setId(rs.getInt("id"));
                mu.setNik(rs.getInt("nik"));
                mu.setNama(rs.getString("nama"));
                mu.setJk(rs.getString("jk"));
                mu.setAlamat(rs.getString("alamat"));
                mu.setUsia(rs.getInt("usia"));
                mu.setAlasan(rs.getString("alasan"));
                lmb.add(mu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return lmb;
    }

    @Override
    public List<ModUser> getCariNama(String nama) {
        List<ModUser> lmb = null;
        
        try{
            lmb = new ArrayList<ModUser>();
            
            PreparedStatement st = connection.prepareStatement(cariNama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ModUser mu = new ModUser();
                mu.setId(rs.getInt("id"));
                mu.setNik(rs.getInt("nik"));
                mu.setNama(rs.getString("nama"));
                mu.setJk(rs.getString("jk"));
                mu.setAlamat(rs.getString("alamat"));
                mu.setUsia(rs.getInt("usia"));
                mu.setAlasan(rs.getString("alasan"));
                lmb.add(mu);
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return lmb;
    }
}
