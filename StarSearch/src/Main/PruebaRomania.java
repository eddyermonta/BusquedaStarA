/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Control.AStarSearch;
import Modelo.Edge;
import Modelo.Node;
import java.util.List;

/**
 *
 * @author eduar
 */
public class PruebaRomania {
    public static void main(String[] args) {
       
        Node arad = new Node("arad", 366);
        Node bucharest = new Node("bucharest", 0);
        Node craiova = new Node("craiova", 160);
        Node dobreta = new Node("dobreta", 242);
        Node fagaras = new Node("fagaras", 178);
        Node giurgiu = new Node("giurgiu", 77);   
        Node lugoj = new Node("lugoj", 244);
        Node mehadia = new Node("mehadia", 241);
        Node oradea = new Node("oradea", 380);
        Node pitesti = new Node("pitesti",98);
        Node rimnicuVilcea = new Node("rimnicuVilcea", 193);
        Node sibiu = new Node("sibiu", 253);
        Node timisoara = new Node("timisoara", 329);
        Node zerind = new Node("zerind", 374);
        
        arad.setAdjacencies( new Edge[]{
            new Edge(zerind, 75),
            new Edge(timisoara,118),
            new Edge(sibiu, 140)
        });
        zerind.setAdjacencies( new Edge[]{
            new Edge(oradea, 71),
            new Edge(arad, 75)
        });
        
        oradea.setAdjacencies( new Edge[]{
            new Edge(zerind, 71),
            new Edge(sibiu, 151)
        });
        
        sibiu.setAdjacencies( new Edge[]{
            new Edge(arad, 140),
            new Edge(rimnicuVilcea, 80),
            new Edge(fagaras, 99)
        });
        
        fagaras.setAdjacencies( new Edge[]{
            new Edge(sibiu, 99),
            new Edge(bucharest, 211)
        });
        bucharest.setAdjacencies(new Edge[]{
            new Edge(pitesti, 101),
            new Edge(giurgiu, 90)
        });
      pitesti.setAdjacencies( new Edge[]{
          new Edge(craiova, 138),
          new Edge(bucharest, 0),
          new Edge(rimnicuVilcea, 97)
      });
      
      craiova.setAdjacencies( new Edge[]{
          new Edge(pitesti, 138),
          new Edge(rimnicuVilcea, 146),
          new Edge(dobreta,120)
      });
      
      rimnicuVilcea.setAdjacencies(new Edge[]{
          new Edge(sibiu, 80),
          new Edge(craiova, 146),
          new Edge(pitesti, 97)
      });
      
      dobreta.setAdjacencies(new Edge[]{
          new Edge(craiova, 120),
          new Edge(mehadia, 75)
      });
      mehadia.setAdjacencies(new Edge[]{
          new Edge(dobreta, 75),
          new Edge(lugoj, 70)
      });
    
      lugoj.setAdjacencies(new Edge[]{
          new Edge(mehadia, 70),
          new Edge(timisoara, 111)
      });
      
      timisoara.setAdjacencies(new Edge[]{
          new Edge(arad, 118),
          new Edge(lugoj, 111)
      });
      
       AStarSearch a = new AStarSearch();
       a.searchA(arad, bucharest);
        List<Node> path = a.printPath(bucharest);
        System.out.println(path.toString());
    }
}
