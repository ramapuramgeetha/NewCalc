/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ramapuram.geetha.newcalc;

/**
 *
 * @author Geetha
 */
public class EncapData {
 private double  dblFrstNo,dblScndNo, dblResult;
 private char chrOperation;
    public void setdblFrstNo (double FrstNo){
            this.dblFrstNo = FrstNo;
        
}
    public void setdblScndNo (double ScndNo){
            this.dblScndNo = ScndNo;
        
}
    public void setdblResult (double Result){
            this.dblResult = Result;
          
}
    public void setchrOperator (char Operator){
        this.chrOperation =Operator;
    }
    public double getdblFirstNo(){
        return this.dblFrstNo;
    }
    public double getdblScndNo(){
        return this.dblScndNo;
    }
     public double getdblResult(){
        return this.dblResult;
    }   
     public char getOperator(){
         return this.chrOperation;
     }
}
