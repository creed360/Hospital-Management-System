/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.util.ArrayList;

/**
 *
 * @author Farhan
 */
class Hospital {
    private String name;
    private String location;
    private String licenseNumber;
    private ArrayList<Room> rooms;
    private ArrayList<Employee> employees;
    private ArrayList<Patient> patients;
    private ArrayList<Manager> managers;
    private ArrayList<Account> accounts;

    public Hospital(String name, String location, String licenseNumber) {
        this.name = name;
        this.location = location;
        this.licenseNumber = licenseNumber;
        rooms=new ArrayList<>();
        employees=new ArrayList<>();
        patients=new ArrayList<>();
        managers=new ArrayList<>();
        accounts=new ArrayList<>();
    }
    
    
    Room getRoom(int roomID)
    {
        Room r=null;
        for(int i=0;i<rooms.size();i++)
        {
            if(rooms.get(i).getRoomID()==roomID)
            {
                r=rooms.get(i);
            }
        }
        return r;
    }
void addStaff(Staff staff)
{
    employees.add(staff);
}
void addDoctor(Doctor doc)
{
    employees.add(doc);
}
void addNurse(Nurse nurse)
{
    employees.add(nurse);
}

Employee returnEmployee(int empID)
{
    Employee r=null;
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).getEmpID()==empID)
            {
                r=employees.get(i);
            }
        }
        return r;
}
boolean updateStaffDetails(int empID, int age, String address, String phone, int sal, String qualification, String type, String dutyShift)
{
    Staff r=null;
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).getEmpID()==empID && employees.get(i) instanceof Staff)
            {
                r=(Staff)employees.get(i);
            }
        }
       if(r!=null)
       {
        r.setAge(age);
        r.setAddress(address);
        r.setPhone(phone);
        r.setSalary(sal);
        r.setQualification(qualification);
        r.setDutyShift(dutyShift);
        r.setType(type);
        return true;
       }
       return false;
}
boolean updateDoctorDetails(int empID, int age, String address, String phone, int sal, String qualification, String vHours, String designation, int docFees)
{
    Doctor r=null;
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).getEmpID()==empID && employees.get(i) instanceof Doctor)
            {
                r=(Doctor)employees.get(i);
            }
        }
        if(r!=null)
       {
        r.setAge(age);
        r.setAddress(address);
        r.setPhone(phone);
        r.setSalary(sal);
        r.setQualification(qualification);
        r.setVisitingHours(vHours);
        r.setDesignation(designation);
        r.setDoctorFees(docFees);
        return true;
       }
       return false;
}

boolean updateNurseDetails(int empID, int age, String address, String phone, int sal, String qualification, String rank, String dutyShift)
{     
    Nurse r=null;
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).getEmpID()==empID && employees.get(i) instanceof Nurse)
            {
                r=(Nurse)employees.get(i);
            }
        }
        if(r!=null)
       {
        r.setAge(age);
        r.setAddress(address);
        r.setPhone(phone);
        r.setSalary(sal);
        r.setQualification(qualification);
        r.setRank(rank);
        r.setDutyShift(dutyShift);
        return true;
       }
       return false;
}

Patient returnPatient(int patientID)
{
    Patient r=null;
        for(int i=0;i<patients.size();i++)
        {
            if(patients.get(i).getPatientID()==patientID)
            {
                r=patients.get(i);
            }
        }
        return r;
}
void addPatient(Patient patient)
{
    patients.add(patient);
}

void addManager(Manager manager)       
{
    managers.add(manager);
}
Manager getManager(int managerID)
{
    Manager r=null;
        for(int i=0;i<managers.size();i++)
        {
            if(managers.get(i).getManagerID()==managerID)
            {
                r=managers.get(i);
            }
        }
        return r;
}
//assignBloodbank(empID: int): bool

void removeEmployee(int empID)
{
    Employee r=null;
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i).getEmpID()==empID)
            {
                r=employees.get(i);
            }
        }
        if(r!=null)
        {
            employees.remove(r);
        }
}
//+assignWardToDoc(nurse: Nurse, type: String): void
//+assignWardToNurse(nurse: Nurse, type: String): void
boolean Login(String loginID, String pin) // type???
{
    Account a=null;
    for(int i=0;i<accounts.size();i++)
    {
        if(accounts.get(i).getLoginID().equals(loginID))
        {
            a=accounts.get(i);
        }
    }
    if(a.getPin().equals(pin))
    {
        return true;
    }
    return false;
}
void addAccount(Account account)
{
    accounts.add(account);
}
boolean changePassword(String loginID, String oldPin, String newPin)
{
     Account a=null;
    for(int i=0;i<accounts.size();i++)
    {
        if(accounts.get(i).getLoginID().equals(loginID))
        {
            a=accounts.get(i);
        }
    }
    try
    {
        if(a.getPin().equals(oldPin))
        {
           a.setPin(newPin);
            return true;
        }
    }
    catch (Exception e)
    {
        return false;    
    }
    return false;
}


}
