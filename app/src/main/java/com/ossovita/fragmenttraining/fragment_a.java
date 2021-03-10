package com.ossovita.fragmenttraining;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_a extends Fragment {

    private static final String TAG = "fragment_a";
    WebView webView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //getArguments() returns Bundle
        String siteAddress = getArguments().getString("siteAddress");
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        webView = view.findViewById(R.id.webview);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        Log.d(TAG, "onCreateView: siteAddress" + siteAddress);
        webView.loadUrl(siteAddress);

        return view;
    }
}
