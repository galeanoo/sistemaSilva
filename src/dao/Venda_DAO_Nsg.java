/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendaNsg;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import tools.Util;

/**
 *
 * @author u09229145165
 */
public class Venda_DAO_Nsg extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(VendaNsg.class);
        criteria.add(Restrictions.eq("idVendaNsg", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaNsg.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listTotal(Double totalVendaNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaNsg.class);
        criteria.add(Restrictions.ge("totalVendaNsg", totalVendaNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listUnidade(String unidadeNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaNsg.class);
        criteria.add(Restrictions.ge("unidadeNsg", unidadeNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listTotalUnidade(Double totalVendaNsg, String unidadeNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendaNsg.class);
        criteria.add(Restrictions.ge("totalVendaNsg", totalVendaNsg));
        criteria.add(Restrictions.ge("unidadeNsg", unidadeNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
}