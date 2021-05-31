package dudiSagitTaboola.q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {

	private String source;
	private String fileName;
	private File file;
	private List<Line> lines;
	public FileRead(String source, String fileName) {
		super();
		this.source = source;
		this.fileName = fileName;
		this.file = new File(source+fileName);
		try {
	        Scanner myReader = new Scanner(file);
	        List<String> rows = new ArrayList<String>();
	        this.lines = new ArrayList<Line>();
	        int count = 0;
	        while (myReader.hasNextLine()) {
	        	if(count == 4) {
	        		count  = 0;
	        		this.lines.add(new Line(rows));
	        		rows = new ArrayList<String>();
	        	}else {
	        		rows.add(myReader.nextLine());
	        		count ++;
	        	}
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {

	      }

	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public List<Line> getLines() {
		return lines;
	}
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}
	public void printLinse() {
		for (Line line : this.lines) {
			System.out.println(line.changeLineToInt());
		}
	}
	public void writeFileOutPut(String fileName) {
		try {
		      FileWriter myWriter = new FileWriter(fileName+".txt");
		      for (Line line : this.lines) {
			      myWriter.write(line.changeLineToInt() + "\n");
		      }
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	@Override
	public String toString() {
		return "FileRead [source=" + source + ", fileName=" + fileName + ", file=" + file + ", lines=" + lines + "]";
	}
	
}
