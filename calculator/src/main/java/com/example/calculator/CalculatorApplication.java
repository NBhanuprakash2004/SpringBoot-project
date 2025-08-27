package com.example.calculator;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer = (Customer) context.getBean("customer");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the customer");
		String name=sc.nextLine();
		System.out.println("Enter the age of the customer");
		int age=sc.nextInt();
		System.out.println("Enter the insurance type(1: Health 2: Term)");
		int choice=sc.nextInt();
		Insurance insurance = null;
		if(choice==1){
			insurance=(HealthInsurance)context.getBean("healthInsurance");
			System.out.println("Enter the smoker status(true/false)");
			boolean isSmoker=sc.nextBoolean();
			System.out.println("Enter the drinker status(true/false)");
			boolean isDrinker=sc.nextBoolean();
			System.out.println("Enter the previous condition status(true/false)");
			boolean previousCondition=sc.nextBoolean();
			insurance.setInsurenceDetails(isSmoker, isDrinker, previousCondition);
		}
		else if(choice==2){
			insurance=(TermInsurance)context.getBean("termInsurance");
			System.out.println("Enter the married status(true/false)");
			boolean isMarried=sc.nextBoolean();
			System.out.println("Enter the children status(true/false)");
			boolean hasChildren=sc.nextBoolean();
			System.out.println("Enter the salaried status(true/false)");
			boolean isSalaried=sc.nextBoolean();
			insurance.setInsurenceDetails(isMarried, hasChildren, isSalaried);
		}
		customer.setInsurance(insurance);
        customer.showCustomerDetails();
		sc.close();
	}

}
