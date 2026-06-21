package a4;

import android.graphics.Bitmap;
import android.os.Trace;
import com.google.android.gms.internal.measurement.h5;
import j3.o;
import java.util.ArrayDeque;
import s3.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends s3.a {
    public long A;
    public int B;
    public int C;
    public o D;
    public c E;
    public r3.e F;
    public e G;
    public Bitmap H;
    public boolean I;
    public g J;
    public g K;
    public int L;
    public boolean M;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r3.e f434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque f435v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f438y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f439z;

    public h(b bVar) {
        super(4);
        this.f433t = bVar;
        this.G = e.f425a;
        this.f434u = new r3.e(0);
        this.f438y = f.f426c;
        this.f435v = new ArrayDeque();
        this.A = -9223372036854775807L;
        this.f439z = -9223372036854775807L;
        this.B = 0;
        this.C = 1;
    }

    @Override // s3.a
    public final int B(o oVar) {
        this.f433t.getClass();
        return b.b(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(long r13) throws s3.i {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.h.E(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(long r13) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.h.F(long):boolean");
    }

    public final void G() throws i {
        if (this.M) {
            o oVar = this.D;
            oVar.getClass();
            b bVar = this.f433t;
            bVar.getClass();
            int iB = b.b(oVar);
            if (iB != s3.a.b(4, 0, 0, 0) && iB != s3.a.b(3, 0, 0, 0)) {
                throw d(new d("Provided decoder factory can't create decoder for format."), this.D, false, 4005);
            }
            c cVar = this.E;
            if (cVar != null) {
                cVar.release();
            }
            this.E = new c(bVar.f422b);
            this.M = false;
        }
    }

    public final void H() {
        this.F = null;
        this.B = 0;
        this.A = -9223372036854775807L;
        c cVar = this.E;
        if (cVar != null) {
            cVar.release();
            this.E = null;
        }
    }

    @Override // s3.a, s3.w0
    public final void handleMessage(int i, Object obj) {
        if (i != 15) {
            return;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar == null) {
            eVar = e.f425a;
        }
        this.G = eVar;
    }

    @Override // s3.a
    public final String i() {
        return "ImageRenderer";
    }

    @Override // s3.a
    public final boolean k() {
        return this.f437x;
    }

    @Override // s3.a
    public final boolean m() {
        int i = this.C;
        if (i != 3) {
            return i == 0 && this.I;
        }
        return true;
    }

    @Override // s3.a
    public final void n() {
        this.D = null;
        this.f438y = f.f426c;
        this.f435v.clear();
        H();
        this.G.getClass();
    }

    @Override // s3.a
    public final void o(boolean z5, boolean z10) {
        this.C = z10 ? 1 : 0;
    }

    @Override // s3.a
    public final void p(long j10, boolean z5, boolean z10) {
        this.C = Math.min(this.C, 1);
        this.f437x = false;
        this.f436w = false;
        this.H = null;
        this.J = null;
        this.K = null;
        this.I = false;
        this.F = null;
        c cVar = this.E;
        if (cVar != null) {
            cVar.flush();
        }
        this.f435v.clear();
    }

    @Override // s3.a
    public final void q() {
        H();
    }

    @Override // s3.a
    public final void r() {
        H();
        this.C = Math.min(this.C, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(j3.o[] r5, long r6, long r8, i4.c0 r10) {
        /*
            r4 = this;
            a4.f r5 = r4.f438y
            long r5 = r5.f428b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f435v
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.A
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f439z
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            a4.f r6 = new a4.f
            long r0 = r4.A
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            a4.f r5 = new a4.f
            r5.<init>(r0, r8)
            r4.f438y = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.h.u(j3.o[], long, long, i4.c0):void");
    }

    @Override // s3.a
    public final void x(long j10, long j11) throws i {
        if (this.f437x) {
            return;
        }
        if (this.D == null) {
            r3.b bVar = this.f32432d;
            bVar.r();
            r3.e eVar = this.f434u;
            eVar.r();
            int iW = w(bVar, eVar, 2);
            if (iW != -5) {
                if (iW == -4) {
                    h5.r(eVar.c(4));
                    this.f436w = true;
                    this.f437x = true;
                    return;
                }
                return;
            }
            o oVar = (o) bVar.f32189d;
            oVar.getClass();
            this.D = oVar;
            this.M = true;
        }
        if (this.E == null) {
            G();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (E(j10)) {
            }
            while (F(j10)) {
            }
            Trace.endSection();
        } catch (d e3) {
            throw d(e3, null, false, 4003);
        }
    }
}
