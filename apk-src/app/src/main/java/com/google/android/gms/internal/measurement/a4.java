package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f13649a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f13650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13651c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f13650b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f13651c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
