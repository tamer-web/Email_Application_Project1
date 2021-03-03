package emailapp;

import java.util.Scanner;

public class Email {
    private final String firstName;
    private final String lastName;
    private String password;
    private  String email;
    private int mailBoxCapacity=500;
    private String alternateEmail;

    // Overload Constructor
    public Email(String firstName,String lastName,String password,String email,int mailBoxCapacity,String alternateEmail){
        this (firstName,lastName);
        this.password= password;
        this.email = email;
        this.mailBoxCapacity= mailBoxCapacity;
        this.alternateEmail = alternateEmail;


    }
    //Constructor to receive first and last name
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;


        //call a method to ask for the department and return department
        String department = setDepartment();


        // Call a method to return a random
        int defaultPasswordLength = 10;
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Yor Password is: " + this.password);

        // Combine elements to generate an email
        String companySuffix = "company.com";
        email = firstName.toLowerCase()+ "." +lastName.toLowerCase() +"@" + department +"." + companySuffix;
        //System.out.println("Your Email: " +email);
    }
    // Ask for the department
    private String setDepartment(){
        System.out.println("New Employee: " + firstName +".Department Code \n1 for Sales \n2 for Development \n3 for Accounting \n0 None:\n Enter Department Code : ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){return "Sales";}
        else if (depChoice == 2){return "Development"; }
        else if (depChoice == 3 ){return "Accounting";}
        else {return " ";}

    }
    //Generate  a random password

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password =new char[length];
        for (int i=0;i<length;i++){
            int rand =  (int) (Math.random() * passwordSet.length());
            password [i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the mailbox Capacity
    public void setMailBoxCapacity(int mailBoxCapacity) {

        this.mailBoxCapacity = mailBoxCapacity;
        if(mailBoxCapacity>500){
            System.out.println("Email Capacity is over than"+mailBoxCapacity+"mb");
        }
    }

    // set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // change the password
    public void changePassword(String password){
        this.password = password;

    }
    public int getMailBoxCapacity(){return mailBoxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){ return password;}

    public String showInfo(){
        return "DISPLAY NAME:" +firstName +" "+lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY:  " + mailBoxCapacity + "mb";}
}

