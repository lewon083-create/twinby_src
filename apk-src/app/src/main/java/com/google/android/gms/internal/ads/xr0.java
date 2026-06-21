package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public interface xr0 {
    static xr0 i(Context context, int i, int i10, q9.d3 d3Var) {
        boolean zMatches;
        xr0 xr0VarK = k(context, i);
        if (xr0VarK instanceof yr0) {
            yr0 yr0Var = (yr0) xr0VarK;
            yr0Var.b();
            yr0Var.o(i10);
            yr0Var.t(hl.l.y(d3Var.f31812n));
            String str = d3Var.f31815q;
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) q9.s.f31967e.f31970c.a(al.T9), str);
            }
            if (zMatches) {
                yr0Var.D(str);
            }
        }
        return xr0VarK;
    }

    static xr0 k(Context context, int i) {
        boolean zBooleanValue;
        if (bs0.a()) {
            int i10 = i - 2;
            if (i10 == 20 || i10 == 21) {
                zBooleanValue = ((Boolean) vl.f11416e.r()).booleanValue();
            } else if (i10 != 110) {
                switch (i10) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) vl.f11414c.r()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) vl.f11415d.r()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) vl.f11413b.r()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.f2942ba)).booleanValue();
            }
            if (zBooleanValue) {
                return new yr0(context, i);
            }
        }
        return new ns0();
    }

    xr0 D(String str);

    xr0 a(boolean z5);

    boolean e();

    xr0 f(String str);

    xr0 g(Throwable th2);

    xr0 h();

    boolean j();

    xr0 l();

    xr0 m(cw cwVar);

    xr0 n(q9.x1 x1Var);

    xr0 o(int i);

    zr0 p();

    xr0 t(int i);

    xr0 v0(String str);
}
