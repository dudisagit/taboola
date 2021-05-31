package dudiSagitTaboola.unitTest;


import dudiSagitTaboola.q1.FileRead;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1a
		FileRead file1 = new FileRead("c://", "input_Q1a.txt");
		file1.writeFileOutPut("output");
		//Q1a
		FileRead file2 = new FileRead("c://", "input_Q1b.txt");
		file2.writeFileOutPut("output2");
	}

}
