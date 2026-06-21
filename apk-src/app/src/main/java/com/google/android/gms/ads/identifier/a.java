package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f2529b;

    public a(HashMap map) {
        this.f2529b = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap map = this.f2529b;
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        String string = builderBuildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + string);
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e3) {
            e = e3;
            Log.w("HttpUrlPinger", z.e("Error while pinging URL: ", string, ". ", e.getMessage()), e);
        } catch (IndexOutOfBoundsException e7) {
            Log.w("HttpUrlPinger", z.e("Error while parsing ping URL: ", string, ". ", e7.getMessage()), e7);
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("HttpUrlPinger", z.e("Error while pinging URL: ", string, ". ", e.getMessage()), e);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
