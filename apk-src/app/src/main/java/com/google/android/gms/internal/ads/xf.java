package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xf extends ig {
    public final /* synthetic */ int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f12142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f12143k;

    public xf(qf qfVar, jd jdVar, int i, Context context) {
        super(qfVar, "t0O1yTkaf8U85RYVI/Iw764S7xVo2UnzoC6xqdKHezEduB25T+k9NlupfapwCNk2", "NAFu5DHVi3o3yaFx1OCpv/KBsMCIhscKWxn1MzThPRk=", jdVar, i, 31);
        this.f12142j = null;
        this.f12143k = context;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void a() {
        switch (this.i) {
            case 0:
                View view = (View) this.f12143k;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) q9.s.f31967e.f31970c.a(al.f3013g3);
                boolean zBooleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.f6485f.invoke(null, view, (Activity) this.f12142j, bool);
                jd jdVar = this.f6484e;
                synchronized (jdVar) {
                    try {
                        long jLongValue = ((Long) objArr[0]).longValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).c0(jLongValue);
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        jdVar.b();
                        ((wd) jdVar.f9560c).d0(jLongValue2);
                        if (zBooleanValue) {
                            String str = (String) objArr[2];
                            jdVar.b();
                            ((wd) jdVar.f9560c).e0(str);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                jd jdVar2 = this.f6484e;
                jdVar2.b();
                ((wd) jdVar2.f9560c).A(-1L);
                jdVar2.b();
                ((wd) jdVar2.f9560c).B(-1L);
                Context context = (Context) this.f12143k;
                if (context == null) {
                    context = this.f6481b.f9475a;
                }
                if (((List) this.f12142j) == null) {
                    this.f12142j = (List) this.f6485f.invoke(null, context);
                }
                List list = (List) this.f12142j;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (jdVar2) {
                    long jLongValue3 = ((Long) ((List) this.f12142j).get(0)).longValue();
                    jdVar2.b();
                    ((wd) jdVar2.f9560c).A(jLongValue3);
                    long jLongValue4 = ((Long) ((List) this.f12142j).get(1)).longValue();
                    jdVar2.b();
                    ((wd) jdVar2.f9560c).B(jLongValue4);
                    break;
                }
                return;
        }
    }

    public xf(qf qfVar, jd jdVar, int i, View view, Activity activity) {
        super(qfVar, "v55I7GonHWsamYbBtyIFKaZFQR/sofAKKTQsUzMKV1C6iCJ1v6Vqzq9x9meUl2ez", "Z7zWno+0eCAtcsPK71T7clKp8ZTgICQrdpeo5cTQYQo=", jdVar, i, 62);
        this.f12143k = view;
        this.f12142j = activity;
    }
}
