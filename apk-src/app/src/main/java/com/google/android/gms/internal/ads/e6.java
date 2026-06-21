package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f4841a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f4842b = "media3.common";

    public static synchronized void a(String str) {
        if (f4841a.add(str)) {
            String str2 = f4842b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str);
            f4842b = sb2.toString();
        }
    }
}
