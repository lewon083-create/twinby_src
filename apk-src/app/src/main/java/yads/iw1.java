package yads;

import android.content.Context;
import android.util.AttributeSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iw1 extends jb2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zv1 f39654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public io3 f39655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mw1 f39656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public kj1 f39657o;

    public /* synthetic */ iw1(Context context, wn3 wn3Var, int i) {
        this(context, (i & 2) != 0 ? new wn3() : wn3Var, (AttributeSet) null);
    }

    public final void a(String str, hw1 hw1Var) {
        if (this.f39655m instanceof ho3) {
            this.f39655m = new go3(hw1Var);
            mw1 mw1Var = this.f39656n;
            mw1Var.f41050e.getClass();
            boolean zFind = wv1.f44493a.matcher(str).find();
            mw1Var.f41051f.getClass();
            k11 aw1Var = zFind ? new aw1() : new go();
            iw1 iw1Var = mw1Var.f41046a;
            oh3 oh3Var = mw1Var.f41048c;
            zv1 zv1Var = mw1Var.f41047b;
            aw1Var.a(iw1Var, mw1Var, oh3Var, zv1Var, zv1Var, zv1Var).a(str);
        }
    }

    @Override // yads.jb2
    public final void e() {
        this.f39656n.f41049d.a(kotlin.collections.j0.d());
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        jj1 jj1VarA = this.f39657o.a(i, i10);
        super.onMeasure(jj1VarA.f39877a, jj1VarA.f39878b);
    }

    public final void setAspectRatio(float f10) {
        this.f39657o = new qk2(f10);
    }

    public final void setClickListener(@NotNull ev evVar) {
        this.f39656n.f41053h = evVar;
    }

    public final void setPreloadingState(@NotNull io3 io3Var) {
        this.f39655m = io3Var;
    }

    public iw1(Context context, wn3 wn3Var, AttributeSet attributeSet) {
        super(context, wn3Var, attributeSet, 56);
        zv1 zv1Var = new zv1();
        this.f39654l = zv1Var;
        this.f39655m = ho3.f39288a;
        this.f39656n = new mw1(this, zv1Var);
        this.f39657o = new fz2();
    }

    @Override // yads.jb2, yads.n11
    public final void a() {
        super.a();
        io3 io3Var = this.f39655m;
        go3 go3Var = io3Var instanceof go3 ? (go3) io3Var : null;
        if (go3Var != null) {
            hw1 hw1Var = go3Var.f38841a;
            if (hw1Var != null) {
                hw1Var.b();
            }
            this.f39655m = fo3.f38523a;
        }
    }

    @Override // yads.jb2, yads.n11
    public final void a(int i) {
        super.a(i);
        io3 io3Var = this.f39655m;
        go3 go3Var = io3Var instanceof go3 ? (go3) io3Var : null;
        if (go3Var != null) {
            hw1 hw1Var = go3Var.f38841a;
            if (hw1Var != null) {
                hw1Var.a();
            }
            stopLoading();
            this.f39655m = ho3.f39288a;
        }
    }
}
