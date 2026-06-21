package yads;

import android.view.TextureView;
import java.util.HashSet;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class tp0 implements r52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tn0 f43399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn1 f43400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ti3 f43401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q52 f43402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ij3 f43403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rp0 f43404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qo0 f43405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q62 f43406h;
    public q62 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ff3 f43407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public nf3 f43408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f43409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f43411n;

    public tp0(ao0 ao0Var, nn1 nn1Var, ti3 ti3Var, q52 q52Var, ij3 ij3Var) {
        this.f43399a = ao0Var;
        this.f43400b = nn1Var;
        this.f43401c = ti3Var;
        this.f43402d = q52Var;
        this.f43403e = ij3Var;
        rp0 rp0Var = new rp0(this);
        this.f43404f = rp0Var;
        this.f43405g = new qo0(rp0Var);
        this.f43409l = new HashSet();
        ao0Var.a(rp0Var);
        ao0Var.a(ij3Var);
        a7.a(this);
    }

    public final void a(ff3 ff3Var) {
        if (this.f43410m) {
            return;
        }
        this.f43407j = ff3Var;
        nn1 nn1Var = this.f43400b;
        nn1Var.getClass();
        oc0 oc0Var = new oc0(nn1Var.f41299b, new pu2(((o53) ne.a().f39490a).a(), es2.a().a(nn1Var.f41299b)));
        nr nrVarA = cp0.a().a(nn1Var.f41299b);
        qr qrVar = new qr();
        qrVar.f42373a = nrVarA;
        qrVar.f42376d = oc0Var;
        ge0 ge0Var = new ge0(qrVar, new od0());
        nn1Var.f41298a.getClass();
        mo moVarA = ge0Var.a(hm1.a(ff3Var.getUrl()));
        ((ao0) this.f43399a).a(false);
        ((ao0) this.f43399a).a(moVarA);
        ((ao0) this.f43399a).m();
        qo0 qo0Var = this.f43405g;
        qo0Var.getClass();
        oo0 oo0Var = new oo0(qo0Var);
        ((bc2) qo0Var.f42358b).a(qo0.f42356c, oo0Var);
    }

    @Override // yads.r52
    public final long b() {
        return ((ao0) this.f43399a).j();
    }

    @Override // yads.r52
    public final void c() {
        if (!this.f43410m) {
            ((ao0) this.f43399a).a(true);
        }
        if (this.f43411n) {
            pauseAd();
        }
    }

    @Override // yads.r52
    public final void e() {
        if (this.f43410m) {
            return;
        }
        this.f43410m = true;
        this.f43411n = false;
        ((bc2) this.f43405g.f42358b).a();
        ((ao0) this.f43399a).a((TextureView) null);
        ij3 ij3Var = this.f43403e;
        ij3Var.f39567c = null;
        ij3Var.b();
        ((ao0) this.f43399a).d(this.f43404f);
        ((ao0) this.f43399a).d(this.f43403e);
        ((ao0) this.f43399a).n();
    }

    @Override // yads.r52
    public final boolean f() {
        return this.f43410m;
    }

    @Override // yads.lx0
    public final void g() {
        this.f43411n = true;
        pauseAd();
    }

    @Override // yads.r52
    public final long getAdPosition() {
        ao0 ao0Var = (ao0) this.f43399a;
        ao0Var.r();
        return lb3.b(ao0Var.a(ao0Var.Z));
    }

    @Override // yads.r52
    public final float getVolume() {
        ao0 ao0Var = (ao0) this.f43399a;
        ao0Var.r();
        return ao0Var.T;
    }

    @Override // yads.r52
    public final boolean isPlayingAd() {
        qo qoVar = (qo) this.f43399a;
        qoVar.getClass();
        ao0 ao0Var = (ao0) qoVar;
        ao0Var.r();
        if (ao0Var.Z.f38099e != 3) {
            return false;
        }
        ao0Var.r();
        if (!ao0Var.Z.f38105l) {
            return false;
        }
        ao0Var.r();
        return ao0Var.Z.f38106m == 0;
    }

    @Override // yads.r52
    public final void pauseAd() {
        if (this.f43410m) {
            return;
        }
        ((ao0) this.f43399a).a(false);
    }

    @Override // yads.r52
    public final void resumeAd() {
        if (this.f43410m || this.f43411n) {
            return;
        }
        ((ao0) this.f43399a).a(true);
    }

    @Override // yads.r52
    public final void setVolume(float f10) {
        if (this.f43410m) {
            return;
        }
        ((ao0) this.f43399a).a(f10);
        nf3 nf3Var = this.f43408k;
        ff3 ff3Var = this.f43407j;
        if (nf3Var == null || ff3Var == null) {
            return;
        }
        nf3Var.onVolumeChanged(f10);
    }

    @Override // yads.r52
    public final void a(q62 q62Var, q62 q62Var2) {
        this.f43406h = q62Var;
        this.i = q62Var2;
        Pair pair = q62Var2 != null ? new Pair(q62Var, q62Var2) : null;
        if (pair != null && this.f43409l.contains(pair)) {
            a(q62Var2);
        } else {
            a(q62Var);
        }
    }

    @Override // yads.r52
    public final void a(nf3 nf3Var) {
        this.f43408k = nf3Var;
    }

    @Override // yads.r52
    public final void a(TextureView textureView) {
        if (this.f43410m) {
            return;
        }
        ij3 ij3Var = this.f43403e;
        ij3Var.f39567c = textureView;
        ij3Var.b();
        ((ao0) this.f43399a).a(textureView);
    }

    @Override // yads.r52
    public final void a(nj3 nj3Var) {
        if (this.f43410m) {
            return;
        }
        ij3 ij3Var = this.f43403e;
        ij3Var.f39568d = nj3Var;
        ij3Var.b();
    }

    @Override // yads.r52
    public final void a() {
        if (this.f43410m) {
            return;
        }
        nf3 nf3Var = this.f43408k;
        ff3 ff3Var = this.f43407j;
        if (nf3Var != null && ff3Var != null) {
            nf3Var.e();
        }
        this.f43410m = true;
        this.f43411n = false;
        ((bc2) this.f43405g.f42358b).a();
        ((ao0) this.f43399a).a((TextureView) null);
        ij3 ij3Var = this.f43403e;
        ij3Var.f39567c = null;
        ij3Var.b();
        ((ao0) this.f43399a).d(this.f43404f);
        ((ao0) this.f43399a).d(this.f43403e);
        ((ao0) this.f43399a).n();
    }
}
