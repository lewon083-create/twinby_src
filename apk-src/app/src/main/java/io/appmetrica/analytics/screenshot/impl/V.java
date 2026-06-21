package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25449a;

    public V(InterfaceC0678i interfaceC0678i) {
        this.f25449a = interfaceC0678i.a();
    }

    public final void a(C0681l c0681l) {
        for (T t10 : this.f25449a) {
            C0682m c0682m = null;
            if (c0681l != null) {
                C0681l c0681l2 = c0681l.f25495a ? c0681l : null;
                if (c0681l2 != null) {
                    c0682m = c0681l2.f25496b;
                }
            }
            t10.a(c0682m);
        }
    }
}
