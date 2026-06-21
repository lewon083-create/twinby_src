package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5771a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ gc f5770c = new gc(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ gc f5769b = new gc(0);

    public /* synthetic */ gc(int i) {
        this.f5771a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f5771a != 0 ? vc.a(null) : new jc();
    }
}
