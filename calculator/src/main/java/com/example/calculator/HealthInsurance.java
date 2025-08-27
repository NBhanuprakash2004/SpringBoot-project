/*
5. Create the class HealthInsurac which implements the Insurance interface. Override the interface methods and add the following attributes:

a. isSmoker(boolean)

b. isDrinker(boolean)

c. previousConditions(boolean)

d. insurance(double default = 10000, this is the base premium value).
 * 
 */
package com.example.calculator;

public class HealthInsurance implements Insurance{
    private boolean isSmoker;
    private boolean isDrinker;
    private boolean previousCondition;
    private double insurance = 10000;
    @Override
    public double getInsurancePremium() {
        return insurance;
    }

    @Override
    public void setInsurenceDetails(boolean m1, boolean m2, boolean m3) {
        this.isSmoker = m1;
        this.isDrinker = m2;
        this.previousCondition = m3;
        // Reset to base value first
        insurance = 10000;
        if(isSmoker || isDrinker){
            //if smoker or drinker, increase the premium by 1.5 times the base value.
            insurance = insurance * 1.5;
        }
        if(previousCondition){
            //if previous condition, increase the premium by 2 times the base value.
            insurance = insurance * 2;
        }
    }

    @Override
    public String getInsuranceName() {
        return "Health Insurance";
    }

}
