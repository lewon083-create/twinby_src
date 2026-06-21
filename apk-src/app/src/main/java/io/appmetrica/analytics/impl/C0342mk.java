package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0342mk extends Kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo f24378a;

    public C0342mk() {
        this(C0382oa.k().D().b());
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final void a(int i) {
        vo voVar = this.f24378a;
        synchronized (voVar) {
            xo xoVar = voVar.f24950a;
            xoVar.a(xoVar.a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final int b() {
        int iOptInt;
        vo voVar = this.f24378a;
        synchronized (voVar) {
            iOptInt = voVar.f24950a.a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.Kc
    public final SparseArray<Jc> c() {
        SparseArray<Jc> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C0367nk(this.f24378a));
        sparseArray.put(115, new C0392ok());
        sparseArray.put(116, new C0466rk());
        return sparseArray;
    }

    public C0342mk(vo voVar) {
        this.f24378a = voVar;
    }
}
