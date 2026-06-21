package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Eb implements InterfaceC0066c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0170g0 f22287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cn f22288b = new Cn();

    public Eb(@NotNull InterfaceC0170g0 interfaceC0170g0) {
        this.f22287a = interfaceC0170g0;
    }

    public static final void a(Eb eb2, V v5) {
        eb2.f22287a.a(v5);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0066c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArrB;
        Cn cn = this.f22288b;
        Thread threadA = cn.f22237a.a();
        try {
            stackTraceElementArrB = cn.f22237a.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        V v5 = new V((C0569vn) cn.f22238b.apply(threadA, stackTraceElementArrB), cn.a(threadA, null), cn.f22239c.a());
        ((A9) C0071c4.l().f23537c.a()).f22059b.post(new e1.y(29, this, v5));
    }
}
