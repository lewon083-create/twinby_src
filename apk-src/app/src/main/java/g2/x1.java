package g2;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f19942b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f19943a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f19942b = r1.f19914w;
        } else if (i >= 30) {
            f19942b = p1.f19910v;
        } else {
            f19942b = t1.f19924b;
        }
    }

    public x1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f19943a = new s1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f19943a = new r1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f19943a = new q1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f19943a = new p1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f19943a = new o1(this, windowInsets);
        } else if (i >= 28) {
            this.f19943a = new m1(this, windowInsets);
        } else {
            this.f19943a = new l1(this, windowInsets);
        }
    }

    public static x1.b e(x1.b bVar, int i, int i10, int i11, int i12) {
        int iMax = Math.max(0, bVar.f35689a - i);
        int iMax2 = Math.max(0, bVar.f35690b - i10);
        int iMax3 = Math.max(0, bVar.f35691c - i11);
        int iMax4 = Math.max(0, bVar.f35692d - i12);
        return (iMax == i && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? bVar : x1.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static x1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        x1 x1Var = new x1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = n0.f19900a;
            x1 x1VarA = g0.a(view);
            t1 t1Var = x1Var.f19943a;
            t1Var.v(x1VarA);
            View rootView = view.getRootView();
            t1Var.d(rootView);
            t1Var.n(rootView);
            t1Var.o();
            t1Var.x(view.getWindowSystemUiVisibility());
        }
        return x1Var;
    }

    public final int a() {
        return this.f19943a.l().f35692d;
    }

    public final int b() {
        return this.f19943a.l().f35689a;
    }

    public final int c() {
        return this.f19943a.l().f35691c;
    }

    public final int d() {
        return this.f19943a.l().f35690b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1) {
            return Objects.equals(this.f19943a, ((x1) obj).f19943a);
        }
        return false;
    }

    public final WindowInsets f() {
        t1 t1Var = this.f19943a;
        if (t1Var instanceof k1) {
            return ((k1) t1Var).f19878c;
        }
        return null;
    }

    public final int hashCode() {
        t1 t1Var = this.f19943a;
        if (t1Var == null) {
            return 0;
        }
        return t1Var.hashCode();
    }

    public x1() {
        this.f19943a = new t1(this);
    }
}
