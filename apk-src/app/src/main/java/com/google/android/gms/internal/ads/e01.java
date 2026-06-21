package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e01 extends l01 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f4781h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(jd jdVar, wz0 wz0Var, Context context, j21 j21Var, int i) {
        super("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", jdVar, wz0Var, j21Var.a(115));
        this.f4780g = i;
        switch (i) {
            case 1:
                super("10eHn0oEJc+Kv4xHAilDadQXUH+Qd7+H1wb3g/5791dKT43oKLnvfFcwz9lBLCYb", "DO5TusvTbmxbLfPhMKcHxON+YLmz+u+OpsMl13dRFcs=", jdVar, wz0Var, j21Var.a(119));
                this.f4781h = context;
                break;
            default:
                this.f4781h = context;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final void a(Method method, jd jdVar) {
        switch (this.f4780g) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.f4781h);
                objArr.getClass();
                synchronized (jdVar) {
                    try {
                        long jIntValue = ((Integer) objArr[0]).intValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).X(jIntValue);
                        int i = 1;
                        long jIntValue2 = ((Integer) objArr[1]).intValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).G0(jIntValue2);
                        long jIntValue3 = ((Integer) objArr[2]).intValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).H0(jIntValue3);
                        long jIntValue4 = ((Integer) objArr[3]).intValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).l0(jIntValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            jdVar.b();
                            ((wd) jdVar.f9560c).p0(3);
                        } else {
                            int i10 = true != bool.booleanValue() ? 1 : 2;
                            jdVar.b();
                            ((wd) jdVar.f9560c).p0(i10);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            jdVar.g(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i = 2;
                            }
                            jdVar.g(i);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.f4781h);
                objArr2.getClass();
                synchronized (jdVar) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).F0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).Y(jLongValue2);
                    break;
                }
                return;
        }
    }
}
