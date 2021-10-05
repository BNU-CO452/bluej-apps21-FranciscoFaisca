
/**
 * Write a description of class Module here.
 *
 * @author (Francisco)
 * @version (05/10/2021)
 */
public class Module
{
    // instance variables - replace the example below with your own
   
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }
    
    public String getCode()
    {
        return this.code;
    }
    public String getTitle()
    {
        return this.title;
    }
    public int getCredit()
    {
        return this.credit;
    }
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    public void printModule()
    {
        System.out.println(" Module Code: " + code + " Title: " + title);
    }
    
}
