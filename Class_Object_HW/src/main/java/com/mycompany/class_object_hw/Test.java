/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.class_object_hw;

/**
 *
 * @author ACER
 */
public class Test {
   public static void main(String[]args){
       MyPoint p1 = new MyPoint();
       MyPoint p2 = new MyPoint(10,20);
       MyPoint p3 = new MyPoint(20,20);
       
       p1.display();
       p2.display();
       p3.display();
       
       double distanceP1P2 = p1.distance(p2);
       double distanceP2P3 = MyPoint.distance(p2, p3);
       
       System.out.println("DistanceP1P2 = " + distanceP1P2);
       System.out.println("DistanceP2P3 = " + distanceP2P3);
       
   } 
}
