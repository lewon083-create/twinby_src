package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0525u4 extends Ad {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f24833f;

    public AbstractC0525u4(int i, String str, Object obj, ro roVar, K2 k22) {
        super(i, str, roVar, k22);
        this.f24833f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ad, io.appmetrica.analytics.impl.Cdo
    public final void a(@NonNull C0091co c0091co) {
        if (f()) {
            K2 k22 = this.f22066d;
            int i = this.f22064b;
            C0142eo c0142eoA = k22.a(c0091co, (C0142eo) ((HashMap) c0091co.f23643a.get(i)).get(this.f22063a), this);
            if (c0142eoA != null) {
                a(c0142eoA);
            }
        }
    }

    public abstract void a(@NonNull C0142eo c0142eo);

    @NonNull
    public final Object g() {
        return this.f24833f;
    }
}
