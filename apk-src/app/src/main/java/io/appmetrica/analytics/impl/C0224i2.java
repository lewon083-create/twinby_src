package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0224i2 extends Qg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo f24036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Wj f24037c;

    public C0224i2(@NonNull Y4 y42) {
        this(y42, y42.u(), Wj.c());
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        Y4 y42 = this.f22888a;
        if (!this.f24036b.c() && !this.f24036b.d()) {
            if (((C0264jh) y42.f23291k.a()).f24155e) {
                this.f24037c.b();
            }
            N8 n82 = this.f22888a.f23292l;
            if (n82.f22726c == null) {
                n82.a();
            }
            P8 p82 = n82.f22726c;
            p82.getClass();
            p82.f22830b = new HashSet();
            p82.f22832d = 0;
            P8 p83 = n82.f22726c;
            p83.f22829a = true;
            S8 s82 = n82.f22725b;
            IBinaryDataHelper iBinaryDataHelper = s82.f22951c;
            R8 r8 = s82.f22950b;
            s82.f22949a.getClass();
            iBinaryDataHelper.insert("event_hashes", r8.toByteArray(Q8.a(p83)));
        }
        return false;
    }

    public C0224i2(Y4 y42, wo woVar, Wj wj2) {
        super(y42);
        this.f24036b = woVar;
        this.f24037c = wj2;
    }
}
