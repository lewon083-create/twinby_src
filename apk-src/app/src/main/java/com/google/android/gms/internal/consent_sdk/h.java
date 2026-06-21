package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import android.webkit.WebSettings;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13399c;

    public /* synthetic */ h(int i, Object obj) {
        this.f13398b = i;
        this.f13399c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13398b;
        Object obj = this.f13399c;
        switch (i) {
            case 0:
                ((k) obj).c(new n1(4, "Web view timed out."));
                break;
            case 1:
                ((o) obj).b();
                break;
            case 2:
                a0 a0Var = (a0) obj;
                AtomicReference atomicReference = a0Var.f13323k;
                String str = (String) a0Var.f13314a.get();
                if (str == null) {
                    Log.w("UserMessagingPlatform", "Metrics reporting URL is not set yet.");
                } else {
                    int size = ((Queue) atomicReference.get()).size();
                    for (int i10 = 0; i10 < size; i10++) {
                        s2 s2Var = (s2) ((Queue) atomicReference.get()).poll();
                        if (s2Var != null) {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
                                httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(a0Var.f13315b));
                                httpURLConnection.setConnectTimeout(10000);
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setRequestProperty("Content-Type", "application/protobuf");
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                int iC = s2Var.c();
                                Logger logger = l5.f13457g;
                                if (iC > 4096) {
                                    iC = 4096;
                                }
                                l5 l5Var = new l5(outputStream, iC);
                                s2Var.a(l5Var);
                                if (l5Var.f13462e > 0) {
                                    l5Var.k();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 200 && responseCode != 204) {
                                    Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: Http error code - " + responseCode + ".\n" + (httpURLConnection.getErrorStream() != null ? new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next() : null));
                                    ((Queue) atomicReference.get()).add(s2Var);
                                }
                            } catch (IOException e3) {
                                Log.w("UserMessagingPlatform", "Fail to ping metrics reporting URL: ".concat(String.valueOf(e3.getMessage())));
                                ((Queue) atomicReference.get()).add(s2Var);
                            } catch (URISyntaxException e7) {
                                Log.w("UserMessagingPlatform", "Metrics reporting URL " + str + " is not valid: " + e7.getMessage());
                            }
                        }
                    }
                }
                break;
            default:
                ((yc.c) obj).b();
                break;
        }
    }
}
