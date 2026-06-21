package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e51 extends kk3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x31 f38016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a51 f38017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m13 f38018e;

    public e51(ImageView imageView, x31 x31Var, a51 a51Var, m13 m13Var) {
        super(imageView);
        this.f38016c = x31Var;
        this.f38017d = a51Var;
        this.f38018e = m13Var;
    }

    @Override // yads.kk3
    public final void a(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        this.f38018e.a(imageView);
        imageView.setVisibility(8);
        imageView.setOnClickListener(null);
        imageView.setOnTouchListener(null);
        imageView.setSelected(false);
    }

    @Override // yads.kk3
    public final void b(View view, Object obj) {
        a((w41) obj);
    }

    public /* synthetic */ e51(ImageView imageView, oi2 oi2Var, v9 v9Var) {
        this(imageView, new x31(imageView.getContext(), new u32(v9Var), oi2Var), new a51(oi2Var), new m13());
    }

    @Override // yads.kk3
    public final boolean a(View view, Object obj) {
        eq xj0Var;
        w41 w41Var = (w41) obj;
        a51 a51Var = this.f38017d;
        Drawable drawable = ((ImageView) view).getDrawable();
        Bitmap bitmapA = a51Var.f36634a.a(w41Var);
        if (bitmapA == null) {
            oi2 oi2Var = a51Var.f36634a;
            oi2Var.getClass();
            String str = w41Var.f44279g;
            ni2 ni2Var = str != null ? new ni2(str, new b03(w41Var.f44273a, w41Var.f44274b)) : null;
            bitmapA = ni2Var != null ? (Bitmap) oi2Var.f41548c.get(ni2Var) : null;
        }
        if (drawable == null || bitmapA == null) {
            return false;
        }
        a51Var.f36635b.getClass();
        if (drawable instanceof BitmapDrawable) {
            xj0Var = new gq();
        } else {
            xj0Var = new xj0(new qs2(), new iq());
        }
        return xj0Var.a(drawable, bitmapA);
    }

    public final void a(w41 w41Var) {
        this.f38016c.a(w41Var, new oi.i(28, this, w41Var));
    }

    public static final void a(e51 e51Var, w41 w41Var, Drawable drawable) {
        ImageView imageView;
        if (drawable == null || (imageView = (ImageView) e51Var.b()) == null) {
            return;
        }
        if (w41Var.f44277e != null) {
            e51Var.f38018e.a(drawable, imageView, w41Var);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }
}
