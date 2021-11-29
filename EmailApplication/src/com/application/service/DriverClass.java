package com.application.service;

import com.application.model.Employee;
import java.util.Scanner;
public class DriverClass {
  public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to company, Lets generate your credentails for you!");
			System.out.println("Please Enter your firstName : ");
			String firstName = scanner.nextLine();
			System.out.println("Please Enter your lastName : ");
			String lastName = scanner.nextLine();
			
   Employee employee1 = new Employee(firstName, lastName);
			String generatedEmail;
			char[] generatedPassword;
			CredentialService cService =new CredentialService();
			try (Scanner sc = new Scanner (System.in)) {
				int choice;
   System.out.println("please select your department");
   
				System.out.println("1. Technical Department");
				System.out.println("2. Admin Department");
				System.out.println("3. Human Department");
				System.out.println("4. Legal Department");
				
				choice = sc.nextInt();
				
				if (choice ==1) {
					generatedEmail= cService.generateEmailAdderess(employee1.getFirstName(), employee1.getLastName(), "technical");
					generatedPassword= cService.generatePassword();
					cService.showCredentials(employee1, generatedEmail, generatedPassword);
				}
				else if (choice ==2) {
						generatedEmail= cService.generateEmailAdderess(employee1.getFirstName(), employee1.getLastName(), "admin");
						generatedPassword= cService.generatePassword();
						cService.showCredentials(employee1, generatedEmail, generatedPassword);
					}
						else if (choice==3) {
						generatedEmail= cService.generateEmailAdderess(employee1.getFirstName(), employee1.getLastName(), "hr");
						generatedPassword= cService.generatePassword();
						cService.showCredentials(employee1, generatedEmail, generatedPassword);
					}	
					
					else if (choice==4) {
						generatedEmail= cService.generateEmailAdderess(employee1.getFirstName(), employee1.getLastName(), "legal");
						generatedPassword= cService.generatePassword();
						cService.showCredentials(employee1, generatedEmail, generatedPassword);
						
						}
					else System.out.println("Invalid");
			}
		}
			
			
     }}


