package com.coforge;


import java.time.LocalDate;


import com.coforge.dao.OrderDao;
import com.coforge.entities.Order;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//      ItemDao dao = new ItemDao();
//      dao.getAllItems().forEach(i->System.out.println(i));
//      dao.insertItem(new Item(5,"Mouse",600));
//      dao.getAllItems().forEach(i->System.out.println(i));
      OrderDao dao = new OrderDao();
      dao.insertOrder(new Order(21,"Anmol",LocalDate.now()));
      dao.getAllOrders().forEach(o->System.out.println(o));
      
//      System.out.println(dao.getById(2));
       
    }
}
