package network;


/**
 * Created by Abid on 11-01-2018.
 */
public interface NetworkResponse {

    interface Listener{
        void onResponse(Object result);
    }
    interface ErrorListener{
        void onError(NetworkException error);
    }
}
