package jp1pkg;

public class Program {

	private String name;
	private String name0;
	private String name1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name + "+x";
	}

	/*public String getName1() {
		return name1;
	}*/

	public void setName1(String name) {
		this.name1 = name;
	}

	Program() {
		name0 = "Initial Program Name";
		this.setName1("=Alter Program Name");
	}

	Program(String name1) {
		name0 = "Initial Program Name";
		name1 = name1;
	}

	public static void main(String[] args) {

		//OOP learn
		Program program1 = new Program("Alter Program Name");
		program1.setName("New Program Name");
		program1.name = "==New Program Name==";
		program1.name0 = "==Initial Program Name==";
		program1.name1 = "==Alter Program Name==";
		System.out.println(program1.getName());
		System.out.println(program1.name);
		System.out.println(program1.name0);
		System.out.println(program1.name1);

		//Counter class with static variable and method
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		System.out.println("Static variable Count /next 3 output lines/");
		System.out.println(c1.COUNT);
		System.out.println(c2.COUNT);
		System.out.println(Counter.COUNT);
		Counter.horn(); //method
		
		//arrays learn

		//init values
		int sum = 0;
		int[] iArr = {1,2,3,4};
		int[][] iArr3 = {{1,2,3},{4,5,6},{7,8,9}};
		String[][] sArr3 = {{"x1y1","x1y2","x1y3"},{"x2y1","x2y2","x2y3"},{"x3y1","x3y2","x3y3"}};

		for(int x = 0; x<iArr.length; x++) {
			sum += iArr[x];
		}
		System.out.println("sum variable /int/");
		sum = Math.abs(sum); //JDK Math Class
		System.out.println(sum);

		System.out.println("int position");
		for(int x = 0; x<iArr3.length; x++) {
			for(int y = 0; y<iArr3.length; y++) {
				System.out.println(Integer.toString(iArr3[x][y]) + " x"+ (x+1) + " y" + (y+1));
			}
		}

		System.out.println("string multidimension array elements position");
		for(int x = 0; x<sArr3.length; x++) {
			for(int y = 0; y<sArr3.length; y++) {
				System.out.println(sArr3[x][y] + " x"+ (x+1) + " y" + (y+1));
			}
		}

		System.out.println("int array for each and lenght");
		for (int x: iArr) {
			System.out.println(x);
		}
		System.out.println(iArr3.length);





		//for (int x: iArr3) {System.out.println(x);} //--error!

		System.out.println("All done!");
	}

}

