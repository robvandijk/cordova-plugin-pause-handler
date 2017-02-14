/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at
         http://www.apache.org/licenses/LICENSE-2.0
       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package org.apache.cordova.pausehandler;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PauseHandler extends CordovaPlugin {
    private static final String LOG_TAG = "PauseHandler";
    private CordovaWebView webView;

    public PauseHandler() {
    }

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.v(TAG, "Init PauseHandler");
        this.webView = webView;
    }

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        if (action.equals("flushCookies")) {
            LOG.v(LOG_TAG, "IN flushCookies")''
        } else {
            return false;
        }
        return true;
    }

    public void onPause(boolean multitasking) {
        LOG.v(LOG_TAG, "IN onPause");
    }
}