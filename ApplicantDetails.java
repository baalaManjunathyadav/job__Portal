public class ApplicantDetails{
    private String name;
    private long phno;
    private String email;
    private int passedout;
    private double cgpa;
    private int jobid;
    public ApplicantDetails(String name,long phno,String email,int passedout,double cgpa,int jobid){
        this.name=name;
        this.phno=phno;
        this.email=email;
        this.passedout=passedout;
        this.cgpa=cgpa;
        this.jobid=jobid;
    }
    public void viewApplications(){
        System.out.println("name is "+this.name);
        System.out.println("phon is "+this.phno);
        System.out.println("email is "+this.email);
        System.out.println("passedout is "+this.passedout);
        System.out.println("cgpa is "+this.cgpa);
        System.out.println("jobid is "+this.jobid);
        System.out.println("----------------------------------------------------------");
    }
}
