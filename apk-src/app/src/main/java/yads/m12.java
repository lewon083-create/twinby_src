package yads;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class m12 implements l52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n22 f40740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f40741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n12 f40743d;

    public m12(py1 py1Var, v9 v9Var) {
        this.f40740a = py1Var;
        this.f40741b = v9Var;
    }

    public wb3 a(int i, Context context, boolean z5) {
        n12 n12Var = this.f40743d;
        View viewA = n12Var != null ? n12Var.f41135c.a() : null;
        if (viewA == null) {
            return new tb3(sb3.f42888g, null, null);
        }
        if (nl3.b(viewA)) {
            return new tb3(sb3.f42889h, null, null);
        }
        am3 am3VarA = nl3.f41290a.a(viewA);
        String str = am3VarA.f36779b;
        this.f40742c = str;
        if (am3VarA.f36778a < 1) {
            return new tb3(sb3.i, null, str);
        }
        if (a(viewA, i) && !z5) {
            return new tb3(sb3.f42886e, null, this.f40742c);
        }
        String str2 = this.f40741b.f43939k;
        eg0[] eg0VarArr = eg0.f38124b;
        return (!Intrinsics.a(str2, "divkit") || this.f40741b.H) ? ((py1) this.f40740a).a(z5) : new ub3(kotlin.collections.b0.f27475b);
    }

    public final mp2 b() {
        return ((py1) this.f40740a).e();
    }

    public final boolean a() {
        View viewA;
        n12 n12Var = this.f40743d;
        if (n12Var == null || (viewA = n12Var.f41135c.a()) == null) {
            return true;
        }
        return nl3.b(viewA);
    }

    public final boolean a(View view, int i) {
        int iA = nl3.a(view);
        this.f40742c = a0.u.j(iA, i, "actualPercent: ", ", expectedPercent: ");
        return iA < i;
    }

    public final void a(n12 n12Var) {
        ((py1) this.f40740a).f42114d = n12Var;
        this.f40743d = n12Var;
    }
}
