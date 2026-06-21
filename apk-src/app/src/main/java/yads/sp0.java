package yads;

import android.net.Uri;
import android.view.TextureView;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sp0 implements r52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3.l f43022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mn1 f43023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ti3 f43024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q52 f43025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hj3 f43026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qp0 f43027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final po0 f43028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q62 f43029h;
    public q62 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ff3 f43030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public nf3 f43031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f43032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f43034n;

    public sp0(s3.l lVar, mn1 mn1Var, ti3 ti3Var, q52 q52Var, hj3 hj3Var) {
        this.f43022a = lVar;
        this.f43023b = mn1Var;
        this.f43024c = ti3Var;
        this.f43025d = q52Var;
        this.f43026e = hj3Var;
        qp0 qp0Var = new qp0(this);
        this.f43027f = qp0Var;
        this.f43028g = new po0(qp0Var);
        this.f43032l = new HashSet();
        s3.y yVar = (s3.y) lVar;
        yVar.f32708n.a(qp0Var);
        com.google.android.gms.internal.ads.yf0 yf0Var = yVar.f32708n;
        hj3Var.getClass();
        yf0Var.a(hj3Var);
        z6.a(this);
    }

    public final void a(ff3 ff3Var) {
        if (this.f43033m) {
            return;
        }
        this.f43030j = ff3Var;
        mn1 mn1Var = this.f43023b;
        mn1Var.getClass();
        l6.i iVar = new l6.i(mn1Var.f40971b, new ou2(((o53) ne.a().f39490a).a(), es2.a().a(mn1Var.f40971b)));
        q3.b bVarA = bp0.a().a(mn1Var.f40971b);
        ka.k kVar = new ka.k(24);
        kVar.f27325d = new p3.q();
        kVar.f27324c = bVarA;
        kVar.f27326e = iVar;
        i4.q qVar = new i4.q(kVar);
        mn1Var.f40970a.getClass();
        String url = ff3Var.getUrl();
        int i = j3.x.f26405g;
        com.google.android.gms.internal.ads.e2 e2Var = new com.google.android.gms.internal.ads.e2();
        ad.h0 h0Var = ad.j0.f818c;
        ad.b1 b1Var = ad.b1.f768f;
        List list = Collections.EMPTY_LIST;
        ad.b1 b1Var2 = ad.b1.f768f;
        j3.s sVar = new j3.s();
        j3.v vVar = j3.v.f26403a;
        Uri uri = url == null ? null : Uri.parse(url);
        i4.a aVarD = qVar.d(new j3.x("", new j3.r(e2Var), uri != null ? new j3.u(uri, null, null, list, b1Var2, -9223372036854775807L) : null, new j3.t(sVar), j3.z.B, vVar));
        ((s3.y) this.f43022a).d0(false);
        s3.y yVar = (s3.y) this.f43022a;
        yVar.n0();
        List listSingletonList = Collections.singletonList(aVarD);
        yVar.n0();
        yVar.c0(listSingletonList);
        ((s3.y) this.f43022a).X();
        po0 po0Var = this.f43028g;
        po0Var.getClass();
        ((bc2) po0Var.f41973b).a(po0.f41971c, new no0(po0Var));
    }

    @Override // yads.r52
    public final long b() {
        return ((s3.y) this.f43022a).O();
    }

    @Override // yads.r52
    public final void c() {
        if (!this.f43033m) {
            ((s3.y) this.f43022a).d0(true);
        }
        if (this.f43034n) {
            pauseAd();
        }
    }

    @Override // yads.r52
    public final void e() {
        if (this.f43033m) {
            return;
        }
        this.f43033m = true;
        this.f43034n = false;
        ((bc2) this.f43028g.f41973b).a();
        ((s3.y) this.f43022a).g0(null);
        hj3 hj3Var = this.f43026e;
        hj3Var.f39224c = null;
        hj3Var.b();
        ((s3.y) this.f43022a).Z(this.f43027f);
        ((s3.y) this.f43022a).Z(this.f43026e);
        ((s3.y) this.f43022a).Y();
    }

    @Override // yads.r52
    public final boolean f() {
        return this.f43033m;
    }

    @Override // yads.lx0
    public final void g() {
        this.f43034n = true;
        pauseAd();
    }

    @Override // yads.r52
    public final long getAdPosition() {
        return ((s3.y) this.f43022a).K();
    }

    @Override // yads.r52
    public final float getVolume() {
        s3.y yVar = (s3.y) this.f43022a;
        yVar.n0();
        return yVar.f32688b0;
    }

    @Override // yads.r52
    public final boolean isPlayingAd() {
        return ((e1.d0) this.f43022a).u();
    }

    @Override // yads.r52
    public final void pauseAd() {
        if (this.f43033m) {
            return;
        }
        ((s3.y) this.f43022a).d0(false);
    }

    @Override // yads.r52
    public final void resumeAd() {
        if (this.f43033m || this.f43034n) {
            return;
        }
        ((s3.y) this.f43022a).d0(true);
    }

    @Override // yads.r52
    public final void setVolume(float f10) {
        if (this.f43033m) {
            return;
        }
        ((s3.y) this.f43022a).h0(f10);
        nf3 nf3Var = this.f43031k;
        ff3 ff3Var = this.f43030j;
        if (nf3Var == null || ff3Var == null) {
            return;
        }
        nf3Var.onVolumeChanged(f10);
    }

    @Override // yads.r52
    public final void a(q62 q62Var, q62 q62Var2) {
        this.f43029h = q62Var;
        this.i = q62Var2;
        Pair pair = q62Var2 != null ? new Pair(q62Var, q62Var2) : null;
        if (pair != null && this.f43032l.contains(pair)) {
            a(q62Var2);
        } else {
            a(q62Var);
        }
    }

    @Override // yads.r52
    public final void a(nf3 nf3Var) {
        this.f43031k = nf3Var;
    }

    @Override // yads.r52
    public final void a(TextureView textureView) {
        if (this.f43033m) {
            return;
        }
        hj3 hj3Var = this.f43026e;
        hj3Var.f39224c = textureView;
        hj3Var.b();
        ((s3.y) this.f43022a).g0(textureView);
    }

    @Override // yads.r52
    public final void a(nj3 nj3Var) {
        if (this.f43033m) {
            return;
        }
        hj3 hj3Var = this.f43026e;
        hj3Var.f39225d = nj3Var;
        hj3Var.b();
    }

    @Override // yads.r52
    public final void a() {
        if (this.f43033m) {
            return;
        }
        nf3 nf3Var = this.f43031k;
        ff3 ff3Var = this.f43030j;
        if (nf3Var != null && ff3Var != null) {
            nf3Var.e();
        }
        this.f43033m = true;
        this.f43034n = false;
        ((bc2) this.f43028g.f41973b).a();
        ((s3.y) this.f43022a).g0(null);
        hj3 hj3Var = this.f43026e;
        hj3Var.f39224c = null;
        hj3Var.b();
        ((s3.y) this.f43022a).Z(this.f43027f);
        ((s3.y) this.f43022a).Z(this.f43026e);
        ((s3.y) this.f43022a).Y();
    }
}
