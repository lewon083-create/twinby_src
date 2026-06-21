package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b61 implements f61, wu1, yh3, pn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a61 f36938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5 f36939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d61 f36940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f36941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f36942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j5 f36943f;

    public b61(Context context, wz1 wz1Var, f5 f5Var, d61 d61Var) {
        this.f36938a = wz1Var;
        this.f36939b = f5Var;
        this.f36940c = d61Var;
        this.f36941d = context.getApplicationContext();
    }

    public final void a() {
        f5 f5Var = this.f36939b;
        String str = f5Var.f38381a.f38612a;
        if (str != null && str.length() != 0) {
            e5 e5Var = f5Var.f38382b;
            e5Var.getClass();
            synchronized (e5.f38010c) {
                e5Var.f38013b.remove(str);
                e5Var.f38013b.add(str);
            }
        }
        this.f36938a.a(this.f36943f);
    }

    @Override // yads.wu1
    public final void b() {
        if (j()) {
            return;
        }
        d61 d61Var = this.f36940c;
        if (!d61Var.f37644d) {
            d61Var.f37644d = true;
            for (eo2 eo2Var : d61.f37640f) {
                e61 e61Var = d61Var.f37641a;
                Map map = d61Var.f37642b;
                ho2 ho2VarA = e61Var.a();
                ho2VarA.f39286a.putAll(map);
                e61Var.a(eo2Var, ho2VarA);
            }
        }
        if (i()) {
            a();
        }
    }

    @Override // yads.f61
    public final void c() {
        if (!j() || i()) {
            return;
        }
        a();
    }

    @Override // yads.yh3
    public final void d() {
        if (j()) {
            return;
        }
        d61 d61Var = this.f36940c;
        if (!d61Var.f37643c) {
            d61Var.f37643c = true;
            for (eo2 eo2Var : d61.f37639e) {
                e61 e61Var = d61Var.f37641a;
                Map map = d61Var.f37642b;
                ho2 ho2VarA = e61Var.a();
                ho2VarA.f39286a.putAll(map);
                e61Var.a(eo2Var, ho2VarA);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.wu1
    public final void e() {
        if (j()) {
            return;
        }
        d61 d61Var = this.f36940c;
        if (!d61Var.f37643c) {
            d61Var.f37643c = true;
            for (eo2 eo2Var : d61.f37639e) {
                e61 e61Var = d61Var.f37641a;
                Map map = d61Var.f37642b;
                ho2 ho2VarA = e61Var.a();
                ho2VarA.f39286a.putAll(map);
                e61Var.a(eo2Var, ho2VarA);
            }
        }
        if (i()) {
            return;
        }
        a();
    }

    @Override // yads.f61
    public final void g() {
        if (j() && i()) {
            a();
        }
    }

    @Override // yads.yh3
    public final void h() {
        if (j()) {
            return;
        }
        d61 d61Var = this.f36940c;
        if (!d61Var.f37644d) {
            d61Var.f37644d = true;
            for (eo2 eo2Var : d61.f37640f) {
                e61 e61Var = d61Var.f37641a;
                Map map = d61Var.f37642b;
                ho2 ho2VarA = e61Var.a();
                ho2VarA.f39286a.putAll(map);
                e61Var.a(eo2Var, ho2VarA);
            }
        }
        if (i()) {
            a();
        }
    }

    public final boolean i() {
        pt2 pt2VarA = fw2.a().a(this.f36941d);
        return pt2VarA == null || pt2VarA.f42055u;
    }

    public final boolean j() {
        List list = this.f36942e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void a(List list, j5 j5Var) {
        this.f36942e = list;
        this.f36943f = j5Var;
        d61 d61Var = this.f36940c;
        d61Var.f37643c = false;
        d61Var.f37644d = false;
    }

    @Override // yads.pn2
    public final void f() {
    }
}
