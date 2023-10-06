package com.tnsif.manytomany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;
public class Executor {

	public static void main(String[] args) {
		OrderMaster o1=new OrderMaster();
		o1.setPurchaseDate(new Date());

		OrderMaster o2=new OrderMaster();
		o2.setPurchaseDate(new Date());

		ProductMaster p1=new ProductMaster();
		p1.setName("Book");
		p1.setPrice(600);
		
		ProductMaster p2=new ProductMaster();
		p2.setName("Pen");
		p2.setPrice(200);
		
		ProductMaster p3=new ProductMaster();
		p3.setName("NoteBook");
		p3.setPrice(300);
		
		ProductMaster p4=new ProductMaster();
		p4.setName("Scale");
		p4.setPrice(50);
		
		Set<OrderMaster> orders1=new HashSet<OrderMaster>();
		orders1.add(o1);
		orders1.add(o2);
		
		Set<OrderMaster> orders2=new HashSet<OrderMaster>();
		orders2.add(o2);
		
		Set<OrderMaster> orders3=new HashSet<OrderMaster>();
		orders3.add(o1);
		
		Set<ProductMaster> products1 =new HashSet<ProductMaster>();
		products1.add(p1);
		products1.add(p4);
		
		Set<ProductMaster> products2 =new HashSet<ProductMaster>();
		products2.add(p1);
		products2.add(p2);
		products2.add(p3);
		
		o1.setProducts(products1);
		o2.setProducts(products2);
		
		p1.setOrders(orders1);
		p2.setOrders(orders2);
		p3.setOrders(orders2);
		p4.setOrders(orders3);
		
		EntityManager em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(o1);
		em.persist(o2);
		em.getTransaction().commit();
	}

}
