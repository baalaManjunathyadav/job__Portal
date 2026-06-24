import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Job> jobs = new ArrayList<>();
        ArrayList<ApplicantDetails>applications= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Jobprovider jb=new Jobprovider();
        Applicant a=new Applicant();
        while(true){
            System.out.println("Welcome to  job portable");
            System.out.println("Enter an option");
            System.out.println("1==> Job provider");
            System.out.println("2==>Job seeker");
            System.out.println("3==>Exit");
            int choice=sc.nextInt();
            int option;
            switch(choice){
                case 1:
                    do { 
                        System.out.println("Enter an option ");
                        System.out.println("1==> Add Job ");
                        System.out.println("2==> View Job ");
                        System.out.println("3==> Applications ");
                        System.out.println("4==> Back ");
                        option=sc.nextInt();
                        
            switch(option){
                        case 1:
                          jb.addJob(jobs, sc);
                        case 2:
                          jb.viewjobs(jobs);
                        case 3:
                          jb.ViewApplicants(applications);
                        case 4:
                            break;
                    default:
                        System.out.println("enter valid option");
                        break;

                    }
                    } while (option!=4);
                    
                    System.out.println("job provider");
                    break;
                    case 2:
                        do { 
                            System.out.println("1==> View jobs ");
                            System.out.println("2==> Filter by year ");
                            System.out.println("3==> Apply job");
                            System.out.println("4==> back ");
                            option =sc.nextInt();
                            switch(option){
                                case 1:
                                    jb.viewjobs(jobs);
                                case 2:
                                    a.filterByyear(jobs, sc);
                                case 3:
                                    a.seekerapplications(applications, sc);
                                 case 4:
                                    break;   
                            }
                        } while (option!=4);
                        System.out.println("job provider");
                        break;
                    case 3:
                         System.out.println("Thank you");
                         break;
                    default:
                        System.out.println("Enter valid option");
            } 
        }
    
    }
}
