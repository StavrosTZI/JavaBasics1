package mainpackage;

public class Patient extends Users{
    int afm;
    public Patient( String u,String p,String n ,String s,int af ) {
        super(u,p,n,s);
        this.afm=af;

    }
}
