package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class h83 implements e92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e61 f39074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g61 f39075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39079f;

    public h83(e61 e61Var, g61 g61Var) {
        this.f39074a = e61Var;
        this.f39075b = g61Var;
    }

    public final Map a(ub3 ub3Var) {
        jj.i builder = new jj.i();
        builder.put("failure_tracked", Boolean.valueOf(this.f39078e));
        if (!ub3Var.f43629a.isEmpty()) {
            List list = ub3Var.f43629a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((vb3) it.next()).f43992b);
            }
            builder.put("warnings", arrayList);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // yads.e92
    public final void invalidate() {
        this.f39076c = false;
        this.f39077d = 0;
        this.f39078e = false;
        this.f39079f = false;
    }

    @Override // yads.e92
    public final void a(ty2 ty2Var, tb3 tb3Var) {
        int i = this.f39077d + 1;
        this.f39077d = i;
        if (i == 20) {
            this.f39078e = true;
            e61 e61Var = this.f39074a;
            e61Var.a(this.f39075b.f38664c, e61Var.a(tb3Var));
        }
    }

    @Override // yads.e92
    public final void a(List list) {
        j92 j92Var = (j92) CollectionsKt.firstOrNull(list);
        if (j92Var == null) {
            return;
        }
        e61 e61Var = this.f39074a;
        e61Var.a(this.f39075b.f38665d, e61Var.a(j92Var.f39785b));
    }

    @Override // yads.e92
    public final void a(ty2 ty2Var, List list, ub3 ub3Var) {
        if (this.f39079f) {
            return;
        }
        this.f39079f = true;
        Map mapA = a(ub3Var);
        e61 e61Var = this.f39074a;
        eo2 eo2Var = this.f39075b.f38662a;
        ho2 ho2VarA = e61Var.a();
        ho2VarA.f39286a.putAll(mapA);
        e61Var.a(eo2Var, ho2VarA);
    }

    @Override // yads.e92
    public final void a(ty2 ty2Var, ub3 ub3Var) {
        if (this.f39076c) {
            return;
        }
        this.f39076c = true;
        Map mapA = a(ub3Var);
        e61 e61Var = this.f39074a;
        eo2 eo2Var = this.f39075b.f38663b;
        ho2 ho2VarA = e61Var.a();
        ho2VarA.f39286a.putAll(mapA);
        e61Var.a(eo2Var, ho2VarA);
    }

    @Override // yads.e92
    public final void a(v9 v9Var) {
        this.f39074a.f38030a = v9Var;
    }
}
