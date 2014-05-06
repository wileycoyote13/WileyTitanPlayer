package com.titanplayer.da;


import com.titan.bll.MP3;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w_coyote13
 */
public class MP3Respository {
    
    Session session = null;
    
    public MP3Respository(){
        this.session = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public MP3 findById(int id){
        MP3 mp3 = null;
        try{
            if(!session.isOpen())
                session = NewHibernateUtil.getSessionFactory().openSession();
            org.hibernate.Transaction tx = session.beginTransaction();
            mp3 = (MP3)session.get(MP3.class, id);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return mp3;
    }
    public List getMP3 (){
        List<MP3> mp3 = null;
        try{
            if(!session.isOpen())
                session = NewHibernateUtil.getSessionFactory().openSession();
 
            org.hibernate.Transaction tx = session.beginTransaction();
            mp3 = session.createCriteria(MP3.class).list();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return mp3;
    }
    
    public void addMP3(MP3 theMP3){
       try {
        org.hibernate.Transaction tx = session.beginTransaction();
        session.saveOrUpdate(theMP3);
      } catch (Exception ex){
          ex.printStackTrace();
      }
    }
       
    public void commit(){
        org.hibernate.Transaction tx = session.beginTransaction();
        tx.commit();
    }
}



