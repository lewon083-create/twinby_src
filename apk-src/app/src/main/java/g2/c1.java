package g2;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends j1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f19840g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f19841h = false;
    public static Constructor i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f19842j = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WindowInsets f19843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x1.b f19844f;

    public c1() {
        this.f19843e = j();
    }

    private static WindowInsets j() {
        if (!f19841h) {
            try {
                f19840g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f19841h = true;
        }
        Field field = f19840g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!f19842j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f19842j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // g2.j1
    public x1 b() {
        a();
        x1 x1VarG = x1.g(null, this.f19843e);
        x1.b[] bVarArr = this.f19870b;
        t1 t1Var = x1VarG.f19943a;
        t1Var.u(bVarArr);
        t1Var.w(this.f19844f);
        t1Var.t(null);
        t1Var.y(this.f19871c);
        t1Var.z(this.f19872d);
        return x1VarG;
    }

    @Override // g2.j1
    public void f(x1.b bVar) {
        this.f19844f = bVar;
    }

    @Override // g2.j1
    public void h(x1.b bVar) {
        WindowInsets windowInsets = this.f19843e;
        if (windowInsets != null) {
            this.f19843e = windowInsets.replaceSystemWindowInsets(bVar.f35689a, bVar.f35690b, bVar.f35691c, bVar.f35692d);
        }
    }

    public c1(x1 x1Var) {
        super(x1Var);
        this.f19843e = x1Var.f();
    }
}
