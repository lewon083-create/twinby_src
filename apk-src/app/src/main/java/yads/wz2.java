package yads;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wz2 implements rm1, ag1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u30 f44536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o30 f44537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u83 f44538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ae0 f44539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dn1 f44540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l73 f44541g;
    public final long i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nx0 f44544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f44545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f44547n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44548o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f44542h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hg1 f44543j = new hg1("SingleSampleMediaPeriod");

    public wz2(u30 u30Var, o30 o30Var, u83 u83Var, nx0 nx0Var, long j10, ae0 ae0Var, dn1 dn1Var, boolean z5) {
        this.f44536b = u30Var;
        this.f44537c = o30Var;
        this.f44538d = u83Var;
        this.f44544k = nx0Var;
        this.i = j10;
        this.f44539e = ae0Var;
        this.f44540f = dn1Var;
        this.f44545l = z5;
        this.f44541g = new l73(new k73(nx0Var));
    }

    @Override // yads.rm1
    public final long a(long j10, zw2 zw2Var) {
        return j10;
    }

    @Override // yads.ux2
    public final boolean continueLoading(long j10) {
        if (this.f44546m || this.f44543j.b() || this.f44543j.f39175c != null) {
            return false;
        }
        p30 p30VarCreateDataSource = this.f44537c.createDataSource();
        u83 u83Var = this.f44538d;
        if (u83Var != null) {
            p30VarCreateDataSource.a(u83Var);
        }
        this.f44543j.a(new vz2(p30VarCreateDataSource, this.f44536b), this, this.f44539e.a(1));
        dn1 dn1Var = this.f44540f;
        Uri uri = this.f44536b.f43533a;
        dn1Var.c(new xf1(), new jm1(1, -1, this.f44544k, 0, null, dn1Var.a(0L), dn1Var.a(this.i)));
        return true;
    }

    @Override // yads.ux2
    public final long getBufferedPositionUs() {
        return this.f44546m ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.ux2
    public final long getNextLoadPositionUs() {
        return (this.f44546m || this.f44543j.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.rm1
    public final l73 getTrackGroups() {
        return this.f44541g;
    }

    @Override // yads.ux2
    public final boolean isLoading() {
        return this.f44543j.b();
    }

    @Override // yads.rm1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.rm1
    public final long seekToUs(long j10) {
        for (int i = 0; i < this.f44542h.size(); i++) {
            uz2 uz2Var = (uz2) this.f44542h.get(i);
            if (uz2Var.f43810b == 2) {
                uz2Var.f43810b = 1;
            }
        }
        return j10;
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11, boolean z5) {
        Uri uri = ((vz2) dg1Var).f44238b.f43545c;
        xf1 xf1Var = new xf1();
        this.f44539e.getClass();
        dn1 dn1Var = this.f44540f;
        dn1Var.a(xf1Var, new jm1(1, -1, null, 0, null, dn1Var.a(0L), dn1Var.a(this.i)));
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11) {
        vz2 vz2Var = (vz2) dg1Var;
        this.f44548o = (int) vz2Var.f44238b.f43544b;
        byte[] bArr = vz2Var.f44239c;
        bArr.getClass();
        this.f44547n = bArr;
        this.f44546m = true;
        Uri uri = vz2Var.f44238b.f43545c;
        xf1 xf1Var = new xf1();
        this.f44539e.getClass();
        dn1 dn1Var = this.f44540f;
        dn1Var.b(xf1Var, new jm1(1, -1, this.f44544k, 0, null, dn1Var.a(0L), dn1Var.a(this.i)));
    }

    @Override // yads.rm1
    public final void maybeThrowPrepareError() {
    }

    @Override // yads.ux2
    public final void reevaluateBuffer(long j10) {
    }

    @Override // yads.ag1
    public final bg1 a(dg1 dg1Var, long j10, long j11, IOException iOException, int i) {
        long jMin;
        bg1 bg1Var;
        Uri uri = ((vz2) dg1Var).f44238b.f43545c;
        xf1 xf1Var = new xf1();
        int i10 = lb3.f40466a;
        this.f44539e.getClass();
        if ((iOException instanceof qb2) || (iOException instanceof FileNotFoundException) || (iOException instanceof q11) || (iOException instanceof gg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = q30.f42159c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof q30) && ((q30) cause).f42160b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z5 = jMin == -9223372036854775807L || i >= this.f44539e.a(1);
        if (this.f44545l && z5) {
            kh1.d("SingleSampleMediaPeriod", kh1.a("Loading failed, treating as end-of-stream.", iOException));
            this.f44546m = true;
            bg1Var = hg1.f39171d;
        } else if (jMin != -9223372036854775807L) {
            bg1Var = new bg1(0, jMin);
        } else {
            bg1Var = hg1.f39172e;
        }
        int i12 = bg1Var.f37011a;
        boolean z10 = i12 == 0 || i12 == 1;
        dn1 dn1Var = this.f44540f;
        dn1Var.a(xf1Var, new jm1(1, -1, this.f44544k, 0, null, dn1Var.a(0L), dn1Var.a(this.i)), iOException, !z10);
        if (!z10) {
            this.f44539e.getClass();
        }
        return bg1Var;
    }

    @Override // yads.rm1
    public final void discardBuffer(long j10, boolean z5) {
    }

    @Override // yads.rm1
    public final void a(qm1 qm1Var, long j10) {
        qm1Var.a((rm1) this);
    }

    @Override // yads.rm1
    public final long a(pp0[] pp0VarArr, boolean[] zArr, ps2[] ps2VarArr, boolean[] zArr2, long j10) {
        for (int i = 0; i < pp0VarArr.length; i++) {
            ps2 ps2Var = ps2VarArr[i];
            if (ps2Var != null && (pp0VarArr[i] == null || !zArr[i])) {
                this.f44542h.remove(ps2Var);
                ps2VarArr[i] = null;
            }
            if (ps2VarArr[i] == null && pp0VarArr[i] != null) {
                uz2 uz2Var = new uz2(this);
                this.f44542h.add(uz2Var);
                ps2VarArr[i] = uz2Var;
                zArr2[i] = true;
            }
        }
        return j10;
    }
}
