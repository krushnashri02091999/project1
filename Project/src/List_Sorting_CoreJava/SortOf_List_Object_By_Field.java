package List_Sorting_CoreJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortOf_List_Object_By_Field {
public String name;
public long salary;

public SortOf_List_Object_By_Field(String name,long salary) {
	this.name=name;
	this.salary=salary;
}


@Override
public String toString() {
	return "SortOf_List_Object_By_Field [name=" + name + ", salary=" + salary + "]";
}


public static void main(String[] args) {
	List<SortOf_List_Object_By_Field> list = Arrays.asList(new SortOf_List_Object_By_Field("Abhi", 15000), new SortOf_List_Object_By_Field("Ram", 10000),new SortOf_List_Object_By_Field("Hari", 20000));
list.sort(Comparator.comparingLong(emp->emp.salary));	
System.out.println(list);
}
}
