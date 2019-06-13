package network.volley;


import network.NetworkException;


/**
 * Created by Abid on 11-01-2018.
 */
public interface RequestResponseListener {

    interface Listener{
        <T> void onResponse(T response);
    }


    interface ErrorListener{
        void onError(NetworkException error);
    }

    interface AuthErrorListener{
        void onAuthError();
    }
}
