package com.hibernate.com.map;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration();
        cfg.configure("Emp-Config.xml");
        System.out.println("Configuration Object Created!");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("Session Factory Object Created!");
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Emp e=new Emp();
        e.setId("100");
        e.setName("Dixin Kumar");
        Map<String,Goods> m=new HashMap<String,Goods>();
        Goods g1=new Goods();
        Goods g2=new Goods();
        g1.setPid("200");
        g1.setProduct("Apple11");
        g1.setProductID("0102343545");
        g2.setPid("201");
        g2.setProduct("HuaWeip40");
        g2.setProductID("0104959659");
        m.put("U.S product", g1);
        m.put("Chinese product ", g2);
        e.setGoods(m);
        s.persist(e);
        t.commit();
        System.out.println("Successfully inserted into database!");
        s.close();
        sf.close();
    }
}
