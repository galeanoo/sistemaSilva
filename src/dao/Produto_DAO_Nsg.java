/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProdutoNsg;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09229145165
 */
public class Produto_DAO_Nsg extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(ProdutoNsg.class);
        criteria.add(Restrictions.eq("idProdutoNsg", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoNsg.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listSabor(String saborNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoNsg.class);
        criteria.add(Restrictions.ilike("saborNsg", saborNsg, MatchMode.ANYWHERE));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listModo(int modoNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoNsg.class);
        criteria.add(Restrictions.ge("modoNsg", modoNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listTamanho(int tamanhoNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoNsg.class);
        criteria.add(Restrictions.ge("tamanhoNsg", tamanhoNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listSMT(String saborNsg, int modoNsg, int tamanhoNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoNsg.class);
        criteria.add(Restrictions.ilike("saborNsg", saborNsg, MatchMode.ANYWHERE));
        criteria.add(Restrictions.ge("modoNsg", modoNsg));
        criteria.add(Restrictions.ge("tamanhoNsg", tamanhoNsg));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
}