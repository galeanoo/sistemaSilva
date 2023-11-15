/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VendedorNsg;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09229145165
 */
public class Vendedor_DAO_Nsg extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(VendedorNsg.class);
        criteria.add(Restrictions.eq("idVendedorNsg", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorNsg.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listCpf(String cpfNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorNsg.class);
        criteria.add(Restrictions.ilike("cpfNsg", cpfNsg, MatchMode.ANYWHERE));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listComissao(int comissaoNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorNsg.class);
        criteria.add(Restrictions.ge("comissaoNsg", comissaoNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listCpfComissao(String cpfNsg, int comissaoNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendedorNsg.class);
        criteria.add(Restrictions.ilike("cpfNsg", cpfNsg, MatchMode.ANYWHERE));
        criteria.add(Restrictions.ge("comissaoNsg", comissaoNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
}