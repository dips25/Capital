package com.example.banking.activity;

/**
 * Created by biswa on 3/23/2017.
 */

public class Id {

    double id;
    double amount;
    double emi;
    double interest;
    double principal;
    double due;

    public Id(){

    }


    public double getId(){

        return id;
    }

    public void setId(double id){

        this.id=id;
    }

    public double getAmount(){

        return amount;
    }

    public void setAmount(double amount){

        this.amount=amount;
    }

    public double getEmi(){

        return emi;
    }

    public void setEmi(double emi){

        this.emi=emi;
    }

    public double getInterest(){

        return interest;
    }

    public void setInterest(double interest){

        this.interest=interest;
    }

    public double getPrincipal(){

        return principal;
    }

    public void setPrincipal(double principal){

        this.principal=principal;
    }

    public double getDue() {
        return due;
    }

    public void setDue(double due) {
        this.due = due;
    }
}
