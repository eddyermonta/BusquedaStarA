/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Control.AStarSearch;
import Modelo.Node;
import Modelo.Edge;

/**
 *
 * @author eduar
 * @see  busqueda a*
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //se crean los nodos
        
        Node n0 = new Node("0", 0);
        Node n1 = new Node("1", 1);
        Node n2 = new Node("2", 2);
        Node n3 = new Node("3", 3);
        Node n4 = new Node("4", 4);
        Node n5 = new Node("5", 5);
        Node n6 = new Node("6", 6);
        Node n7 = new Node("7", 7);
        Node n8 = new Node("8", 8);
        Node n9 = new Node("9", 9);
        Node n10 = new Node("10", 10);
        Node n11 = new Node("11", 11);
        Node n12 = new Node("12", 12);
        Node n13 = new Node("13", 13);
        
        //se crean las relaciones con los costos de las rutas
          
        // relaciones para n0
        n0.setAdjacencies(new Edge[]{
            new Edge(n1,1100),
            new Edge(n2, 1600),
            new Edge(n7, 2800)
        });
        
        //relaciones para n1
        n1.setAdjacencies( new Edge[]{
            new Edge(n0, 1100),
            new Edge(n2, 600),
            new Edge(n3, 1000),
        });
        
        //relaciones para n2
        n2.setAdjacencies(new Edge[]{
            new Edge(n1, 600),
            new Edge(n0, 1600),
            new Edge(n5, 2000)
           
        });

        //relaciones para n3 
        n3.setAdjacencies( new Edge[]{
            new Edge(n1, 1000),
            new Edge(n4, 600),
            new Edge(n10, 2400)
        });
        
        //relaciones para n4 
        n4.setAdjacencies(new Edge[]{
            new Edge(n3, 600),
            new Edge(n6, 800),
            new Edge(n5, 1100)
        });
        
              //relaciones para n5 
        n5.setAdjacencies( new Edge[]{
            new Edge(n2, 2000),
            new Edge(n4, 1100),
            new Edge(n9, 1200),
            new Edge(n12, 2000)
            
        });
        
              //relaciones para n6 
        n6.setAdjacencies( new Edge[]{
            new Edge(n4, 800),
            new Edge(n7, 700),
        });
              //relaciones para n7 
        n7.setAdjacencies(new Edge[]{
            new Edge(n6, 700),
            new Edge(n0, 2800),
            new Edge(n8, 700)
        });
              //relaciones para n8 
        n8.setAdjacencies( new Edge[]{
            new Edge(n7, 700),
            new Edge(n11, 500),
            new Edge(n13, 500),
            new Edge(n9, 900)
        });
              //relaciones para n9 
        n9.setAdjacencies( new Edge[]{
            new Edge(n5, 1200),
            new Edge(n8, 900)
        });
              //relaciones para n10 
        n10.setAdjacencies( new Edge[]{
            new Edge(n3, 2400),
            new Edge(n11, 800),
            new Edge(n13, 800)
        });
              //relaciones para n11 
        n11.setAdjacencies(new Edge[]{
            new Edge(n10, 800),
            new Edge(n8, 500),
            new Edge(n12, 300)
        });
              //relaciones para n12 
        n12.setAdjacencies(new Edge[]{
            new Edge(n5, 2000),
            new Edge(n11, 300),
            new Edge(n13, 300)
        });
              //relaciones para n3 
        n13.setAdjacencies( new Edge[]{
            new Edge(n10, 800),
            new Edge(n8, 500),
            new Edge(n12, 300)
        });
   
        AStarSearch a = new AStarSearch();
        a.searchA(n1, n13);
     System.out.println( a.printPath(n13).toString());
         
    }
    
}
