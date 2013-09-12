package Marter.maven.sample;

import Marter.maven.sample.InvalidNicException;
import org.joda.time.*;

public class NicInterpretor {
    
   private String nIC;
   private int b_yr;
   private int b_mnth;
   private int b_day;
   private int nmbrOfDays;
   private boolean isMale;

    public NicInterpretor(String nIC)throws InvalidNicException {
        this.nIC = nIC;
      
        b_yr = 1900 + Integer.parseInt(nIC.substring(0,2)); // first two numbers show the Last two digits of year of birth
        nmbrOfDays = Integer.parseInt(nIC.substring(2,5));// this three digits shows the number of days from january 01 st   
   
        if(nmbrOfDays>=500){
            isMale=false;
            nmbrOfDays-=500;
        }else{
            isMale=true;
        }
        
        
        DateTime dt = new DateTime(2012,1,1,0,0,0);
        
        dt = dt.plusDays(nmbrOfDays-1);
        b_mnth=dt.getMonthOfYear();
        b_day=dt.getDayOfMonth();
    
    }
    
    /*return Year*/
    public int getYear(){
        return b_yr;
    }
    
    /*return Month*/
    public int getMonth(){
        return b_mnth;
    }
    
    /*return Date*/
    public int getDate(){
        return b_day;
    }
    
    /*return Gender*/
    public String getGender(){
        if(isMale){
            return "Male";
        }else{
            return "Female";
        }
    }
    
    
}
