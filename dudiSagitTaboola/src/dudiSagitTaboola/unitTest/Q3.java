package dudiSagitTaboola.unitTest;


import dudiSagitTaboola.q3.WordsCounter;

public class Q3 {

	public static void main (String [] args) {
		WordsCounter wc=new WordsCounter ();
		// load text files in parallel
		wc.load("C://output/file1.txt","C://output/file2.txt","C://output/file3.txt");
		// display words statistics
		wc.displayStatus();
		}

}
