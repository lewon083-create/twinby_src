package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uk implements e80, o31 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10953b;

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        ((t60) obj).r(this.f10953b);
    }

    public boolean b(Intent intent) {
        pa.c0.j(intent, "Intent can not be null");
        return !this.f10953b.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public Object mo8h() {
        n nVar;
        Context context = this.f10953b;
        r51 r51Var = n.f8058o;
        synchronized (n.class) {
            try {
                if (n.f8064u == null) {
                    Context applicationContext = context == null ? null : context.getApplicationContext();
                    HashMap map = new HashMap(8);
                    map.put(0, 1000000L);
                    map.put(2, -9223372036854775807L);
                    map.put(3, -9223372036854775807L);
                    map.put(4, -9223372036854775807L);
                    map.put(5, -9223372036854775807L);
                    map.put(10, -9223372036854775807L);
                    map.put(9, -9223372036854775807L);
                    map.put(7, -9223372036854775807L);
                    n.f8064u = new n(applicationContext, map);
                }
                nVar = n.f8064u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    public uk(Context context) {
        pa.c0.j(context, "Context can not be null");
        this.f10953b = context;
    }
}
