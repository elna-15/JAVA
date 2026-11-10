package encapsulation;

public class StudentDriver {
    public static void main(String[] args) {
		Students s1=new Students("Elna",12,2026);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getyop());
		s1.setName("Siya");
		s1.setAge(15);
		s1.setyop(2020);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
        System.out.println(s1.getyop());		
	}
}
