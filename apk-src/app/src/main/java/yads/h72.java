package yads;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h72 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi3 f39050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureView f39051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p52 f39052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l62 f39053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kj1 f39054e;

    public h72(Context context, hi3 hi3Var, TextureView textureView, p52 p52Var) {
        super(context);
        this.f39050a = hi3Var;
        this.f39051b = textureView;
        this.f39052c = p52Var;
        this.f39054e = new fz2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l62 l62Var = this.f39053d;
        if (l62Var != null) {
            d62 d62Var = (d62) l62Var;
            d62Var.f37645a.a(d62Var.f37646b.f39051b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l62 l62Var = this.f39053d;
        if (l62Var != null) {
            d62 d62Var = (d62) l62Var;
            d62Var.f37646b.f39050a.f39209a.clearAnimation();
            d62Var.f37645a.a((TextureView) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        jj1 jj1VarA = this.f39054e.a(i, i10);
        super.onMeasure(jj1VarA.f39877a, jj1VarA.f39878b);
    }

    public final void setAspectRatio(float f10) {
        this.f39054e = new qk2(f10);
    }

    public final void setOnAttachStateChangeListener(@Nullable l62 l62Var) {
        this.f39053d = l62Var;
    }
}
