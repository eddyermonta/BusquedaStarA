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
public class Node {
  private  final String value;
  private final double hScores;
  private double gScores,fScores;
  private  Edge[] adjacencies;
  private Node parents;

 /**
  * 
  * @param value
  * @param hScores 
  */
    public Node(String value,  double hScores) {
        this.value = value;
        this.hScores = hScores;
    }
   /**
    * 
    * @return 
    */ 
    public String getValue() {
        return value;
    }
/**
 * 
 * @return 
 */
    public double gethScores() {
        return hScores;
    }

    /**
  * 
  * @return gScores
  */
    public double getgScores() {
        return gScores;
    }

    /**
     * 
     * @param gScores 
     */
    public void setgScores(double gScores) {
        this.gScores = gScores;
    }
/**
 * 
 * @return 
 */
    public double getfScores() {
        return fScores;
    }
/**
 * 
 * @param fScores 
 */
    public void setfScores(double fScores) {
        this.fScores = fScores;
    }
/**
 * 
 * @return 
 */
    public Edge[] getAdjacencies() {
        return adjacencies;
    }
/**
 * 
 * @param adjacencies 
 */
    public void setAdjacencies(Edge[] adjacencies) {
        this.adjacencies = adjacencies;
    }
/**
 * 
 * @return 
 */
    public Node getParents() {
        return parents;
    }
/**
 * 
 * @param parents 
 */
    public void setParents(Node parents) {
        this.parents = parents;
    }

    @Override
    public String toString() {
        return getValue() + " " + getfScores();
    }
    
    
     
  
  
  
}
