import java.io.*; 

import java.util.List; 

import java.util.ArrayList; 

  

class GFG { 

    public static void main(String[] args) 

    { 

        List<Integer> al = new ArrayList<Integer>(); 

        al.add(4); 

        al.add(16); 

        al.add(114); 

        al.add(45); 

  

        Object[] objects = al.toArray(); 

  

        // Printing array of objects 

        for (Object obj : objects) 

            System.out.print(obj + " "); 

    } 
}