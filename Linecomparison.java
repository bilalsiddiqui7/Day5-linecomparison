public class Linecomparison
{
	public static void equal()
	{
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1,x2,y1,y2,a1,a2,b1,b2;
		int l1,l2;
		x1=2;
		y1=2;
		x2=4;
		y2=4;
		a1=2;
		b1=2;
		a2=4;
		b2=4;
		l1=(int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		l2=(int) Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println(l1);
		System.out.println(l2);
		String s1=String.valueOf(l1);
		String s2=String.valueOf(l2);
		System.out.println(s1.equals(s2));
	}
	public static void compare()
	{
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1,x2,y1,y2,a1,a2,b1,b2;
		int l1,l2;
		x1=2;
		y1=2;
		x2=4;
		y2=4;
		a1=2;
		b1=2;
		a2=4;
		b2=4;
		l1=(int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		l2=(int) Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
		System.out.println(l1);
		System.out.println(l2);
		Integer a=new Integer(l1);
		Integer b=new Integer(l2);
		int compare=a.compareTo(b);
		if(compare>0)
			System.out.println("l1 is greater");
		else if (compare<0)
			System.out.println("l2 is greater");
		else
			System.out.println("Both are equal");
	}
	public static void main(String[] args) 
	{
		equal();
		compare();
	}
}
