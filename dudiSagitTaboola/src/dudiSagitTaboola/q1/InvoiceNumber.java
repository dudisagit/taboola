package dudiSagitTaboola.q1;

public class InvoiceNumber {

	private String verticalLines;
	private String horizontalLines;
	public InvoiceNumber(String verticalLines, String horizontalLines) {
		super();
		this.verticalLines = verticalLines;
		this.horizontalLines = horizontalLines;

	}
	public InvoiceNumber() {
		super();
	}
	public String getVerticalLines() {
		return verticalLines;
	}
	public void setVerticalLines(String verticalLines) {
		this.verticalLines = verticalLines;
	}
	public String getHorizontalLines() {
		return horizontalLines;
	}
	public void setHorizontalLines(String horizontalLines) {
		this.horizontalLines = horizontalLines;
	}

	@Override
	public String toString() {
		return "InvoiceNumber [verticalLines=" + verticalLines + ", horizontalLines=" + horizontalLines + "]";
	}
	@Override
	public int hashCode() {
		int number = -1;
	    if(this.horizontalLines.equals("||||") && this.verticalLines.equals("_ _")) {
	    	number= 0;
	    }else if(this.horizontalLines.equals(" | |") && this.verticalLines.equals("   ")) {
	    	number = 1;
	    }else if(this.horizontalLines.equals(" || ") && this.verticalLines.equals("___")) {
	    	number= 2;
	    }else if(this.horizontalLines.equals(" | |") && this.verticalLines.equals("___")) {
	    	number = 3;
	    }else if(this.horizontalLines.equals("|| |") && this.verticalLines.equals(" _ ")) {
	    	number= 4;
	    }else if(this.horizontalLines.equals("|  |") && this.verticalLines.equals("___")) {
	    	number= 5;
	    }else if(this.horizontalLines.equals("| ||") && this.verticalLines.equals("___")) {
	    	number = 6;
	    }else if(this.horizontalLines.equals(" | |") && this.verticalLines.equals("_  ")) {
	    	number = 7;
	    }else if(this.horizontalLines.equals("||||") && this.verticalLines.equals("___")) {
	    	number = 8;
	    }else if(this.horizontalLines.equals("|| |") && this.verticalLines.equals("___")) {
	    	number = 9;
	    }
	    return number;
	}



	
}
