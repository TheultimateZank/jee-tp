/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author azank
 */
public abstract class DAO<T, T1> {

    public Connection connect = null;
    T metier;

    public DAO() {
        try {
            this.connect = DBManager.getConnect();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public abstract boolean create(T obj);

    public abstract boolean delete(T obj);

    public abstract boolean update(T obj);

    public abstract T findById(T1 id);
    
    public abstract List<T> findBySsn(T1 id);
}
