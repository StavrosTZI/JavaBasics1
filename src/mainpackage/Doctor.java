package mainpackage;

public class Doctor extends Users{
    private String specialty;
    public Doctor(String u,String p,String n ,String s , String spec)
    {
        super(u,p,n,s);
        this.specialty=spec;

    }

    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty=specialty;
    }
}
