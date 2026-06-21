package g2;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.i f19935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x1 f19936b;

    public w0(View view, ac.i iVar) {
        x1 x1VarB;
        this.f19935a = iVar;
        Field field = n0.f19900a;
        x1 x1VarA = g0.a(view);
        if (x1VarA != null) {
            int i = Build.VERSION.SDK_INT;
            x1VarB = (i >= 36 ? new i1(x1VarA) : i >= 35 ? new h1(x1VarA) : i >= 34 ? new g1(x1VarA) : i >= 31 ? new f1(x1VarA) : i >= 30 ? new e1(x1VarA) : i >= 29 ? new d1(x1VarA) : new c1(x1VarA)).b();
        } else {
            x1VarB = null;
        }
        this.f19936b = x1VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z5;
        if (!view.isLaidOut()) {
            this.f19936b = x1.g(view, windowInsets);
            return x0.i(view, windowInsets);
        }
        x1 x1VarG = x1.g(view, windowInsets);
        t1 t1Var = x1VarG.f19943a;
        if (this.f19936b == null) {
            Field field = n0.f19900a;
            this.f19936b = g0.a(view);
        }
        if (this.f19936b == null) {
            this.f19936b = x1VarG;
            return x0.i(view, windowInsets);
        }
        ac.i iVarJ = x0.j(view);
        if (iVarJ != null && Objects.equals((x1) iVarJ.f757c, x1VarG)) {
            return x0.i(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        x1 x1Var = this.f19936b;
        int i = 1;
        while (i <= 512) {
            x1.b bVarH = t1Var.h(i);
            x1.b bVarH2 = x1Var.f19943a.h(i);
            int i10 = bVarH.f35689a;
            int i11 = bVarH.f35692d;
            int i12 = bVarH.f35691c;
            int i13 = bVarH.f35690b;
            int i14 = bVarH2.f35689a;
            int i15 = bVarH2.f35692d;
            int i16 = bVarH2.f35691c;
            int i17 = bVarH2.f35690b;
            if (i10 > i14 || i13 > i17 || i12 > i16 || i11 > i15) {
                iArr = iArr2;
                z5 = true;
            } else {
                iArr = iArr2;
                z5 = false;
            }
            if (z5 != (i10 < i14 || i13 < i17 || i12 < i16 || i11 < i15)) {
                if (z5) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        boolean z10 = false;
        int i18 = iArr2[0];
        int i19 = iArr3[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f19936b = x1VarG;
            return x0.i(view, windowInsets);
        }
        x1 x1Var2 = this.f19936b;
        b1 b1Var = new b1(i20, (i18 & 8) != 0 ? x0.f19938e : (i19 & 8) != 0 ? x0.f19939f : (i18 & 519) != 0 ? x0.f19940g : (i19 & 519) != 0 ? x0.f19941h : null, (i20 & 8) != 0 ? 160L : 250L);
        b1Var.f19835a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(b1Var.f19835a.a());
        x1.b bVarH3 = t1Var.h(i20);
        x1.b bVarH4 = x1Var2.f19943a.h(i20);
        int iMin = Math.min(bVarH3.f35689a, bVarH4.f35689a);
        int i21 = bVarH3.f35690b;
        int i22 = bVarH4.f35690b;
        int iMin2 = Math.min(i21, i22);
        int i23 = bVarH3.f35691c;
        int i24 = bVarH4.f35691c;
        int iMin3 = Math.min(i23, i24);
        int i25 = bVarH3.f35692d;
        int i26 = bVarH4.f35692d;
        a1.e eVar = new a1.e(27, x1.b.b(iMin, iMin2, iMin3, Math.min(i25, i26)), x1.b.b(Math.max(bVarH3.f35689a, bVarH4.f35689a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)), z10);
        x0.f(view, x1VarG, false);
        duration.addUpdateListener(new u0(b1Var, x1VarG, x1Var2, i20, view));
        duration.addListener(new v0(b1Var, view));
        s.a(view, new aa.y(view, b1Var, eVar, duration));
        this.f19936b = x1VarG;
        return x0.i(view, windowInsets);
    }
}
