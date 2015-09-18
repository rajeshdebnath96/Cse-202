/**
 * Created by user on 16-Sep-15.
 */
public class Customer {
    private String name;
    private String email;
    private char gender;
    public Customer(String name){
        this.name=name;
    }
    public Customer(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
    public void print(){
        System.out.println(this.name +" ("+this.gender +") at "+this.email);
    }
}
