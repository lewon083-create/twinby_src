package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h01 extends l01 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Long f5999h;
    public static final Object i = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6000g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h01(String str, String str2, jd jdVar, wz0 wz0Var, i21 i21Var, int i10) {
        super(str, str2, jdVar, wz0Var, i21Var);
        this.f6000g = i10;
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final void a(Method method, jd jdVar) {
        switch (this.f6000g) {
            case 0:
                if (f5999h == null) {
                    synchronized (i) {
                        try {
                            if (f5999h == null) {
                                Long l10 = (Long) method.invoke("", null);
                                if (l10 == null) {
                                    throw null;
                                }
                                f5999h = l10;
                            }
                        } finally {
                        }
                    }
                }
                synchronized (jdVar) {
                    try {
                        if (f5999h != null) {
                            long jLongValue = f5999h.longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).P0(jLongValue);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                synchronized (jdVar) {
                    jdVar.b();
                    ((wd) jdVar.f9560c).D0("E");
                    jdVar.b();
                    ((wd) jdVar.f9560c).L(0L);
                    jdVar.b();
                    ((wd) jdVar.f9560c).f0("D");
                    break;
                }
                Object[] objArr = (Object[]) method.invoke("", null);
                objArr.getClass();
                synchronized (jdVar) {
                    String str = (String) objArr[0];
                    jdVar.b();
                    ((wd) jdVar.f9560c).D0(str);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).L(jLongValue2);
                    String str2 = (String) objArr[2];
                    jdVar.b();
                    ((wd) jdVar.f9560c).f0(str2);
                    break;
                }
                return;
        }
    }
}
