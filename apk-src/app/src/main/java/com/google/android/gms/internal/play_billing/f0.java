package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends k implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f14175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f14176d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient c0 f14177b;

    static {
        z zVar = c0.f14146c;
        f14175c = new f0(r0.f14290f);
        Object[] objArr = {p0.f14276d};
        for (int i = 0; i < 1; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(l7.o.i(i, "at index "));
            }
        }
        f14176d = new f0(c0.q(1, objArr));
    }

    public f0(c0 c0Var) {
        this.f14177b = c0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.k
    public final /* bridge */ /* synthetic */ h0 a() {
        c0 c0Var = this.f14177b;
        return c0Var.isEmpty() ? x0.f14357j : new y0(c0Var, n0.f14246d);
    }
}
