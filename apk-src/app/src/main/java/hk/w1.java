package hk;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w1 extends mk.q implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20722f;

    public w1(long j10, oj.c cVar) {
        super(cVar.getContext(), cVar);
        this.f20722f = j10;
    }

    @Override // hk.k1
    public final String J() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.J());
        sb2.append("(timeMillis=");
        return om1.m(sb2, this.f20722f, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0.g(this.f20628d);
        n(new v1("Timed out waiting for " + this.f20722f + " ms", this));
    }
}
