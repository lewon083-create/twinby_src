package yads;

import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qp0 implements j3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp0 f42366d;

    public qp0(sp0 sp0Var) {
        this.f42366d = sp0Var;
    }

    @Override // j3.h0
    public final void onIsPlayingChanged(boolean z5) {
        if (!z5) {
            if (this.f42364b) {
                return;
            }
            this.f42365c = true;
            sp0 sp0Var = this.f42366d;
            nf3 nf3Var = sp0Var.f43031k;
            ff3 ff3Var = sp0Var.f43030j;
            if (nf3Var == null || ff3Var == null) {
                return;
            }
            nf3Var.i();
            return;
        }
        if (!this.f42363a) {
            sp0 sp0Var2 = this.f42366d;
            nf3 nf3Var2 = sp0Var2.f43031k;
            ff3 ff3Var2 = sp0Var2.f43030j;
            if (nf3Var2 == null || ff3Var2 == null) {
                return;
            }
            this.f42363a = true;
            nf3Var2.c();
            return;
        }
        if (this.f42365c) {
            this.f42365c = false;
            sp0 sp0Var3 = this.f42366d;
            nf3 nf3Var3 = sp0Var3.f43031k;
            ff3 ff3Var3 = sp0Var3.f43030j;
            if (nf3Var3 == null || ff3Var3 == null) {
                return;
            }
            nf3Var3.f();
        }
    }

    @Override // j3.h0
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            this.f42364b = true;
            sp0 sp0Var = this.f42366d;
            nf3 nf3Var = sp0Var.f43031k;
            ff3 ff3Var = sp0Var.f43030j;
            if (nf3Var == null || ff3Var == null) {
                return;
            }
            nf3Var.b();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.f42363a = false;
            sp0 sp0Var2 = this.f42366d;
            nf3 nf3Var2 = sp0Var2.f43031k;
            ff3 ff3Var2 = sp0Var2.f43030j;
            if (nf3Var2 == null || ff3Var2 == null) {
                return;
            }
            nf3Var2.d();
            return;
        }
        ((bc2) this.f42366d.f43028g.f41973b).a();
        sp0 sp0Var3 = this.f42366d;
        nf3 nf3Var3 = sp0Var3.f43031k;
        ff3 ff3Var3 = sp0Var3.f43030j;
        if (nf3Var3 != null && ff3Var3 != null) {
            nf3Var3.h();
        }
        if (this.f42364b) {
            this.f42364b = false;
            sp0 sp0Var4 = this.f42366d;
            nf3 nf3Var4 = sp0Var4.f43031k;
            ff3 ff3Var4 = sp0Var4.f43030j;
            if (nf3Var4 == null || ff3Var4 == null) {
                return;
            }
            nf3Var4.a();
        }
    }

    @Override // j3.h0
    public final void onPlayerError(j3.e0 e0Var) {
        sp0 sp0Var = this.f42366d;
        q62 q62Var = sp0Var.f43029h;
        q62 q62Var2 = sp0Var.i;
        Pair pair = (q62Var == null || q62Var2 == null) ? null : new Pair(q62Var, q62Var2);
        if (pair != null && !sp0Var.f43032l.contains(pair)) {
            this.f42366d.f43032l.add(pair);
            this.f42366d.a((ff3) pair.f27470c);
            return;
        }
        this.f42363a = false;
        ((bc2) this.f42366d.f43028g.f41973b).a();
        s3.y yVar = (s3.y) this.f42366d.f43022a;
        yVar.n0();
        yVar.i0(null);
        ad.b1 b1Var = ad.b1.f768f;
        long j10 = yVar.f32702j0.f32674s;
        new l3.c(b1Var);
        String message = e0Var.getMessage();
        ti3 ti3Var = this.f42366d.f43024c;
        ho2 ho2VarA = ti3Var.f43333b.a();
        ho2VarA.b(message, "error_message");
        ti3Var.f43332a.a(new go2(eo2.f38202l.a(), kotlin.collections.j0.m(ho2VarA.f39286a), ho2VarA.f39287b));
        sp0 sp0Var2 = this.f42366d;
        nf3 nf3Var = sp0Var2.f43031k;
        ff3 ff3Var = sp0Var2.f43030j;
        if (nf3Var == null || ff3Var == null) {
            return;
        }
        sp0Var2.f43025d.getClass();
        nf3Var.a(new mf3(q52.a(e0Var), e0Var));
    }
}
