package f2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16570c;

    public d(int i) {
        super(i);
        this.f16570c = new Object();
    }

    @Override // f2.c
    public final Object a() {
        Object objA;
        synchronized (this.f16570c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // f2.c
    public final boolean c(Object instance) {
        boolean zC;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f16570c) {
            zC = super.c(instance);
        }
        return zC;
    }
}
