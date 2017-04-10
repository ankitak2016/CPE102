
public class Tests {
	
	public static void main(String args[]){
		
		System.out.println("Animal Class Test");
		Animal animal = new Animal(4);
		System.out.println(animal);
		System.out.println("Equals method");
		System.out.println("Compared to null: " + animal.equals(null));
		Animal animal1 = new Animal(4);
		System.out.println(animal1);
		System.out.println(animal.equals(animal1));
		System.out.println();
		System.out.println("Person Class Test");
		Person person = new Person("Anna", 2);
		System.out.println(person);
		Person person1 = new Person("Anna",4);
		System.out.println(person1);
		System.out.println("Equals method");
		System.out.println(person.equals(person1));
		System.out.println();
		System.out.println("Student Class Test");
		Student student = new Student(3.6, "Ashley",2);
		Student student1 = new Student(3.6, "Anna", 2);
		System.out.println(student);
		System.out.println(student1);
		System.out.println("Equals method");
		System.out.println(student.equals(student1));
	
	}

}
