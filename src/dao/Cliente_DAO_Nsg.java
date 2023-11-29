/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ClienteNsg;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09229145165
 */
public class Cliente_DAO_Nsg extends DAO_Abstract {

    @Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteNsg.class);
        criteria.add(Restrictions.eq("idClienteNsg", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteNsg.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNome(String nomeNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteNsg.class);
        criteria.add(Restrictions.ilike("nomeNsg", nomeNsg, MatchMode.ANYWHERE));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listGenero(int generoNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteNsg.class);
        criteria.add(Restrictions.ge("generoNsg", generoNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listNomeGenero(String nomeNsg, int generoNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteNsg.class);
        criteria.add(Restrictions.ilike("nomeNsg", nomeNsg, MatchMode.ANYWHERE));
        criteria.add(Restrictions.ge("generoNsg", generoNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listaCli(String nomeNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteNsg.class);
        criteria.add(Restrictions.eq("nomeNsg", nomeNsg));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}