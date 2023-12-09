/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuariosNsg;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u09229145165
 */
public class Usuarios_DAO_Nsg extends DAO_Abstract {
    
    public UsuariosNsg Login(String usuario, String senha) {
        session.beginTransaction();

        Query query = session.createQuery("FROM UsuariosNsg WHERE apelido_Nsg = :apelido_Nsg AND senha_Nsg = :senha_Nsg");
        query.setParameter("apelido_Nsg", usuario);
        query.setParameter("senha_Nsg", senha);

        UsuariosNsg usuariosNsg = (UsuariosNsg) query.uniqueResult();

        session.getTransaction().commit();

        return usuariosNsg;
    }

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
        Criteria criteria = session.createCriteria(UsuariosNsg.class);
        criteria.add(Restrictions.eq("idUsuariosNsg", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNsg.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listNome(String nomeNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNsg.class);
        criteria.add(Restrictions.ilike("nomeNsg", nomeNsg, MatchMode.ANYWHERE));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listCpf(String cpfNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNsg.class);
        criteria.add(Restrictions.ilike("cpfNsg", cpfNsg, MatchMode.ANYWHERE));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
    
    public List listNomeCpf(String nomeNsg, String cpfNsg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosNsg.class);
        criteria.add(Restrictions.ilike("nomeNsg", nomeNsg, MatchMode.ANYWHERE));
        criteria.add(Restrictions.ilike("cpfNsg", cpfNsg, MatchMode.ANYWHERE));
        List results = criteria.list();
        session.getTransaction().commit();
        return results;
    }
}