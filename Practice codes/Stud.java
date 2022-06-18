package Collections;

public class Stud implements Comparable{ 
    
    int rollno;  
    String name;  
    int age;  
    Stud(int rollno,String name,int age){  
    this.rollno=rollno;  
    this.name=name;  
    this.age=age;  
    }  
      
    public int compareTo(Object st){  
    	Stud obj = (Stud) st;
    if(age==obj.age)  
    return 0;  
    else if(age>obj.age)  
    return 1;  
    else  
    return -1;  
    }  
    }  


