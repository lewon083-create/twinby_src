package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i01 extends l01 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6331g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f6332h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6333j;

    public i01(jd jdVar, wz0 wz0Var, by0 by0Var, Context context, Map map, j21 j21Var) {
        super("cNPndN+EzA0ppawmtlMhouOhZ8up9MCZv7/NNjE52JSJNgkl5UKlR5xuXAGt5rDT", "maxrbwgAVilcsYV2zOy8o/EZWuXXlpXIbHDx2rc0DB0=", jdVar, wz0Var, j21Var.a(121));
        this.i = by0Var;
        this.f6333j = context;
        this.f6332h = map;
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final void a(Method method, jd jdVar) {
        Object[] objArr;
        switch (this.f6331g) {
            case 0:
                by0 by0Var = (by0) this.i;
                Integer numValueOf = Integer.valueOf(by0Var.ordinal());
                Context context = (Context) this.f6333j;
                Object obj = this.f6332h.get("up");
                Boolean bool = Boolean.TRUE;
                if (obj == null) {
                    obj = bool;
                }
                Object[] objArr2 = (Object[]) method.invoke("", numValueOf, context, obj);
                objArr2.getClass();
                synchronized (jdVar) {
                    try {
                        if (by0Var == by0.f3961b) {
                            Object obj2 = objArr2[0];
                            if (obj2 == null) {
                                obj2 = obj;
                            }
                            long jLongValue = ((Long) obj2).longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).A(jLongValue);
                            Object obj3 = objArr2[1];
                            long jLongValue2 = ((Long) (obj3 != null ? obj3 : -1L)).longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).B(jLongValue2);
                        }
                        long jLongValue3 = ((Long) objArr2[2]).longValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).J0(jLongValue3);
                        long jLongValue4 = ((Long) objArr2[3]).longValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).a0(jLongValue4);
                    } finally {
                    }
                    break;
                }
                return;
            default:
                Map map = this.f6332h;
                MotionEvent motionEvent = (MotionEvent) map.get("nv");
                DisplayMetrics displayMetrics = (DisplayMetrics) this.f6333j;
                Object[] objArr3 = (Object[]) method.invoke("", motionEvent, displayMetrics);
                objArr3.getClass();
                sd sdVarZ = td.z();
                Object obj4 = objArr3[0];
                boolean z5 = true;
                if (obj4 != null && objArr3[1] != null) {
                    long jLongValue5 = ((Long) obj4).longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).A(jLongValue5);
                    long jLongValue6 = ((Long) objArr3[1]).longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).B(jLongValue6);
                }
                Object obj5 = objArr3[2];
                if (obj5 != null) {
                    long jLongValue7 = ((Long) obj5).longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).H(jLongValue7);
                }
                Object obj6 = objArr3[3];
                if (obj6 != null) {
                    long jLongValue8 = ((Long) obj6).longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).F(jLongValue8);
                }
                Object obj7 = objArr3[4];
                if (obj7 != null) {
                    long jLongValue9 = ((Long) obj7).longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).C(jLongValue9);
                }
                Object obj8 = objArr3[5];
                if (obj8 != null) {
                    int i = ((Long) obj8).longValue() != 0 ? 2 : 1;
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).S(i);
                }
                Object obj9 = objArr3[6];
                if (obj9 != null) {
                    long jLongValue10 = ((Long) obj9).longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).J(jLongValue10);
                }
                Object obj10 = objArr3[7];
                if (obj10 != null) {
                    long jLongValue11 = ((Long) obj10).longValue();
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).I(jLongValue11);
                }
                Object obj11 = objArr3[8];
                if (obj11 != null) {
                    int i10 = ((Long) obj11).longValue() != 0 ? 2 : 1;
                    sdVarZ.b();
                    ((td) sdVarZ.f9560c).T(i10);
                }
                synchronized (jdVar) {
                    try {
                        Method methodB = ((wz0) this.i).b("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                        if (methodB == null || (objArr = (Object[]) methodB.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                            throw null;
                        }
                        Object obj12 = objArr[0];
                        if (obj12 != null) {
                            long jLongValue12 = ((Long) obj12).longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).K0(jLongValue12);
                        }
                        Object obj13 = objArr[1];
                        if (obj13 != null) {
                            long jLongValue13 = ((Long) obj13).longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).L0(jLongValue13);
                        }
                        Object obj14 = objArr[2];
                        if (obj14 != null) {
                            long jLongValue14 = ((Long) obj14).longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).M0(jLongValue14);
                        }
                        Object obj15 = objArr[3];
                        if (obj15 != null) {
                            long jLongValue15 = ((Long) obj15).longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).F(jLongValue15);
                        }
                        Object obj16 = objArr[4];
                        if (obj16 != null) {
                            long jLongValue16 = ((Long) obj16).longValue();
                            jdVar.b();
                            ((wd) jdVar.f9560c).G(jLongValue16);
                        }
                        iz0 iz0Var = (iz0) map.get("oe");
                        if (iz0Var != null) {
                            long j10 = iz0Var.f6649a;
                            if (j10 > 0) {
                                jdVar.b();
                                ((wd) jdVar.f9560c).J(j10);
                            }
                            long j11 = iz0Var.f6650b;
                            if (j11 > 0) {
                                jdVar.b();
                                ((wd) jdVar.f9560c).I(j11);
                            }
                            long j12 = iz0Var.f6651c;
                            if (j12 > 0) {
                                jdVar.b();
                                ((wd) jdVar.f9560c).H(j12);
                            }
                            long j13 = iz0Var.f6652d;
                            if (j13 > 0) {
                                jdVar.b();
                                ((wd) jdVar.f9560c).K(j13);
                            }
                        }
                        iz0 iz0Var2 = (iz0) map.get("oe");
                        if (iz0Var2 != null && iz0Var2.f6649a != 0) {
                            if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                                double d10 = iz0Var2.f6655g;
                                if (displayMetrics == null) {
                                    throw null;
                                }
                                long jRound = Math.round(d10 / ((double) displayMetrics.density));
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).L(jRound);
                                long jRound2 = Math.round(((double) (iz0Var2.f6657j - iz0Var2.f6656h)) / ((double) displayMetrics.density));
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).M(jRound2);
                                long jRound3 = Math.round(((double) (iz0Var2.f6658k - iz0Var2.i)) / ((double) displayMetrics.density));
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).N(jRound3);
                                long jRound4 = Math.round(((double) iz0Var2.f6656h) / ((double) displayMetrics.density));
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).Q(jRound4);
                                long jRound5 = Math.round(((double) iz0Var2.i) / ((double) displayMetrics.density));
                                sdVarZ.b();
                                ((td) sdVarZ.f9560c).R(jRound5);
                                MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                                if (motionEvent2 != null) {
                                    long jRound6 = Math.round(((double) (((iz0Var2.f6656h - iz0Var2.f6657j) + motionEvent2.getRawX()) - motionEvent2.getX())) / ((double) displayMetrics.density));
                                    if (jRound6 != 0) {
                                        sdVarZ.b();
                                        ((td) sdVarZ.f9560c).O(jRound6);
                                    }
                                    long jRound7 = Math.round(((double) (((iz0Var2.i - iz0Var2.f6658k) + motionEvent2.getRawY()) - motionEvent2.getY())) / ((double) displayMetrics.density));
                                    if (jRound7 != 0) {
                                        sdVarZ.b();
                                        ((td) sdVarZ.f9560c).P(jRound7);
                                    }
                                }
                            }
                        }
                        jdVar.b();
                        ((wd) jdVar.f9560c).S((td) sdVarZ.d());
                        jz0[] jz0VarArr = (jz0[]) map.get("ro");
                        if (jz0VarArr != null) {
                            if (displayMetrics == null || displayMetrics.density == 0.0f) {
                                z5 = false;
                            }
                            if (z5) {
                                for (int i11 = 0; i11 <= jz0VarArr.length - 2; i11++) {
                                    jz0 jz0Var = jz0VarArr[i11];
                                    sd sdVarZ2 = td.z();
                                    double d11 = jz0Var.f7029a;
                                    if (displayMetrics == null) {
                                        throw null;
                                    }
                                    long jRound8 = Math.round(d11 / ((double) displayMetrics.density));
                                    sdVarZ2.b();
                                    ((td) sdVarZ2.f9560c).A(jRound8);
                                    long jRound9 = Math.round(((double) jz0Var.f7030b) / ((double) displayMetrics.density));
                                    sdVarZ2.b();
                                    ((td) sdVarZ2.f9560c).B(jRound9);
                                    td tdVar = (td) sdVarZ2.d();
                                    jdVar.b();
                                    ((wd) jdVar.f9560c).T(tdVar);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public i01(jd jdVar, wz0 wz0Var, Map map, DisplayMetrics displayMetrics, j21 j21Var) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", jdVar, wz0Var, j21Var.a(123));
        this.i = wz0Var;
        this.f6332h = map;
        this.f6333j = displayMetrics;
    }
}
