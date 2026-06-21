package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0123e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23729a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f23730b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f23731c;

    public C0123e5(Context context) {
        this.f23731c = context.getApplicationContext();
    }

    public final Ha a(R4 r42, C0426q4 c0426q4, P7 p72, HashMap map) {
        Ha ha2 = (Ha) map.get(r42.toString());
        if (ha2 != null) {
            ha2.a(c0426q4);
            return ha2;
        }
        Ha haA = p72.a(this.f23731c, r42, c0426q4);
        map.put(r42.toString(), haA);
        return haA;
    }
}
