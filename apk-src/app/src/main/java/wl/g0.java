package wl;

import com.google.android.gms.internal.ads.kv0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends kv0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StringBuilder f35445d;

    public g0() {
        super(4);
        this.f35445d = new StringBuilder();
        this.f7316c = 4;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final kv0 m() {
        kv0.n(this.f35445d);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final String toString() {
        return "<!--" + this.f35445d.toString() + "-->";
    }
}
