package Java;

public class CloneMethod implements Cloneable{
		int rollno;
		String name;
		
		public CloneMethod(int rollno, String name) {
			this.rollno = rollno;
			this.name = name;
		}
		public Object clone()throws CloneNotSupportedException{
			return super.clone();
			
		}
		public static void main(String[] args) {
			CloneMethod m = new CloneMethod(101,"Wasim Shaikh");
			try {
				CloneMethod m1 =(CloneMethod)m.clone();
				System.out.println(m.rollno+" "+m.name);
				System.out.println(m1.rollno+" "+m1.name);

			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			}
		}
}
