import java.util.Scanner;
class Person
{
String name,address;
int birthdate,year;
double height,weight;
Person()
{
this.name=" ";
this.birthdate=0;
this.height=0.0;
this.weight=0.0;
this.year=0;
}
void calculate_age(int month,int date,int year,int todaysyear)
{
if(month>0 && month<13)
{
int mon=month;
int date1=date;
year=year;
System.out.println("Birth date= ");
System.out.println(date1+"/"+mon+"/"+year);
todaysyear=todaysyear;
int age=todaysyear-year;
System.out.println("Enter person age="+age+"years");
}
else
{
System.out.println("Enter correct month");
}
}
void show(String name,double height,double weight)
{
String name1=name;
this.height=height;
this.weight=weight;

System.out.println("Person Details:");
System.out.println("Person name="+name1);
System.out.println("Person height="+this.height+"Foot");
System.out.println("Person weight="+this.weight+"kg");
}
}
class student extends Person
{
int rollno;
int marks[],sum=0;
double avg=0.0;
student()
{
//Super.Person();
rollno=0;
avg=0.0;
}
void calculate_avg()
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter roll no");
rollno=sc1.nextInt();
System.out.println("Enter no of sub");
int n=sc1.nextInt();
int marks[]=new int[n];
System.out.println("Enter marks of students");
for(int i=0;i<n;i++)
{
marks[i]=sc1.nextInt();
}
System.out.println("Marks of Student:");
for(int i=0;i<n;i++)
{
System.out.println(marks[i]);
}
for(int i=0;i<n;i++)
{
sum=sum+marks[i];
}
avg=sum/n;
}
void display()
{

System.out.println("Student Information");
System.out.println("roll no= "+rollno);
//avg=sum/n;
System.out.println("Average is= "+avg);
}
}
class Employee extends Person
{
int emp_id;
double salary;
void set_emp(int id,double emp_sal)
{
emp_id=id;
salary=emp_sal;
}
void get_emp()
{
System.out.println("Employee ID="+emp_id);
System.out.println("Employee salary="+salary);
}
void calculate_tax()
{
double tax;
double income=salary*12;
System.out.println("Yearly salary="+income);
if(income<=200000)
{
tax=0;
}
else if(income<=300000)
{
tax=0.1*(income-200000);
}
else if(income<=500000)
{
tax=(0.2*(income-300000))+(0.1*100000);
}
else if(income<=1000000)
{
tax=(0.3*(income-500000))+(0.2*200000)+(0.1*100000);
}
else
{
tax=(0.4*(income-1000000))+(0.3*500000)+(0.2*200000)+(0.1*10000);
}
System.out.println("Tax="+tax);
}
}


class InheritanceTest
{
public static void main(String[] args)
{
int emp_id;
double salary;
Scanner sc=new Scanner(System.in);
System.out.println("Enter person name");
String name=sc.next();
System.out.println("Enter person Height");
double height=sc.nextDouble();
System.out.println("Enter person weight");
double weight=sc.nextDouble();
System.out.println("Enter person birth date");
int date=sc.nextInt();
System.out.println("Enter person birth  month");
int month=sc.nextInt();
System.out.println("Enter person  birth year");
int year=sc.nextInt();
System.out.println("Enter person  todays year");
int todaysyear=sc.nextInt();
Person p=new Person();
student s=new student();
Employee e=new Employee();
e.show(name,height,weight);
e.calculate_age(month,date,year,todaysyear);
s.calculate_avg();
s.display();
System.out.println("Enter employee id");
emp_id=sc.nextInt();
System.out.println("Enter employee salary");
salary=sc.nextDouble();
e.set_emp(emp_id,salary);
e. get_emp();
e.calculate_tax();
}
}
