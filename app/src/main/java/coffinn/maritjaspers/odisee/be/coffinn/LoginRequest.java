package coffinn.maritjaspers.odisee.be.coffinn;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;


/**
 * Created by Marit Jaspers on 19/12/2016.
 */

public class LoginRequest extends StringRequest {


        private static final String LOGIN_REQUEST_URL = "http://tonikamitv.hostei.com/Login.php";
        private Map<String, String> params;

        public LoginRequest(String username, String password, Response.Listener < String > listener)
        {
            super(Method.POST, LOGIN_REQUEST_URL, listener, null);
            params = new HashMap<>();
            params.put("username", username);
            params.put("password", password);
        }

        @Override
        public Map<String, String> getParams ()
        {
        return params;
        }

}