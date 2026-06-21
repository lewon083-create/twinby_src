package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class at1 extends ro implements Handler.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xs1 f36851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final zs1 f36852o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f36853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ys1 f36854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gz2 f36855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f36856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f36857t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f36858u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f36859v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public vs1 f36860w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at1(xn0 xn0Var, Looper looper) {
        super(5);
        ws1 ws1Var = xs1.f44797a;
        this.f36852o = (zs1) ni.a(xn0Var);
        this.f36853p = looper == null ? null : lb3.a(looper, (Handler.Callback) this);
        this.f36851n = (xs1) ni.a(ws1Var);
        this.f36854q = new ys1();
        this.f36859v = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.vs1 r6, java.util.ArrayList r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            yads.us1[] r1 = r6.f44117b
            int r2 = r1.length
            if (r0 >= r2) goto L7f
            r1 = r1[r0]
            yads.nx0 r1 = r1.a()
            if (r1 == 0) goto L75
            yads.xs1 r2 = r5.f36851n
            yads.ws1 r2 = (yads.ws1) r2
            r2.getClass()
            java.lang.String r2 = r1.f41375m
            java.lang.String r3 = "application/id3"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-emsg"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-scte35"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/x-icy"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "application/vnd.dvb.ait"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L75
        L3f:
            yads.xs1 r2 = r5.f36851n
            yads.ws1 r2 = (yads.ws1) r2
            yads.gz2 r1 = r2.a(r1)
            yads.us1[] r2 = r6.f44117b
            r2 = r2[r0]
            byte[] r2 = r2.b()
            r2.getClass()
            yads.ys1 r3 = r5.f36854q
            r3.b()
            yads.ys1 r3 = r5.f36854q
            int r4 = r2.length
            r3.c(r4)
            yads.ys1 r3 = r5.f36854q
            java.nio.ByteBuffer r3 = r3.f42864d
            r3.put(r2)
            yads.ys1 r2 = r5.f36854q
            r2.c()
            yads.ys1 r2 = r5.f36854q
            yads.vs1 r1 = r1.a(r2)
            if (r1 == 0) goto L7c
            r5.a(r1, r7)
            goto L7c
        L75:
            yads.us1[] r1 = r6.f44117b
            r1 = r1[r0]
            r7.add(r1)
        L7c:
            int r0 = r0 + 1
            goto L1
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.at1.a(yads.vs1, java.util.ArrayList):void");
    }

    @Override // yads.ro
    public final String d() {
        return "MetadataRenderer";
    }

    @Override // yads.ro
    public final boolean f() {
        return this.f36857t;
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.f36860w = null;
        this.f36859v = -9223372036854775807L;
        this.f36855r = null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ((xn0) this.f36852o).a((vs1) message.obj);
        return true;
    }

    @Override // yads.ro
    public final void a(long j10, boolean z5) {
        this.f36860w = null;
        this.f36859v = -9223372036854775807L;
        this.f36856s = false;
        this.f36857t = false;
    }

    @Override // yads.ro
    public final void a(nx0[] nx0VarArr, long j10, long j11) {
        this.f36855r = ((ws1) this.f36851n).a(nx0VarArr[0]);
    }

    @Override // yads.ro
    public final void a(long j10, long j11) {
        boolean z5;
        do {
            z5 = false;
            if (!this.f36856s && this.f36860w == null) {
                this.f36854q.b();
                ox0 ox0Var = this.f42645c;
                ox0Var.f41758a = null;
                ox0Var.f41759b = null;
                int iA = a(ox0Var, this.f36854q, 0);
                if (iA == -4) {
                    if (this.f36854q.b(4)) {
                        this.f36856s = true;
                    } else {
                        ys1 ys1Var = this.f36854q;
                        ys1Var.f45148j = this.f36858u;
                        ys1Var.c();
                        gz2 gz2Var = this.f36855r;
                        int i = lb3.f40466a;
                        vs1 vs1VarA = gz2Var.a(this.f36854q);
                        if (vs1VarA != null) {
                            ArrayList arrayList = new ArrayList(vs1VarA.f44117b.length);
                            a(vs1VarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f36860w = new vs1(arrayList);
                                this.f36859v = this.f36854q.f42866f;
                            }
                        }
                    }
                } else if (iA == -5) {
                    nx0 nx0Var = ox0Var.f41759b;
                    nx0Var.getClass();
                    this.f36858u = nx0Var.f41379q;
                }
            }
            vs1 vs1Var = this.f36860w;
            if (vs1Var != null && this.f36859v <= j10) {
                Handler handler = this.f36853p;
                if (handler != null) {
                    handler.obtainMessage(0, vs1Var).sendToTarget();
                } else {
                    ((xn0) this.f36852o).a(vs1Var);
                }
                this.f36860w = null;
                this.f36859v = -9223372036854775807L;
                z5 = true;
            }
            if (this.f36856s && this.f36860w == null) {
                this.f36857t = true;
            }
        } while (z5);
    }

    @Override // yads.ro
    public final int a(nx0 nx0Var) {
        ((ws1) this.f36851n).getClass();
        String str = nx0Var.f41375m;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return ro.a(0, 0, 0);
        }
        return ro.a(nx0Var.F == 0 ? 4 : 2, 0, 0);
    }
}
