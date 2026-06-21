package yads;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f45041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah f45042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eu1 f45043d;

    public /* synthetic */ yf1(Context context, d4 d4Var) {
        this(context, d4Var, new ah(context), eu1.f38254e.a());
    }

    public final List a() {
        l4 l4VarA;
        l4 l4VarA2;
        try {
            this.f45042c.a();
            l4VarA = null;
        } catch (wb1 e3) {
            l4 l4Var = h9.f39080a;
            l4VarA = h9.a(1, e3.getMessage(), e3.f44329c);
        }
        try {
            eu1 eu1Var = this.f45043d;
            Context context = this.f45040a;
            if (eu1Var.f38257b) {
                synchronized (eu1Var.f38256a) {
                    try {
                        if (eu1Var.f38257b) {
                            if (ub.a(context)) {
                                eu1Var.f38258c.a(context);
                                eu1Var.f38259d.getClass();
                                jc2.a(context);
                            }
                            eu1Var.f38257b = false;
                        }
                        Unit unit = Unit.f27471a;
                    } finally {
                    }
                }
            }
            l4VarA2 = null;
        } catch (wb1 e7) {
            l4 l4Var2 = h9.f39080a;
            l4VarA2 = h9.a(1, e7.getMessage(), e7.f44329c);
        }
        d4 d4Var = this.f45041b;
        l4[] elements = {l4VarA, l4VarA2, d4Var.f37615c.f39118a == null ? h9.f39090l : null, d4Var.f37617e == null ? h9.i : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.p.l(elements);
    }

    public yf1(Context context, d4 d4Var, ah ahVar, eu1 eu1Var) {
        this.f45040a = context;
        this.f45041b = d4Var;
        this.f45042c = ahVar;
        this.f45043d = eu1Var;
    }
}
