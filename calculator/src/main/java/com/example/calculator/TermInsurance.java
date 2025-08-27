// Create the class TermInsurance which implements the Insurance interface. Override the interface methods and  add the following attributes:

//     a. isMarried(boolean)

//     b. hasChildren(boolean)

//     c. isSalaried(boolean)

//     d. insurance(double default = 5000, this is the base premium value).
package com.example.calculator;
public class TermInsurance implements Insurance{
    private boolean isMarried;
    private boolean hasChildren;
    private boolean isSalaried;
    private double insurance = 5000;
    @Override
    public double getInsurancePremium() {
        return insurance;
    }

    @Override
    public void setInsurenceDetails(boolean m1, boolean m2, boolean m3) {
        this.isMarried = m1;
        this.hasChildren = m2;
        this.isSalaried = m3;
        // Reset to base value first
        insurance = 5000;
        if(isMarried || hasChildren){
            //increase the premium by 1.5 times the base value.
            insurance = insurance * 1.5;
        }
        if(hasChildren){
            //increase the premium by 2 times the base value.
            insurance = insurance * 2;
        }
    }

    @Override
    public String getInsuranceName() {
        return "Term Insurance";
    }

}
