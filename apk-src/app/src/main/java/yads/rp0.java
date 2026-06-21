package yads;

import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rp0 implements oe2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tp0 f42683d;

    public rp0(tp0 tp0Var) {
        this.f42683d = tp0Var;
    }

    @Override // yads.oe2
    public final void a(qn0 qn0Var) {
        tp0 tp0Var = this.f42683d;
        q62 q62Var = tp0Var.f43406h;
        q62 q62Var2 = tp0Var.i;
        Pair pair = (q62Var == null || q62Var2 == null) ? null : new Pair(q62Var, q62Var2);
        if (pair != null && !tp0Var.f43409l.contains(pair)) {
            this.f42683d.f43409l.add(pair);
            this.f42683d.a((ff3) pair.f27470c);
            return;
        }
        this.f42680a = false;
        ((bc2) this.f42683d.f43405g.f42358b).a();
        ao0 ao0Var = (ao0) this.f42683d.f43399a;
        ao0Var.r();
        ao0Var.r();
        yk ykVar = ao0Var.f36816v;
        ao0Var.r();
        ykVar.a(ao0Var.Z.f38105l, 1);
        ao0Var.a((qn0) null);
        int i = q20.f42140b;
        String message = qn0Var.getMessage();
        ti3 ti3Var = this.f42683d.f43401c;
        ho2 ho2VarA = ti3Var.f43333b.a();
        ho2VarA.b(message, "error_message");
        ti3Var.f43332a.a(new go2(eo2.f38202l.a(), kotlin.collections.j0.m(ho2VarA.f39286a), ho2VarA.f39287b));
        tp0 tp0Var2 = this.f42683d;
        nf3 nf3Var = tp0Var2.f43408k;
        ff3 ff3Var = tp0Var2.f43407j;
        if (nf3Var == null || ff3Var == null) {
            return;
        }
        tp0Var2.f43402d.getClass();
        nf3Var.a(new mf3(q52.a(qn0Var), qn0Var));
    }

    @Override // yads.oe2
    public final void onIsPlayingChanged(boolean z5) {
        if (!z5) {
            if (this.f42681b) {
                return;
            }
            this.f42682c = true;
            tp0 tp0Var = this.f42683d;
            nf3 nf3Var = tp0Var.f43408k;
            ff3 ff3Var = tp0Var.f43407j;
            if (nf3Var == null || ff3Var == null) {
                return;
            }
            nf3Var.i();
            return;
        }
        if (!this.f42680a) {
            tp0 tp0Var2 = this.f42683d;
            nf3 nf3Var2 = tp0Var2.f43408k;
            ff3 ff3Var2 = tp0Var2.f43407j;
            if (nf3Var2 == null || ff3Var2 == null) {
                return;
            }
            this.f42680a = true;
            nf3Var2.c();
            return;
        }
        if (this.f42682c) {
            this.f42682c = false;
            tp0 tp0Var3 = this.f42683d;
            nf3 nf3Var3 = tp0Var3.f43408k;
            ff3 ff3Var3 = tp0Var3.f43407j;
            if (nf3Var3 == null || ff3Var3 == null) {
                return;
            }
            nf3Var3.f();
        }
    }

    @Override // yads.oe2
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            this.f42681b = true;
            tp0 tp0Var = this.f42683d;
            nf3 nf3Var = tp0Var.f43408k;
            ff3 ff3Var = tp0Var.f43407j;
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
            this.f42680a = false;
            tp0 tp0Var2 = this.f42683d;
            nf3 nf3Var2 = tp0Var2.f43408k;
            ff3 ff3Var2 = tp0Var2.f43407j;
            if (nf3Var2 == null || ff3Var2 == null) {
                return;
            }
            nf3Var2.d();
            return;
        }
        ((bc2) this.f42683d.f43405g.f42358b).a();
        tp0 tp0Var3 = this.f42683d;
        nf3 nf3Var3 = tp0Var3.f43408k;
        ff3 ff3Var3 = tp0Var3.f43407j;
        if (nf3Var3 != null && ff3Var3 != null) {
            nf3Var3.h();
        }
        if (this.f42681b) {
            this.f42681b = false;
            tp0 tp0Var4 = this.f42683d;
            nf3 nf3Var4 = tp0Var4.f43408k;
            ff3 ff3Var4 = tp0Var4.f43407j;
            if (nf3Var4 == null || ff3Var4 == null) {
                return;
            }
            nf3Var4.a();
        }
    }
}
