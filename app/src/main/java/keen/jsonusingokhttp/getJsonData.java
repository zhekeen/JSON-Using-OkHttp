package keen.jsonusingokhttp;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Callback;

import java.io.IOException;

/**
 * Created by apple on 20/01/17.
 */

public class getJsonData {
    OkHttpClient client = new OkHttpClient();

    Call getArticles(String url, Callback callback)throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .build();
        Call call = client.newCall(request);
        call.enqueue(callback);
        return call;
    }
}
