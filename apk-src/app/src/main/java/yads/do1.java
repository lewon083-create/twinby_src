package yads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class do1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f37865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hl3 f37866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gl3 f37867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f37868d;

    public do1(Context context, nu2 nu2Var, d4 d4Var) {
        this(d4Var, new hl3(context), new gl3(context, nu2Var));
    }

    public final void a(CustomizableMediaView customizableMediaView, String str) {
        d4 d4Var = this.f37865a;
        String str2 = d4Var.f37615c.f39118a;
        if (str2 != null) {
            int i = d4Var.f37625n;
            ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
            Integer numValueOf = layoutParams != null ? Integer.valueOf(ia3.a(layoutParams.width)) : null;
            ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
            Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(ia3.a(layoutParams2.height)) : null;
            int iA = ia3.a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
            int iA2 = ia3.a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
            int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
            nj1 nj1Var = mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? nj1.f41269d : nj1.f41267b : nj1.f41268c;
            int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
            nj1 nj1Var2 = mode2 != Integer.MIN_VALUE ? (mode2 == 0 || mode2 != 1073741824) ? nj1.f41269d : nj1.f41267b : nj1.f41268c;
            this.f37868d.execute(new q0.o(this, new il3(i, str2), new el3(new dl3(ia3.a(customizableMediaView.getWidth()), ia3.a(customizableMediaView.getHeight())), new cf1(numValueOf, numValueOf2), new lj1(new mj1(iA, nj1Var), new mj1(iA2, nj1Var2)), kotlin.collections.j0.g(new Pair("asset", "media"), new Pair("media_type", str))), 19));
        }
    }

    public /* synthetic */ do1(d4 d4Var, hl3 hl3Var, gl3 gl3Var) {
        this(d4Var, hl3Var, gl3Var, Executors.newSingleThreadExecutor());
    }

    public do1(d4 d4Var, hl3 hl3Var, gl3 gl3Var, Executor executor) {
        this.f37865a = d4Var;
        this.f37866b = hl3Var;
        this.f37867c = gl3Var;
        this.f37868d = executor;
    }

    public static final void a(do1 do1Var, il3 il3Var, el3 el3Var) {
        do1Var.f37866b.a(il3Var, el3Var);
        do1Var.f37867c.a(el3Var, do1Var.f37865a);
    }
}
