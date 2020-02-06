import java.util.*;
class Employee{
	int age;
	String name;
	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public Integer getAge(){
		return this.age;
	}
	public String toString(){
		return this.getName() + " " + this.getAge();
	}
}
class ByFirstName implements Comparator{
	public int compare(Object o1,Object o2){
		String[] s1 = ((Employee)o1).getName().split(" ");
		String[] s2 = ((Employee)o2).getName().split(" ");
		return s1[0].compareTo(s2[0]);
	}
}
class ByLastName implements Comparator{
	public int compare(Object o1,Object o2){
		if(spaces(((Employee)o1).getName())){
			String[] s2 = ((Employee)o2).getName().split(" ");
			return ((Employee)o1).getName().compareTo(s2[0]);
		}
		else if(spaces(((Employee)o2).getName())){
			String[] s1 = ((Employee)o1).getName().split(" ");
			return ((Employee)o2).getName().compareTo(s1[0]);
		}
		else if(spaces(((Employee)o2).getName()) && spaces(((Employee)o1).getName())){
			return ((Employee)o2).getName().compareTo(((Employee)o1).getName());
		}
		else{
			String[] s1 = ((Employee)o1).getName().split(" ");
			String[] s2 = ((Employee)o2).getName().split(" ");
			return s1[1].compareTo(s2[1]);
		}
	}
	public boolean spaces(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				return false;
			}
		}
		return true;
	}
}
class ByAge implements Comparator{
	public int compare(Object o1,Object o2){
		return ((Employee)o1).getAge().compareTo(((Employee)o2).getAge());
	}
}
class EmployeeNameSort{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int flag = 1;
		while(flag!=0){
			System.out.println("Add Employee");
			System.out.println("Enter Name");
			String name = n.nextLine();
			System.out.println("Enter Age");
			int age = n.nextInt();
			list.add(new Employee(name,age));
			System.out.print("Do you want to add more Employees? Y/N :");
			String input = n.next();
			n.nextLine();
			input = input.toLowerCase();
			if(!input.equals("Y") && !input.equals("y")){
				flag = 0;
			}
		}
		int flag1 = 1;
		while(flag1 != 0){
			System.out.println("Sort By : ");
			System.out.println("1. First Name");
			System.out.println("2. Last Name");
			System.out.println("3. Age");
			int n1 = n.nextInt();
			if(n1==1){
				Collections.sort(list,new ByFirstName());
				System.out.print(list);
			}
			else if(n1==2){
				Collections.sort(list,new ByLastName());
				System.out.print(list);
			}
			else if(n1==3){
				Collections.sort(list,new ByAge());
				System.out.print(list);
			}
			else{
				flag1 = 0;
			}
		}
	}
}