package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zz0 extends l01 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13158g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13159h;
    public final Object i;

    public zz0(jd jdVar, wz0 wz0Var, DisplayMetrics displayMetrics, View view, j21 j21Var) {
        super("QtFUhprc0s9rDonjH5m4IrigIFuqmp02TDnBB8cCDzOGBvtX+nN2RsZyZRWOgPcG", "ANcskOtBFoz5qdvK1HjqJ5/70uPKH1zreYbosxrVnAY=", jdVar, wz0Var, j21Var.a(124));
        this.f13159h = displayMetrics;
        this.i = view;
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final void a(Method method, jd jdVar) throws IllegalAccessException, InvocationTargetException {
        switch (this.f13158g) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.i, (Activity) this.f13159h);
                objArr.getClass();
                synchronized (jdVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).c0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).d0(jLongValue2);
                    String str = (String) objArr[2];
                    jdVar.b();
                    ((wd) jdVar.f9560c).e0(str);
                    break;
                }
                return;
            case 1:
                Long lValueOf = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l10 = (Long) method.invoke("", (Context) this.f13159h);
                        if (l10 == null) {
                            throw null;
                        }
                        lValueOf = l10;
                    } else {
                        ed.d dVar = (ed.d) ((Map) this.i).get("gs");
                        if (dVar != null && dVar.isDone()) {
                            lValueOf = Long.valueOf(((wd) dVar.get()).x0());
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (jdVar) {
                    long jLongValue3 = lValueOf.longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).b0(jLongValue3);
                    break;
                }
                return;
            case 2:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.f13159h;
                Long l11 = (Long) map.get("tcq");
                if (l11 == null) {
                    l11 = -1L;
                }
                lArr[0] = l11;
                Long l12 = (Long) map.get("tpq");
                if (l12 == null) {
                    l12 = -1L;
                }
                lArr[1] = l12;
                Long l13 = (Long) map.get("tcv");
                if (l13 == null) {
                    l13 = -1L;
                }
                lArr[2] = l13;
                Long l14 = (Long) map.get("tpv");
                if (l14 == null) {
                    l14 = -1L;
                }
                lArr[3] = l14;
                Long l15 = (Long) map.get("tchv");
                if (l15 == null) {
                    l15 = -1L;
                }
                lArr[4] = l15;
                Long l16 = (Long) map.get("tphv");
                if (l16 == null) {
                    l16 = -1L;
                }
                lArr[5] = l16;
                Long l17 = (Long) map.get("tcc");
                if (l17 == null) {
                    l17 = -1L;
                }
                lArr[6] = l17;
                Long l18 = (Long) map.get("tpc");
                if (l18 == null) {
                    l18 = -1L;
                }
                lArr[7] = l18;
                Long l19 = (Long) map.get("tst");
                if (l19 == null) {
                    l19 = -1L;
                }
                lArr[8] = l19;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((by0) this.i).ordinal()));
                lArr2.getClass();
                synchronized (jdVar) {
                    long jLongValue4 = lArr2[0].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).m0(jLongValue4);
                    long jLongValue5 = lArr2[1].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).C(jLongValue5);
                    long jLongValue6 = lArr2[2].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).Q0(jLongValue6);
                    long jLongValue7 = lArr2[3].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).N0(jLongValue7);
                    long jLongValue8 = lArr2[4].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).i0(jLongValue8);
                    long jLongValue9 = lArr2[5].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).j0(jLongValue9);
                    long jLongValue10 = lArr2[6].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).P(jLongValue10);
                    long jLongValue11 = lArr2[7].longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).Q(jLongValue11);
                    break;
                }
                return;
            default:
                View view = (View) this.i;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke("", (DisplayMetrics) this.f13159h, view);
                objInvoke.getClass();
                Long[] lArr3 = (Long[]) objInvoke;
                ud udVarZ = vd.z();
                long jLongValue12 = lArr3[2].longValue();
                udVarZ.b();
                ((vd) udVarZ.f9560c).B(jLongValue12);
                long jLongValue13 = lArr3[1].longValue();
                udVarZ.b();
                ((vd) udVarZ.f9560c).C(jLongValue13);
                long jLongValue14 = lArr3[0].longValue();
                udVarZ.b();
                ((vd) udVarZ.f9560c).D(jLongValue14);
                long jLongValue15 = lArr3[3].longValue();
                udVarZ.b();
                ((vd) udVarZ.f9560c).A(jLongValue15);
                long jLongValue16 = lArr3[4].longValue();
                udVarZ.b();
                ((vd) udVarZ.f9560c).E(jLongValue16);
                vd vdVar = (vd) udVarZ.d();
                jdVar.b();
                ((wd) jdVar.f9560c).V(vdVar);
                return;
        }
    }

    public zz0(jd jdVar, wz0 wz0Var, View view, Activity activity, j21 j21Var) {
        super("bnVSgdPP2gLWa4hBN3KENgNw/HH5/Lu+gCRQEGIHMH/zN0uabg0EmprGntHqQpss", "4mb2wE47WPzlH8QFuj7X929jGLgzTiMr8Iu3TogjJ0U=", jdVar, wz0Var, j21Var.a(111));
        this.i = view;
        this.f13159h = activity;
    }

    public zz0(jd jdVar, wz0 wz0Var, by0 by0Var, Map map, j21 j21Var) {
        super("+PmnicIB6Ggxqdcyc5KXYWsM1j/GXRihAyryrcphzvI3AMIT+uhHMqbkBoIk/Q9k", "+zCNZC90FxKlnODut7cZO0wgbMEddS2/rBQzUBv6at4=", jdVar, wz0Var, j21Var.a(122));
        this.f13159h = map;
        this.i = by0Var;
    }

    public zz0(jd jdVar, wz0 wz0Var, Map map, Context context, j21 j21Var) {
        super("4E5LGVIWQ1GEduvP5TN/xg9UMJg1ApPRTsJapm6hD1tpcLj2ORRJ8msrY4RVPfxM", "Dj3g22+8PSWa8Tetil7hQ1gD69SNesarbyARD9M1zvc=", jdVar, wz0Var, j21Var.a(120));
        this.f13159h = context;
        this.i = map;
    }
}
