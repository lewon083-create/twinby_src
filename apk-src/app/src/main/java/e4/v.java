package e4;

import android.net.Uri;
import com.google.android.gms.internal.measurement.j4;
import i4.f1;
import j3.o0;
import java.util.ArrayList;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends i4.a {
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f16202j = "AndroidXMedia3/1.9.2";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f16203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SocketFactory f16204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j3.x f16209q;

    static {
        j3.y.a("media3.exoplayer.rtsp");
    }

    public v(j3.x xVar, c cVar, SocketFactory socketFactory) {
        this.f16209q = xVar;
        this.i = cVar;
        j3.u uVar = xVar.f26407b;
        uVar.getClass();
        Uri uri = uVar.f26396a;
        String scheme = uri.getScheme();
        if (scheme != null && j4.n("rtspt", scheme)) {
            uri = Uri.parse("rtsp" + uri.toString().substring(5));
        }
        this.f16203k = uri;
        this.f16204l = socketFactory;
        this.f16205m = -9223372036854775807L;
        this.f16208p = true;
    }

    @Override // i4.a
    public final i4.a0 b(i4.c0 c0Var, bb.e eVar, long j10) {
        return new s(eVar, this.i, this.f16203k, new a7.l(14, this), this.f16202j, this.f16204l);
    }

    @Override // i4.a
    public final synchronized j3.x j() {
        return this.f16209q;
    }

    @Override // i4.a
    public final void p(p3.e0 e0Var) {
        x();
    }

    @Override // i4.a
    public final void r(i4.a0 a0Var) {
        s sVar = (s) a0Var;
        ArrayList arrayList = sVar.f16184f;
        for (int i = 0; i < arrayList.size(); i++) {
            r rVar = (r) arrayList.get(i);
            if (!rVar.f16178e) {
                rVar.f16175b.e(null);
                rVar.f16176c.D();
                rVar.f16178e = true;
            }
        }
        m3.z.h(sVar.f16183e);
        sVar.f16196s = true;
    }

    @Override // i4.a
    public final synchronized void w(j3.x xVar) {
        this.f16209q = xVar;
    }

    public final void x() {
        o0 f1Var = new f1(this.f16205m, this.f16206n, this.f16207o, j());
        if (this.f16208p) {
            f1Var = new t(f1Var, 0);
        }
        q(f1Var);
    }

    @Override // i4.a
    public final void l() {
    }

    @Override // i4.a
    public final void t() {
    }
}
