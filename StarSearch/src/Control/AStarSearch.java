/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import Modelo.Node;
import Modelo.Edge;
/**
 *
 * @author eduar
 */
public class AStarSearch {
    
    public List <Node>printPath(Node target){
         List <Node> path = new ArrayList<>();
         for (Node node = target; node!=null; node = node.getParents()){
             path.add(node);
         }
         // re ordenar la ruta de cola al inicio
         Collections.reverse(path);
         return path;
    }
    
    public void searchA(Node source,Node goal){
        // nodos ya visitados
        Set <Node> explored = new HashSet<>();
        
        //nodos por visitar
        PriorityQueue <Node> queue = new PriorityQueue<>(
        (Node o1, Node o2) -> {
            if (o1.getfScores() > o2.getfScores())  return 1;
            else if (o1.getfScores() < o2.getfScores()) return -1;
            else return 0;
        });
        
        //costo
        source.setgScores(0);
        queue.add(source);
        
        boolean found = false;
        
        while (!queue.isEmpty() && !found){
           //toma de la lista el menor costo
            Node current = queue.poll();
            explored.add(current);
            
            //lo encontro el destino si el nombre del nodo es igual a mi destino
            if(current.getValue().equals(goal.getValue()))
                found = true;
           
            for (Edge e : current.getAdjacencies()){
                Node child = e.getTarget();
                double tempGscore = current.getgScores() + e.getCost(); //distanciaDestino+costoRuta
                double tempFscore = tempGscore+child.gethScores(); //sumando el acumulado
                //si el nodo hijo ya ha sido evaluado y el nuevo
                //valor de f es mas alto se lo saltara
                
                //si ya lo visito y el valor temporal de la suma es mayor lo salta
                if(explored.contains(child) && tempFscore>= child.getfScores()){   //
                        System.out.println(child.getfScores());
                        System.out.println("cont" +child);
                        continue;
                        
                        //si no a calculado el nodo o si el valor temporal es menor al hijo
                        //ajustara los nuevos padres y costosdel hijo
                }else if(!queue.contains(child)|| tempFscore<child.getfScores()){
                    child.setParents(current); // ibserta el padre del nodo que es donde estamos
                    child.setgScores(tempGscore); // y sus costos temporales
                    child.setfScores(tempFscore);
                    //si ya lo calcule remuevalo si no agregelo
                    if(queue.contains(child)) queue.remove(child);
                    queue.add(child);
                    
                }
            }
            
        }
        
    }
      
}
