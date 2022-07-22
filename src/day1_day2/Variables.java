package day1_day2;

public class Variables {
		//instance variable
		int num;
		double dnum;
		public static void main(String[] args) {
			//Local variables and primitive data type
			byte by=1;
			short s=20;
			long l=10000;
			int a=10;
			double d=10.20;
			float f=10.20F;
			char c='A';
			boolean bn=false;
			//  non primitive data type
			String st="Java";
			
			System.out.println("Byte:"+by);
			System.out.println("Short:"+s);
			System.out.println("long:"+l);
			System.out.println("Integer:"+a);
			System.out.println("Double:"+d);
			System.out.println("float:"+f);
			System.out.println("Char:"+c);
			System.out.println("Boolean:"+bn);
			System.out.println("String:"+st);
			//instance variable
			Variables t=new Variables();
			t.num=10;
			t.dnum=10.50;
			System.out.println(t.num);
			System.out.println(t.dnum);
		}
}
