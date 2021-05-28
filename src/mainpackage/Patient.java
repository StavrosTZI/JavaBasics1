package mainpackage;

public class Patient extends Users{
    private int amka;
    public Patient( String u,String p,String n ,String s,int af ) {
        super(u,p,n,s);
        this.amka=af;

    }

    public int getAmka() {
        return amka;
    }

    public void registration(){


    }

    public void search_rad_doc(){

    }

    public void search_rad_eid(){

    }

    public void show_rad(){

    }

    public void show_hist(){

    }
}
