package com.hibernate.JatinHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class App 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration().configure().addAnnotatedClass(Stu.class).addAnnotatedClass(Lap.class);
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       Lap l1 = 
       		new Lap();
       l1.setlId(107);
       l1.setlName("jkl");
       Lap l2 = 
       		new Lap();
       l2.setlId(108);
       l2.setlName("opq");
       Lap l3 = 
       		new Lap();
       l3.setlId(107);
       l3.setlName("rst");
		Stu s1 = 
				new Stu();
		s1.setId(4);
		s1.setName("shaldon");
		Stu s2 = new Stu();
		s2.setId(5);
		s2.setName("raj");
		l1.getStudent().add(s1);
		l1.getStudent().add(s2);
		l2.getStudent().add(s1);
		l2.getStudent().add(s2);
		l3.getStudent().add(s1);
		session.beginTransaction();
		session.save(l1);
		session.save(l2);
		session.save(l3);
		session.save(s1);
		session.save(s2);
		session.getTransaction().commit();
//		Query q = session.createQuery("select id,l from Stu");
//		List<Object[]> list = q.getResultList();
//		
//		for(Object[] l : list) {
//			System.out.println( l[0] + " : " + ((List)l[1]).toString());
//			
//		}
		
//		System.out.println(list.toString());
		
    }
}
