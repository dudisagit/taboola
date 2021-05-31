package dudiSagitTaboola.q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class WordsCounter implements Runnable{
	private static ConcurrentHashMap<String, Integer> wordsCounter;
	private Stack<String> files;
	Thread worker1;
	Thread worker2;
	
	public WordsCounter() {
		super();
		wordsCounter = new ConcurrentHashMap<String, Integer> ();
		this.files = new Stack<String>();
		worker1 = new Thread(this);
        worker2 = new Thread(this);
        worker1.start();
        worker2.start();
	}
	public void load(String file1,String file2,String file3) {
		this.files.push(file1);
		this.files.push(file2);
		this.files.push(file3);
		worker1.run();
		worker2.run();
		

	}
	@Override
    public void run() {
		try {
			while(!this.files.empty()) {
		        checkWords(this.files.pop());
			}
	      } catch (FileNotFoundException e) {
	
	      }
    }
	public static synchronized void syncCalculate(String word) {
		if(wordsCounter.get(word) != null) {
			wordsCounter.replace(word,wordsCounter.get(word)+1);
		}else {
			wordsCounter.putIfAbsent(word, 1); 
		}
	 }
	public void checkWords(String nameFile) throws FileNotFoundException {
		Scanner myReader = new Scanner(new File(nameFile));
		String line;
		String [] words;
		while (myReader.hasNextLine()) {
			line = myReader.nextLine();
			words = line.split("\\s+");
			for (int i = 0; i < words.length; i++) {
				syncCalculate(words[i]);
			}
		}
		myReader.close();
	}
	public void displayStatus() {
		int counter = 0;
		for (Map.Entry<String, Integer> item : wordsCounter.entrySet()) {
			System.out.println(item.getKey() + " "+item.getValue());
			counter = counter + item.getValue();
		}
		System.out.println();
		System.out.print("** total: "+counter );
	}
}
