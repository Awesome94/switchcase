package com.pluralsight.Switch;

/**
 * Created by AWESOME on 14/07/2017.
 */
public class MathEquation implements Utensils {
    private double val1;
    private  double val2;
    private char opCode;
    private double result;
    private int one;
    private int two;

    public MathEquation(){}
    public MathEquation(int one, int two){
        this.one = one;
        this.two = two;
    }


    public  double getval1() {return val1;}
    public void setval1(double val1){this.val1 = val1;}
    public double getVal2(){return val2;}
    public void setval2(double val2){this.val2 = val2;}
    public char getopCode(){ return opCode;}
    public void setopCode(char opCode){ this.opCode = opCode;}


    public double getResult(){ return result;}

    public int addNumbers(){
        return this.one + this.two;
    }

    public void execute(){
        switch (opCode){
            case 'a':
                result = val1 + val2;
                break;
            case 's':
                result = val1 - val2;
                break;
            case 'm':
                result = val1 * val2;
                break;
            case 'd':
                result = val2 != 0? val1 / val2: 0.0d;
                break;
            default:
                System.out.println("!Error");
                break;
        }

    }


    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    @Override
    public String utensilType() {
        System.out.println("this is it ");
        return "MathEquation";
    }
}
