package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f13196a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f13197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f13199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashMap f13200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f13201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f13202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f13203h;
    public static final HashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Object f13204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f13205k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f13197b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f13198c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        f13199d = new AtomicBoolean();
        f13201f = new HashMap(16, 1.0f);
        f13202g = new HashMap(16, 1.0f);
        f13203h = new HashMap(16, 1.0f);
        i = new HashMap(16, 1.0f);
        f13205k = new String[0];
    }
}
