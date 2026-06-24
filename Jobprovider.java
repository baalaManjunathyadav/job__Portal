import java.util.*;
public class Jobprovider {
    public void addJob(ArrayList<Job>jobs,Scanner sc){
        System.out.println("enter job id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter job role");
        String role=sc.nextLine();
        System.out.println("enter the salary in LPA");
        int salary=sc.nextInt();
        sc.nextLine();
        System.out.println("enter job skill");
        String skill=sc.nextLine();
        System.out.println("enter Company");
        String Company=sc.nextLine();
        System.out.println("enter year");
        int year=sc.nextInt();
        jobs.add(new Job(id,role,salary,skill,Company,year));
        System.out.println("job added successfully");
        System.out.println("----------------------");

    }
    public void viewjobs(ArrayList<Job>jobs){
        if(jobs.isEmpty()){
            System.out.println("no jobs");
        }
        for(Job j:jobs){
             j.viewjob();
        }
    }
    public void ViewApplicants(ArrayList<ApplicantDetails>applications){
         if (applications.isEmpty()) {
        System.out.println("No Applications Found");
        return;
    }
    for (ApplicantDetails a :applications){
        a.viewApplications();
        System.out.println("----------------------------------------------------------");

    }
}
}


