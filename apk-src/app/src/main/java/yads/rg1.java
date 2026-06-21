package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg f42596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv2 f42597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rr1 f42598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ez f42599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x30 f42600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lh1 f42601f;

    public rg1(kg kgVar, fv2 fv2Var, rr1 rr1Var, ez ezVar, x30 x30Var, lh1 lh1Var) {
        this.f42596a = kgVar;
        this.f42597b = fv2Var;
        this.f42598c = rr1Var;
        this.f42599d = ezVar;
        this.f42600e = x30Var;
        this.f42601f = lh1Var;
    }

    public final b80 a() {
        t80 t80Var;
        String strD;
        String strC;
        c80 c80Var;
        m50 m50VarA = this.f42596a.a();
        fv2 fv2Var = this.f42597b;
        cu1 cu1Var = fv2Var.f38561b;
        Context context = fv2Var.f38560a;
        cu1Var.getClass();
        bu1 bu1VarA = cu1.a(context);
        boolean z5 = false;
        if (Intrinsics.a(bu1VarA, zt1.f45528a)) {
            t80Var = new t80(true, kotlin.collections.b0.f27475b);
        } else {
            if (!(bu1VarA instanceof au1)) {
                throw new ij.j();
            }
            List list = ((au1) bu1VarA).f36862a;
            ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((wb1) it.next()).getMessage());
            }
            t80Var = new t80(false, arrayList);
        }
        rr1 rr1Var = this.f42598c;
        rr1Var.getClass();
        ArrayList arrayListA = rr1Var.f42720a.a(oq1.a());
        ez ezVar = this.f42599d;
        boolean zA = ezVar.f38296a.a();
        Boolean boolB = ezVar.f38296a.b();
        Boolean boolD = ezVar.f38296a.d();
        String strB = ((zw) ezVar.f38297b).b();
        if ((strB != null && !StringsKt.D(strB)) || (((strD = ((zw) ezVar.f38297b).d()) != null && !StringsKt.D(strD)) || ((strC = ((zw) ezVar.f38297b).c()) != null && !StringsKt.D(strC)))) {
            z5 = true;
        }
        t50 t50Var = new t50(zA, boolB, boolD, z5);
        u70 u70Var = new u70(this.f42600e.f44589a.c());
        lh1 lh1Var = this.f42601f;
        lh1Var.getClass();
        synchronized (lh1.f40552c) {
            c80Var = !gu1.f38875b ? null : new c80(lh1Var.f40553a.b(), lh1Var.f40554b.b());
        }
        return new b80(m50VarA, t80Var, arrayListA, t50Var, u70Var, c80Var);
    }
}
