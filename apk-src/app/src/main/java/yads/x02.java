package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r02 f44558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f44559b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f44560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c10 f44561d;

    public x02(Context context, d4 d4Var, nu2 nu2Var, w5 w5Var, r02 r02Var) {
        this.f44558a = r02Var;
        this.f44560c = new y5(context, d4Var, nu2Var, w5Var);
    }

    public final void a(l4 l4Var) {
        this.f44560c.a(l4Var.f40419b, l4Var.f40420c);
        this.f44559b.post(new zl.n(9, this, l4Var));
    }

    public static final void a(x02 x02Var, l4 l4Var) {
        c10 c10Var = x02Var.f44561d;
        if (c10Var != null) {
            ((st3) c10Var).a(l4Var);
        }
        r02 r02Var = x02Var.f44558a;
        q02 q02Var = (q02) r02Var.f42437a;
        q02Var.f42130e.a();
        q02Var.f42129d.remove(r02Var);
    }

    public final void a(y02 y02Var) {
        d00 d00Var = e00.f37941c;
        p4.a("native");
        this.f44560c.a();
        this.f44559b.post(new zl.n(6, this, y02Var));
    }

    public static final void a(x02 x02Var, y02 y02Var) {
        c10 c10Var = x02Var.f44561d;
        if (c10Var != null) {
            ((st3) c10Var).a(y02Var);
        }
        r02 r02Var = x02Var.f44558a;
        q02 q02Var = (q02) r02Var.f42437a;
        q02Var.f42130e.a();
        q02Var.f42129d.remove(r02Var);
    }

    public final void a(ArrayList arrayList) {
        d00 d00Var = e00.f37941c;
        p4.a("native");
        this.f44560c.a();
        this.f44559b.post(new zl.n(7, this, arrayList));
    }

    public static final void a(x02 x02Var, List list) {
        x02Var.getClass();
        r02 r02Var = x02Var.f44558a;
        q02 q02Var = (q02) r02Var.f42437a;
        q02Var.f42130e.a();
        q02Var.f42129d.remove(r02Var);
    }

    public final void a(x22 x22Var) {
        d00 d00Var = e00.f37941c;
        p4.a("native");
        this.f44560c.a();
        this.f44559b.post(new zl.n(8, this, x22Var));
    }

    public static final void a(x02 x02Var, x22 x22Var) {
        x02Var.getClass();
        r02 r02Var = x02Var.f44558a;
        q02 q02Var = (q02) r02Var.f42437a;
        q02Var.f42130e.a();
        q02Var.f42129d.remove(r02Var);
    }

    public final void a(d4 d4Var) {
        this.f44560c.f44920e = new j9(d4Var);
    }

    public final void a(k12 k12Var) {
        this.f44560c.f44921f = k12Var;
    }
}
