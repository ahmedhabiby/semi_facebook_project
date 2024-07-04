
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mavenproject1 {
      
    public static void main(String[] args) {
    
   ArrayList list1=new ArrayList(5);
   ArrayList list2=new ArrayList(5);
   ArrayList list3=new ArrayList(5);
   list1.add("ahmed");
   list1.add("mohamed");
   list1.add("hazem");
   list1.add("wael");
   list2.add("how are you");
   list2.add("ok");
   list3.add("Admin");
   list3.add("user");
   
   
   
   
   User user1=new User();
   user1.setChats(list1);
   user1.setEmail("ahmednsra329@gmail.com");
   user1.setFullname("ahmed mohamed habiby");
   user1.setMessages(list2);
   user1.setPassword("ahmed11234");
   user1.setPhone(01001205);
   user1.setRole(list3);
   user1.setId(1);
   
      ArrayList list4=new ArrayList(5);
      
      list4.add("ahmed mohamed habiby");

      Friends friend1=new Friends();
       friend1.setName("hazem");
       friend1.setUser(list4);
       friend1.setId(1);
        System.out.println(user1.getFriends());
       
    }
    }
    

    
