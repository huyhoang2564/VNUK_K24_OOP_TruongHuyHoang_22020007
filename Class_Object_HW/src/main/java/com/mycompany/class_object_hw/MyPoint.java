/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.class_object_hw;

/**
 *
 * @author ACER
 */
public class MyPoint {
    private int mPosX;
    private int mPosY;
    
    public MyPoint(){
        mPosX = 0;
        mPosY = 0;
    }
    
    public MyPoint(int x, int y){
        mPosX = x;
        mPosY = y;
    }
    
    public void setX(int x){
        mPosX = x;
    }
    
    public int getX(){
        return mPosX;
    }
    
    public void setY(int y){
        mPosY = y;
    }
    
    public int getY(){
        return mPosY;
    }
    
    public void display(){
        System.out.println("(" + mPosX + "," + mPosY + ")");
    }
    
    //Tra ve khoang cach
    
    public double distance(MyPoint other){
        int dx = mPosX - other.mPosX;
        int dy = mPosY - other.mPosY;
        
        return (float) Math.sqrt(dx*dx + dy*dy); //Doi kieu du lieu tu int sang float
    }
    
    public static float distance(MyPoint p1, MyPoint p2){
        int dx = p1.mPosX - p2.mPosX;
        int dy = p1.mPosY - p2.mPosY;
        
        return (float) Math.sqrt(dx*dx + dy*dy);
    }
}
