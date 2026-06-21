package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y73 extends po {
    public final we A;
    public final o9 B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d4 f44945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f44946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hp2 f44947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ko2 f44948z;

    public /* synthetic */ y73(Context context, d4 d4Var, int i, String str, oo ooVar, Object obj, hp2 hp2Var, wo2 wo2Var, ct1 ct1Var, int i10) {
        this(context, d4Var, i, str, ooVar, obj, hp2Var, (i10 & 128) != 0 ? null : wo2Var, ct1Var, new we(context), new o9());
    }

    @Override // yads.po, yads.ro2
    public lm3 a(lm3 lm3Var) {
        try {
            h82 h82Var = lm3Var.f40609b;
            this.f44948z.a(this.f44947y.a(null, h82Var != null ? h82Var.f39069a : -1, this.f44946x));
            return lm3Var;
        } catch (Throwable th2) {
            this.f44948z.reportError("Failed to parse network error", th2);
            return new h4(m4.f40783p, null);
        }
    }

    public abstract xp2 a(h82 h82Var, int i);

    @Override // yads.ro2
    public Map d() {
        jj.i builder = new jj.i();
        builder.putAll(this.f44945w.f37614b.f42414a.f40247c);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public final void n() {
        go2 go2VarA = this.f44947y.a(this.f44946x);
        this.f44948z.a(go2VarA);
        String str = go2VarA.f38838a;
        eo2 eo2Var = eo2.f38201k;
        if (Intrinsics.a(str, "ad_request")) {
            this.A.a(eo2Var, go2VarA.f38839b, null, null);
        }
    }

    public y73(Context context, d4 d4Var, int i, String str, oo ooVar, Object obj, hp2 hp2Var, wo2 wo2Var, ct1 ct1Var, we weVar, o9 o9Var) {
        super(context, i, str, ooVar, wo2Var);
        this.f44945w = d4Var;
        this.f44946x = obj;
        this.f44947y = hp2Var;
        this.f44948z = ct1Var;
        this.A = weVar;
        this.B = o9Var;
        a(context);
        l();
        m();
        n();
    }

    @Override // yads.ro2
    public final xp2 a(h82 h82Var) {
        try {
            int i = h82Var.f39069a;
            xp2 xp2VarA = a(h82Var, i);
            a(h82Var, xp2VarA, i);
            return xp2VarA;
        } catch (Throwable th2) {
            this.f44948z.reportError("Failed to parse network response", th2);
            return new xp2(new h4(m4.f40783p, null));
        }
    }

    public final void a(h82 h82Var, xp2 xp2Var, int i) {
        go2 go2VarA = this.f44947y.a(xp2Var, i, this.f44946x);
        Map linkedHashMap = go2VarA.f38839b;
        if (!kotlin.jvm.internal.k0.d(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strC = u01.c(h82Var.f39071c, v11.f43837q);
        if (strC != null) {
            linkedHashMap.put("server_log_id", strC);
        }
        Map map = h82Var.f39071c;
        if (map != null) {
            w9.a(map);
        }
        this.f44948z.a(go2VarA);
    }

    public final void a(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA != null && (num2 = pt2VarA.f42054t0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = y11.f44885a;
        }
        this.B.f41493a.getClass();
        pt2 pt2VarA2 = fw2.a().a(context);
        this.f42670o = new qe0(1.0f, iIntValue, (pt2VarA2 == null || (num = pt2VarA2.J) == null) ? 0 : num.intValue());
    }
}
