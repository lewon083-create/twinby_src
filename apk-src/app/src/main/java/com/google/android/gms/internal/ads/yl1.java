package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yl1 extends wl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm1 f12663b = new hm1();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof yl1) && ((yl1) obj).f12663b.equals(this.f12663b);
        }
        return true;
    }

    public final wl1 f(String str) {
        return (wl1) this.f12663b.get(str);
    }

    public final int hashCode() {
        return this.f12663b.hashCode();
    }
}
