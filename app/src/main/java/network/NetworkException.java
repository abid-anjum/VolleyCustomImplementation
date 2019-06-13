package network;


/**
 * Created by Abid on 11-01-2018.
 */
public class NetworkException extends Exception {

    public String errorCode;

    public NetworkException(){

    }

    public NetworkException(String errorCode, String message){
        super(message);
        this.errorCode = errorCode;
    }

    public NetworkException(String message){
        super(message);
    }
}
