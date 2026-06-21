package g2;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.internal.measurement.b4;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 extends t1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f19873m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Method f19874n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Class f19875o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Field f19876p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Field f19877q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f19878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1.b[] f19879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x1.b f19880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x1 f19881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x1.b f19882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19883h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect[][] f19885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect[][] f19886l;

    public k1(x1 x1Var, WindowInsets windowInsets) {
        super(x1Var);
        this.f19880e = null;
        this.f19885k = new Rect[10][];
        this.f19886l = new Rect[10][];
        this.f19878c = windowInsets;
    }

    private j A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f19925a.f19943a.r()) {
            return j.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        t tVarK = a0.e.k(display, 0);
        t tVarK2 = a0.e.k(display, 1);
        t tVarK3 = a0.e.k(display, 2);
        t tVarK4 = a0.e.k(display, 3);
        return j.a(point.x, point.y, false, tVarK != null ? tVarK.f19922b : 0, tVarK2 != null ? tVarK2.f19922b : 0, tVarK3 != null ? tVarK3.f19922b : 0, tVarK4 != null ? tVarK4.f19922b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i & i10) != 0 && (rectArr2 = rectArr[b4.C(i10)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] C(x1.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i = bVar.f35689a;
        int i10 = bVar.f35692d;
        int i11 = bVar.f35691c;
        int i12 = bVar.f35690b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, bVar.f35689a, this.i));
        }
        if (i12 != 0) {
            arrayList.add(new Rect(0, 0, this.f19884j, i12));
        }
        if (i11 != 0) {
            int i13 = this.f19884j;
            arrayList.add(new Rect(i13 - i11, 0, i13, this.i));
        }
        if (i10 != 0) {
            int i14 = this.i;
            arrayList.add(new Rect(0, i14 - i10, this.f19884j, i14));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private x1.b D(int i, boolean z5) {
        x1.b bVarA = x1.b.f35688e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i & i10) != 0) {
                bVarA = x1.b.a(bVarA, E(i10, z5));
            }
        }
        return bVarA;
    }

    private x1.b G() {
        x1 x1Var = this.f19881f;
        return x1Var != null ? x1Var.f19943a.j() : x1.b.f35688e;
    }

    private x1.b H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f19873m) {
            J();
        }
        Method method = f19874n;
        if (method != null && f19875o != null && f19876p != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f19876p.get(f19877q.get(objInvoke));
                if (rect != null) {
                    return x1.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    private static void J() {
        try {
            f19874n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f19875o = cls;
            f19876p = cls.getDeclaredField("mVisibleInsets");
            f19877q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f19876p.setAccessible(true);
            f19877q.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f19873m = true;
    }

    public static boolean L(int i, int i10) {
        return (i & 6) == (i10 & 6);
    }

    public x1.b E(int i, boolean z5) {
        x1.b bVarJ;
        int i10;
        x1.b bVar = x1.b.f35688e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    x1.b[] bVarArr = this.f19879d;
                    bVarJ = bVarArr != null ? bVarArr[b4.C(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    x1.b bVarL = l();
                    x1.b bVarG = G();
                    int i11 = bVarL.f35692d;
                    if (i11 > bVarG.f35692d) {
                        return x1.b.b(0, 0, 0, i11);
                    }
                    x1.b bVar2 = this.f19882g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i10 = this.f19882g.f35692d) > bVarG.f35692d) {
                        return x1.b.b(0, 0, 0, i10);
                    }
                } else {
                    if (i == 16) {
                        return k();
                    }
                    if (i == 32) {
                        return i();
                    }
                    if (i == 64) {
                        return m();
                    }
                    if (i == 128) {
                        x1 x1Var = this.f19881f;
                        h hVarG = x1Var != null ? x1Var.f19943a.g() : g();
                        if (hVarG != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return x1.b.b(i12 >= 28 ? c2.f.i(hVarG.f19864a) : 0, i12 >= 28 ? c2.f.k(hVarG.f19864a) : 0, i12 >= 28 ? c2.f.j(hVarG.f19864a) : 0, i12 >= 28 ? c2.f.h(hVarG.f19864a) : 0);
                        }
                    }
                }
            } else {
                if (z5) {
                    x1.b bVarG2 = G();
                    x1.b bVarJ2 = j();
                    return x1.b.b(Math.max(bVarG2.f35689a, bVarJ2.f35689a), 0, Math.max(bVarG2.f35691c, bVarJ2.f35691c), Math.max(bVarG2.f35692d, bVarJ2.f35692d));
                }
                if ((this.f19883h & 2) == 0) {
                    x1.b bVarL2 = l();
                    x1 x1Var2 = this.f19881f;
                    bVarJ = x1Var2 != null ? x1Var2.f19943a.j() : null;
                    int iMin = bVarL2.f35692d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f35692d);
                    }
                    return x1.b.b(bVarL2.f35689a, 0, bVarL2.f35691c, iMin);
                }
            }
        } else {
            if (z5) {
                return x1.b.b(0, Math.max(G().f35690b, l().f35690b), 0, 0);
            }
            if ((this.f19883h & 4) == 0) {
                return x1.b.b(0, l().f35690b, 0, 0);
            }
        }
        return bVar;
    }

    public x1.b F(int i) {
        return D(i, true);
    }

    public boolean I(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !E(i, false).equals(x1.b.f35688e);
    }

    public void K(x1.b bVar) {
        this.f19882g = bVar;
    }

    @Override // g2.t1
    public void d(View view) {
        this.f19884j = view.getWidth();
        this.i = view.getHeight();
        x1.b bVarH = H(view);
        if (bVarH == null) {
            bVarH = x1.b.f35688e;
        }
        K(bVarH);
    }

    @Override // g2.t1
    public List<Rect> e(int i) {
        return B(this.f19885k, i);
    }

    @Override // g2.t1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Objects.equals(this.f19882g, k1Var.f19882g) && L(this.f19883h, k1Var.f19883h);
    }

    @Override // g2.t1
    public List<Rect> f(int i) {
        return B(this.f19886l, i);
    }

    @Override // g2.t1
    public x1.b h(int i) {
        return D(i, false);
    }

    @Override // g2.t1
    public final x1.b l() {
        if (this.f19880e == null) {
            WindowInsets windowInsets = this.f19878c;
            this.f19880e = x1.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f19880e;
    }

    @Override // g2.t1
    public void n(View view) {
        A(view);
    }

    @Override // g2.t1
    public void o() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iC = b4.C(i);
            this.f19885k[iC] = C(h(i));
            if (i != 8) {
                this.f19886l[iC] = C(F(i));
            }
        }
    }

    @Override // g2.t1
    public x1 p(int i, int i10, int i11, int i12) {
        x1 x1VarG = x1.g(null, this.f19878c);
        int i13 = Build.VERSION.SDK_INT;
        j1 i1Var = i13 >= 36 ? new i1(x1VarG) : i13 >= 35 ? new h1(x1VarG) : i13 >= 34 ? new g1(x1VarG) : i13 >= 31 ? new f1(x1VarG) : i13 >= 30 ? new e1(x1VarG) : i13 >= 29 ? new d1(x1VarG) : new c1(x1VarG);
        i1Var.h(x1.e(l(), i, i10, i11, i12));
        i1Var.f(x1.e(j(), i, i10, i11, i12));
        return i1Var.b();
    }

    @Override // g2.t1
    public boolean r() {
        return this.f19878c.isRound();
    }

    @Override // g2.t1
    public boolean s(int i) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i & i10) != 0 && !I(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // g2.t1
    public void u(x1.b[] bVarArr) {
        this.f19879d = bVarArr;
    }

    @Override // g2.t1
    public void v(x1 x1Var) {
        this.f19881f = x1Var;
    }

    @Override // g2.t1
    public void x(int i) {
        this.f19883h = i;
    }

    @Override // g2.t1
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f19885k = (Rect[][]) rectArr.clone();
    }

    @Override // g2.t1
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f19886l = (Rect[][]) rectArr.clone();
    }

    @Override // g2.t1
    public void t(j jVar) {
    }
}
