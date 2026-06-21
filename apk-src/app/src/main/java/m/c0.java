package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends w1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f28170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f28171h;

    public c0(h0 h0Var, int i, int i10, WeakReference weakReference) {
        this.f28171h = h0Var;
        this.f28168e = i;
        this.f28169f = i10;
        this.f28170g = weakReference;
    }

    @Override // w1.b
    public final void f(Typeface typeface) {
        int i;
        int i10 = 2;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f28168e) != -1) {
            typeface = g0.a(typeface, i, (this.f28169f & 2) != 0);
        }
        h0 h0Var = this.f28171h;
        if (h0Var.f28235m) {
            h0Var.f28234l = typeface;
            TextView textView = (TextView) this.f28170g.get();
            if (textView != null) {
                Field field = g2.n0.f19900a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new ac.a(textView, typeface, h0Var.f28232j, i10));
                } else {
                    textView.setTypeface(typeface, h0Var.f28232j);
                }
            }
        }
    }

    @Override // w1.b
    public final void e(int i) {
    }
}
