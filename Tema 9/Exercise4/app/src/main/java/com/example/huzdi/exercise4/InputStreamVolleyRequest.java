package com.example.huzdi.exercise4;

import android.app.DownloadManager;

import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import org.junit.runner.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huzdi on 09.08.2017.
 */

public class InputStreamVolleyRequest extends com.android.volley.Request<byte[]> {

    private final Response.Listener<byte[]> mListener;
    private Map<String,String> mParams;

    public Map<String,String> responseHeaders;

    protected Map<String,String> getParams() throws com.android.volley.AuthFailureError {
        return mParams;
    }

    @Override
    protected Response<byte[]> parseNetworkResponse(NetworkResponse response) {
        responseHeaders = response.headers;
        return Response.success(response.data, HttpHeaderParser.parseCacheHeaders(response));
    }

    @Override
    protected void deliverResponse(byte[] response) {
        mListener.onResponse(response);
    }

    public InputStreamVolleyRequest(int method, String url,  Response.Listener<byte[]> mListener, Response.ErrorListener listener, HashMap<String,String> params) {
        super(method, url, listener);
        this.mListener = mListener;
        this.mParams = params;

    }
}
