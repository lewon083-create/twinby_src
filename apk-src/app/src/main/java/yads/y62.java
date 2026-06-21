package yads;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yandex.varioqub.config.model.ConfigValue;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class y62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j32 f44935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w62 f44936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bh3 f44937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x52 f44938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v62 f44939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i32 f44940f;

    public /* synthetic */ y62(Context context, gk3 gk3Var, di3 di3Var, d4 d4Var, nu2 nu2Var, v9 v9Var, yh3 yh3Var, g62 g62Var, j32 j32Var, oi2 oi2Var, py2 py2Var) {
        this(j32Var, new w62(gk3Var, di3Var, d4Var, nu2Var, v9Var, yh3Var, g62Var, oi2Var, py2Var), new bh3(), new x52(context.getApplicationContext(), d4Var, nu2Var, v9Var));
    }

    public final void a(h72 h72Var, vd3 vd3Var, ck3 ck3Var) {
        double dDoubleValue;
        w41 w41Var;
        x52 x52Var = this.f44938d;
        me3 me3Var = (me3) CollectionsKt.D(vd3Var.f44002a);
        r52 r52VarA = x52Var.f44607c.a(me3Var);
        if (r52VarA == null || r52VarA.f()) {
            r52VarA = x52Var.f44606b.a();
            x52Var.f44607c.a(me3Var, r52VarA);
        }
        r52 r52Var = r52VarA;
        Context context = h72Var.getContext();
        w62 w62Var = this.f44936b;
        if3 if3Var = new if3(w62Var.f44291c, w62Var.f44293e);
        v9 v9Var = w62Var.f44293e;
        nu2 nu2Var = w62Var.f44292d;
        di3 di3Var = w62Var.f44290b;
        v62 v62Var = new v62(context, v9Var, nu2Var, r52Var, vd3Var, di3Var, w62Var.f44289a, if3Var, ck3Var, w62Var.f44294f, w62Var.f44295g, w62Var.f44296h, w62Var.i);
        this.f44939e = v62Var;
        s52 s52Var = v62Var.f43905d;
        s52Var.getClass();
        Double d10 = di3Var.f37778d;
        y52 y52Var = s52Var.f42814b;
        if (d10 != null) {
            y52Var.getClass();
            dDoubleValue = d10.doubleValue();
        } else {
            dDoubleValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        y52Var.f44925a.setVolume((float) dDoubleValue);
        s52Var.f42813a.a(di3Var.f37775a);
        v62Var.f43907f.a(h72Var);
        hi3 hi3Var = h72Var.f39050a;
        ij2 ij2Var = v62Var.f43906e;
        ij2Var.getClass();
        ImageView imageView = hi3Var.f39210b;
        ProgressBar progressBar = hi3Var.f39209a;
        if (imageView == null || (w41Var = ij2Var.f39563a.f44004c) == null) {
            progressBar.setVisibility(0);
        } else {
            ij2Var.f39564b.a(w41Var, new hj2(imageView, progressBar));
        }
        v62Var.a(v62Var.f43909h);
        i32 i32Var = new i32(r52Var);
        this.f44940f = i32Var;
        j32 j32Var = this.f44935a;
        j32Var.f39715a.add(i32Var);
        if (j32Var.f39716b) {
            r52Var.g();
        }
        h72Var.setOnAttachStateChangeListener(new d62(r52Var, h72Var));
    }

    public y62(j32 j32Var, w62 w62Var, bh3 bh3Var, x52 x52Var) {
        this.f44935a = j32Var;
        this.f44936b = w62Var;
        this.f44937c = bh3Var;
        this.f44938d = x52Var;
    }
}
