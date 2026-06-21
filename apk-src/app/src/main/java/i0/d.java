package i0;

import android.util.CloseGuard;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CloseGuard f20766b = new CloseGuard();

    @Override // i0.e
    public final void a() {
        this.f20766b.warnIfOpen();
    }

    @Override // i0.e
    public final void close() {
        this.f20766b.close();
    }

    @Override // i0.e
    public final void d(String str) {
        this.f20766b.open(str);
    }
}
