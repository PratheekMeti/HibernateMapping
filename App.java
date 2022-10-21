package hibernateproject.com.Learnhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {  
       //step1-Create object of configuration
       Configuration cfg=new Configuration().configure();
       
       //step2-Build Session Factory
       SessionFactory sf=cfg.buildSessionFactory();
       
       //step3-Open Session
       Session s=sf.openSession();
       System.out.println("Hibernate is working"); 
       
       //step4-create the object of entity class
       
       Bike bk1=new Bike();
       Bike bk2=new Bike();
       Bike bk3=new Bike();
       
       Student1 stu1=new Student1 (1,"Jyothi",bk1);
       Student1 stu2=new Student1 (2,"Prateek",bk2);
       Student1 stu3=new Student1 (3,"Mayuri",bk3);
       
       bk1.setEngno(1111);
       bk1.setBrand("Activa");
       bk1.setStudent(stu1);
       
       bk2.setEngno(2222);
       bk2.setBrand("Pulsar");
       bk2.setStudent(stu2);
       
       bk3.setEngno(3333);
       bk3.setBrand("Jupiter");
       bk3.setStudent(stu3);
       
       //step5-get Transcation
       
       Transaction tx=s.beginTransaction();
       
       //step6-Save the object
       s.save(stu1);
       s.save(stu2);
       s.save(stu3);
       s.save(bk1);
       s.save(bk2);
       s.save(bk3);
       
       //step7-commit the changes in transcation
       tx.commit();
       
       //step8-Close the session
       s.close();
    }
}
