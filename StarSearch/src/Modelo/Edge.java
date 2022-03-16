/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author eduar
 */
public class Edge {
        private final Node target;
    private final double cost;

    /**
     * 
     * @param target
     * @param cost 
     */
    public Edge(Node target, double cost) {
        this.target = target;
        this.cost = cost;
    }

    /**
     * 
     * @return 
     */
    public Node getTarget() {
        return target;
    }

    /**
     * 
     * @return 
     */
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
