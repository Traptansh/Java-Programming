public class conditional{
    public static void main(String[] args) {
        int age = 20; 
            if(age > 18) {
            System.out.println("Eligible for Voting");
        }
        else{
            System.out.println("Not Eligible");
        }

        //else if
        int licenseage = 21;
        if(licenseage > 20) {
            System.out.println("Eligible for License");
        }
        else if(licenseage == 20) {
            System.out.println("One year left");
        }
        else{
            System.out.println("Not Eligible For Applying");
        }

        //Nested if
        int ages = 18;
        int studies_in = 10;
        if(ages == 18) {
            System.out.println("He is a Teenager");
        }
        else if(studies_in == 10) {
            System.out.println("He is Studying in 10");
        }
        else{
                System.out.println("He is not a Teenager");
            }
        }
        }