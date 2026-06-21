package e1;

import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f15976c;

    public /* synthetic */ p(c0 c0Var, int i) {
        this.f15975b = i;
        this.f15976c = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15975b) {
            case 0:
                c0 c0Var = this.f15976c;
                com.google.android.gms.internal.auth.g.e(c0Var.f15917a, "signalEndOfInputStream");
                k0.j.a(c0Var.a(), new v7.f(12, c0Var), c0Var.i);
                return;
            case 1:
                c0 c0Var2 = this.f15976c;
                c0Var2.i.execute(new p(c0Var2, 2));
                return;
            case 2:
                c0 c0Var3 = this.f15976c;
                if (c0Var3.f15940y) {
                    com.google.android.gms.internal.auth.g.O(c0Var3.f15917a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    c0Var3.f15941z = null;
                    c0Var3.l();
                    c0Var3.f15940y = false;
                    return;
                }
                return;
            case 3:
                c0 c0Var4 = this.f15976c;
                int iM = t.z.m(c0Var4.G);
                if (iM == 1) {
                    c0Var4.h();
                    return;
                } else {
                    if (iM == 6 || iM == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 4:
                c0 c0Var5 = this.f15976c;
                switch (t.z.m(c0Var5.G)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        c0Var5.g();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        c0Var5.k(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(om1.E(c0Var5.G)));
                }
            default:
                c0 c0Var6 = this.f15976c;
                c0Var6.D = true;
                if (c0Var6.C) {
                    if (!c0Var6.f15935t) {
                        com.google.android.gms.internal.auth.g.e(c0Var6.f15917a, "mMediaCodec.stop()");
                        c0Var6.f15922f.stop();
                    }
                    c0Var6.i();
                    return;
                }
                return;
        }
    }
}
