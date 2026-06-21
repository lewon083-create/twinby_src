package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe f6933a;

    public jq0(xe xeVar) {
        this.f6933a = xeVar;
    }

    public static final Uri b(Uri uri, String str) throws ye {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new ye("Parameter already exists: dc_ms");
                            }
                            String string = uri.toString();
                            int iIndexOf = string.indexOf(";adurl");
                            if (iIndexOf != -1) {
                                int i = iIndexOf + 1;
                                StringBuilder sb2 = new StringBuilder(string.substring(0, i));
                                sb2.append("dc_ms=");
                                sb2.append(str);
                                sb2.append(";");
                                sb2.append((CharSequence) string, i, string.length());
                                return Uri.parse(sb2.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int iIndexOf2 = string.indexOf(encodedPath);
                            StringBuilder sb3 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                            sb3.append(";dc_ms=");
                            sb3.append(str);
                            sb3.append(";");
                            sb3.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                            return Uri.parse(sb3.toString());
                        }
                    }
                } catch (NullPointerException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                throw new ye("Provided Uri is not in a valid state");
            }
        }
        if (uri.getQueryParameter("ms") != null) {
            throw new ye("Query parameter already exists: ms");
        }
        String string2 = uri.toString();
        int iIndexOf3 = string2.indexOf("&adurl");
        if (iIndexOf3 == -1) {
            iIndexOf3 = string2.indexOf("?adurl");
        }
        if (iIndexOf3 == -1) {
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        int i10 = iIndexOf3 + 1;
        StringBuilder sb4 = new StringBuilder(string2.substring(0, i10));
        sb4.append("ms=");
        sb4.append(str);
        sb4.append("&");
        sb4.append((CharSequence) string2, i10, string2.length());
        return Uri.parse(sb4.toString());
    }

    public final Uri a(Uri uri, Context context, View view, Activity activity) throws ye {
        try {
            return b(uri, this.f6933a.f12136b.c(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new ye("Provided Uri is not in a valid state");
        }
    }
}
