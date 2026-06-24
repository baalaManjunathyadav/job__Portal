import java.util.*;
public class Applicant {
    public void seekerapplications(ArrayList<ApplicantDetails>applications,Scanner sc){
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter phno");
        long phno=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the email");
        String email=sc.nextLine();
        System.out.println("enter the passedout year");
        int passedout=sc.nextInt();
        System.out.println("enter cgpa");
        float cgpa=sc.nextFloat();
        System.out.println("enter the job id");
        int jobid=sc.nextInt();
        applications.add(new ApplicantDetails(name, phno, email, passedout, cgpa, jobid));
        System.out.println("job applied successfully");
    }
    public void filterByyear(ArrayList<Job>jobs,Scanner sc){
        System.out.println("enter year to filter");
        int year=sc.nextInt();
        boolean found=false;
        for(Job j:jobs){
            if(year==j.getyear()){
                j.viewjob();
                found=true;
            }
            }
            if(found==false){
                System.out.println("no jobs found");
            }
        }

    }


