package g2;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f19924b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f19925a;

    static {
        int i = Build.VERSION.SDK_INT;
        f19924b = (i >= 36 ? new i1() : i >= 35 ? new h1() : i >= 34 ? new g1() : i >= 31 ? new f1() : i >= 30 ? new e1() : i >= 29 ? new d1() : new c1()).b().f19943a.a().f19943a.b().f19943a.c();
    }

    public t1(x1 x1Var) {
        this.f19925a = x1Var;
    }

    public x1 a() {
        return this.f19925a;
    }

    public x1 b() {
        return this.f19925a;
    }

    public x1 c() {
        return this.f19925a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return r() == t1Var.r() && q() == t1Var.q() && Objects.equals(l(), t1Var.l()) && Objects.equals(j(), t1Var.j()) && Objects.equals(g(), t1Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public h g() {
        return null;
    }

    public x1.b h(int i) {
        return x1.b.f35688e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(r()), Boolean.valueOf(q()), l(), j(), g());
    }

    public x1.b i() {
        return l();
    }

    public x1.b j() {
        return x1.b.f35688e;
    }

    public x1.b k() {
        return l();
    }

    public x1.b l() {
        return x1.b.f35688e;
    }

    public x1.b m() {
        return l();
    }

    public x1 p(int i, int i10, int i11, int i12) {
        return f19924b;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s(int i) {
        return true;
    }

    public void o() {
    }

    public void d(View view) {
    }

    public void n(View view) {
    }

    public void t(j jVar) {
    }

    public void u(x1.b[] bVarArr) {
    }

    public void v(x1 x1Var) {
    }

    public void w(x1.b bVar) {
    }

    public void x(int i) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }
}
