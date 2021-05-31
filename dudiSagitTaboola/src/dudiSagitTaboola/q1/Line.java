package dudiSagitTaboola.q1;

import java.util.ArrayList;
import java.util.List;

public class Line {

	private List<InvoiceNumber> invoiceNumbers;
	

	public Line(List<String> data) {
		super();
		this.invoiceNumbers = new ArrayList<InvoiceNumber>();
		int countNumber = data.get(0).length()/3;
		for (int j = 0; j < countNumber; j++) {
			invoiceNumbers.add(new InvoiceNumber(""+data.get(0).charAt(1+j*3)+
					data.get(1).charAt(1+j*3)+ data.get(2).charAt(1+j*3), 
					""+data.get(1).charAt(0+j*3)+data.get(1).charAt(2+j*3)
					+ data.get(2).charAt(0+j*3)+ data.get(2).charAt(2+j*3)));
		}
	}


	public List<InvoiceNumber> getInvoiceNumbers() {
		return invoiceNumbers;
	}

	public void setInvoiceNumbers(List<InvoiceNumber> invoiceNumbers) {
		this.invoiceNumbers = invoiceNumbers;
	}
	public String changeLineToInt() {
		String numbers = "";
		String number = "";
		for (InvoiceNumber invoiceNumber : invoiceNumbers) {
			number = (invoiceNumber.hashCode() == -1) ? "?":String.valueOf(invoiceNumber.hashCode());
			numbers = numbers + number;
		}
		try {
			Integer.parseInt(numbers);
		} catch (NumberFormatException e) {
			numbers = "ILLEGAL "+numbers;
		}
		return numbers;
	}


	@Override
	public String toString() {
		return "Line [" + invoiceNumbers.toString() + "]";
	}
	
	

}
