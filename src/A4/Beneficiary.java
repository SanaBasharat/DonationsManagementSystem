/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Beneficiary {

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    private String Name;
    private String dob;
    private int income;
    private String PhoneNo;
    private String Address;
    List<Funding> FundingHistory=new ArrayList<>();
    
    public String getDob() {
        return dob;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public String getAddress() {
        return Address;
    }
    
    public Beneficiary(){
        
    }
    public Beneficiary(String Name, String dob, int income, String PhoneNo, String Address) {
        this.Name = Name;
        this.dob = dob;
        this.income = income;
        this.PhoneNo = PhoneNo;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public int getIncome() {
        return income;
    }
    
    public void display()
    {
        System.out.println("Name is " + Name + " Date of birth "
                + dob + " Income is " + income + " PhoneNo is " + PhoneNo + " Address is " + Address  );
    }
    
}
