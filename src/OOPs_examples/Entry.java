package OOPs_examples;

public class Entry extends Dog{

	public static void main(String[] args) {
		Animal Aobj=new Animal();
		Aobj.sound();
		inter i1= new Animal();
		i1.disp();
		Dog dObj=new Dog();
		dObj.sound();
		Animal Aref=new Dog();
		Aref.sound();
	}

}
