package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class eu2 implements ap2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw2 f38260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gq2 f38261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cu2 f38262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f38263d;

    public /* synthetic */ eu2(Context context, ct1 ct1Var) {
        this(context, fw2.a(), new hu2(ct1Var), new cu2());
    }

    @Override // yads.ap2
    public final Object a(h82 h82Var) {
        return (pt2) this.f38261b.a(h82Var);
    }

    @Override // yads.ap2
    public final boolean a() {
        pt2 pt2VarA = this.f38260a.a(this.f38263d);
        if (pt2VarA == null) {
            return true;
        }
        cu2 cu2Var = this.f38262c;
        cu2Var.f37508a.f42723a.getClass();
        if (System.currentTimeMillis() >= pt2VarA.f42026e) {
            return true;
        }
        cu2Var.f37509b.getClass();
        if (!"7.18.4".equals(pt2VarA.R)) {
            return true;
        }
        cu2Var.f37510c.getClass();
        if (!Intrinsics.a(fw2.a().d(), pt2VarA.L)) {
            return true;
        }
        cu2Var.f37510c.getClass();
        if (fw2.a().a() != pt2VarA.f42061x) {
            return true;
        }
        cu2Var.f37510c.getClass();
        return !Intrinsics.a(fw2.a().b(), pt2VarA.M);
    }

    public eu2(Context context, gw2 gw2Var, gq2 gq2Var, cu2 cu2Var) {
        this.f38260a = gw2Var;
        this.f38261b = gq2Var;
        this.f38262c = cu2Var;
        this.f38263d = context.getApplicationContext();
    }
}
