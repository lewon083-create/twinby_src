package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hk f22695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lk f22696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f22697d;

    public Mk(Context context, R4 r42) {
        r42.a();
        this.f22694a = "session_extras";
        this.f22695b = new Hk();
        this.f22696c = new Lk();
        this.f22697d = C0382oa.k().B().a(context, r42);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f22697d.get(this.f22694a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f22695b.toModel(this.f22696c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Hk hk2 = this.f22695b;
        this.f22696c.getClass();
        return hk2.toModel(new Jk());
    }
}
