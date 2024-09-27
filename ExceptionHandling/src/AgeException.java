// class represents user-defined exception  
@SuppressWarnings("serial")
public class AgeException extends Exception{
	AgeException(String message){
		super(message);
	}
}