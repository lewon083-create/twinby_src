package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hd1 f6102b = new hd1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6103a = new HashMap();

    public final synchronized void a(String str, o91 o91Var) {
        try {
            HashMap map = this.f6103a;
            if (!map.containsKey(str)) {
                map.put(str, o91Var);
                return;
            }
            if (((o91) map.get(str)).equals(o91Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(o91Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb2.append("Parameters object with name ");
            sb2.append(str);
            sb2.append(" already exists (");
            sb2.append(strValueOf);
            sb2.append("), cannot insert ");
            sb2.append(strValueOf2);
            throw new GeneralSecurityException(sb2.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (o91) entry.getValue());
        }
    }
}
