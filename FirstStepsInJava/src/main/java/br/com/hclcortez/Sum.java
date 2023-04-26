package br.com.hclcortez;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.hclcortez.exceptions.UnsupportedMathOperationException;

@Service
public class Sum {
	
	public Double sum(String numberOne, String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please, set a numeric value");
		}
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	private Double convertToDouble(String strNumber) {
		if(strNumber == null){
			return 0D;
		}
		String number = strNumber.replaceAll(",", ".");
		if(isNumeric(number)) {
			return Double.parseDouble(number);
		}
		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null){
			return false;
		}
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]");
	}
	
}
