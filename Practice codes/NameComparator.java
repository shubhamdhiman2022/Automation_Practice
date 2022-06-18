package Collections;

import java.util.Comparator;

class NameComparator implements Comparator{ 
    public int compare(Object o1,Object o2){  
    Stud s1=(Stud)o1;  
    Stud s2=(Stud)o2;  
      
    return s1.name.compareTo(s2.name);  
    }  
}