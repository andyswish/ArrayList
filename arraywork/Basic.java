import java.util.ArrayList;
/**
 * Write a description of class Basic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Basic
{
    public void main()
        {
            ArrayList<String> RedCars = new ArrayList<String>();
            
            RedCars.add("Toyoto");
            RedCars.add("Bughatee");
            
            ArrayList<String> BlueCars=new ArrayList<String>(); 
            
            BlueCars.add("Nison");
            BlueCars.add("Mercredi");
            
            int index = 0;
            while(index<=RedCars.size())
            {
                
                BlueCars.add(index, RedCars.get(index));
                index=index+1;
                
            }
            int i = 0;
            while(i<=BlueCars.size())
            {
                
                RedCars.add(i, BlueCars.get(i));
                i=i+1;
                
            }
         }
         
}
