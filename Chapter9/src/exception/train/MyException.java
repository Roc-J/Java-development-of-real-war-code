package exception.train;

/**
 * 
 * @author Roc-J
 *
 */
public class MyException extends Exception {
	String message;
	
	public MyException(String ErrorMessage){
		this.message = ErrorMessage;
	}
	
	public String getMessage(){
		return message;
	}
	
	
}
