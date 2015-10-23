/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Bonus;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author azank
 */
public class BonusDAO extends DAO<Bonus, String> {

    private static BonusDAO instanceCompteDAO;

    private BonusDAO() {
        super();
    }

    @Override
    public boolean create(Bonus obj) {
        try {
            PreparedStatement st = null;
            st = connect.prepareStatement("insert into  bonus (ssn,bonus) values(?,?)");
            st.setString(1, String.valueOf(obj.getSsn()));
            st.setDouble(2, Integer.parseInt(obj.getBonus()));
            st.executeUpdate();
            connect.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return false;
    }

    public Bonus find(String id) {
        Bonus compte = null;
        return compte;
    }

    public static BonusDAO getInstance() {
        if (null == instanceCompteDAO) { // Premier appel 
            instanceCompteDAO = new BonusDAO(); }
        return instanceCompteDAO;
    }


    @Override
    public boolean delete(Bonus obj) {
        return false;
    }

    @Override
    public boolean update(Bonus obj) {
        return false;
    }
}