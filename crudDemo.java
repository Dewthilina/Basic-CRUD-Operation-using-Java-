//import java.util.Scanner;
import java.util.*;

class employee{

     private int empNo;
     private String eName;
     private int salary;

     employee(int empNo,String eName,int salary){
          this.empNo=empNo;
          this.eName=eName;
          this.salary=salary;
     }

     public int getEmpNo(){
          return empNo;
     }

     public String geteName(){
          return eName;
     }

     public int getSalary(){
          return salary;
     }

     public String toString(){
          return empNo+" "+eName+" "+salary;
     }
}

class crudDemo{
    public static void main(String []args){

          List<employee> c=new ArrayList<employee>();

          Scanner sc =new Scanner (System.in);
          Scanner sc1 =new Scanner (System.in);
          int ch;
          do{
               System.out.println("1.INSERT");
               System.out.println("2.DISPLAY");
               System.out.println("3.SEARCH");
               System.out.println("4.DELETE");
               System.out.println("5.UPDATE");

               System.out.println("Enter Your Choice: ");
               ch=sc.nextInt();

               switch (ch) {
                    case 1:
                         System.out.print("Enter Employee Number: ");
                         int employeeNumber=sc.nextInt();
                         System.out.print("Enter Employee Name: ");
                         String employeeName=sc1.nextLine();
                         System.out.print("Enter salary: ");
                         int employeeSalary=sc.nextInt();

                         c.add(new employee(employeeNumber,employeeName,employeeSalary));
                         break;
                    case 2:
                         System.out.println("-------------------------------");
                         Iterator<employee> i=c.iterator();
                         while(i.hasNext()){
                              employee e=i.next();
                              System.out.println(e);
                         }
                         System.out.println("-------------------------------");
                         break;
                    case 3:
                         boolean found =false;
                         System.out.println("Enter Employee Number to search: ");
                         int empNumber=sc.nextInt();
                         System.out.println("-------------------------------");
                         i=c.iterator();
                         while(i.hasNext()){
                              employee e=i.next();
                              if(e.getEmpNo()==empNumber){
                                   System.out.println(e);
                                   found=true;
                              }
                              
                         }
                         
                         if(!found){
                              System.out.println("Record Not Found");
                         }
                         System.out.println("-------------------------------");
                         break;
                    case 4:
                         found =false;
                         System.out.println("Enter Employee Number to Delete: ");
                         empNumber=sc.nextInt();
                         System.out.println("-------------------------------");
                         i=c.iterator();
                         while(i.hasNext()){
                              employee e=i.next();
                              if(e.getEmpNo()==empNumber){
                                   i.remove();
                                   found=true;
                              }
                         }
                    
                         if(!found){
                              System.out.println("Record Not Found");
                         }
                         else{
                              System.out.println("Record is deleted successfully"); 
                         }
                         System.out.println("-------------------------------");
                         break;
                    case 5:
                         found =false;
                         System.out.println("Enter Employee Number to Update: ");
                         empNumber=sc.nextInt();
                         
                         ListIterator<employee>li=c.listIterator();
                         while(li.hasNext()){
                              employee e=li.next();
                              if(e.getEmpNo()==empNumber){
                                   System.out.print("Enter New Name: ");
                                   employeeName=sc1.nextLine();

                                   System.out.print("Enter New Salary: ");
                                   employeeSalary=sc.nextInt();

                                   li.set(new employee(empNumber, employeeName, employeeSalary));
                                   found=true;
                              }
                         }
                    
                         if(!found){
                              System.out.println("Record Not Found");
                         }
                         else{
                              System.out.println("Record is Updated successfully"); 
                         }
                         break;
                    default:
                         break;
               }

          }while(ch!=0);
    } 
}