package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d01 extends l01 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f4411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f4412h;
    public final by0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f4414k;

    public d01(jd jdVar, wz0 wz0Var, Map map, Context context, by0 by0Var, ux0 ux0Var, j21 j21Var) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", jdVar, wz0Var, j21Var.a(113));
        this.f4412h = context;
        this.f4411g = map;
        this.i = by0Var;
        this.f4413j = ux0Var.M();
        this.f4414k = ux0Var.N();
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final void a(Method method, jd jdVar) {
        wd wdVar;
        Object[] objArr = (Object[]) method.invoke("", this.f4412h, Integer.valueOf(this.i.ordinal()));
        objArr.getClass();
        String strU0 = "E";
        int i = 1;
        try {
            ed.d dVar = (ed.d) this.f4411g.get("gs");
            if (dVar != null && ((Build.VERSION.SDK_INT < 31 || dVar.isDone()) && (wdVar = (wd) dVar.get(this.f4413j, TimeUnit.MILLISECONDS)) != null && wdVar.u0().length() > 1)) {
                strU0 = wdVar.u0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strU0.equals("E")) {
            try {
                ed.d dVar2 = (ed.d) this.f4411g.get("ai");
                if (dVar2 != null) {
                    String str = (String) dVar2.get(this.f4414k, TimeUnit.MILLISECONDS);
                    if (!fs1.n(str)) {
                        strU0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (jdVar) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                jdVar.b();
                ((wd) jdVar.f9560c).E(jLongValue);
                String str2 = (String) objArr[1];
                jdVar.b();
                ((wd) jdVar.f9560c).D(str2);
                String str3 = (String) objArr[2];
                jdVar.b();
                ((wd) jdVar.f9560c).N(str3);
                String str4 = (String) objArr[3];
                jdVar.b();
                ((wd) jdVar.f9560c).O(str4);
                i61 i61VarF = i61.f6401f.f();
                byte[] bArr = (byte[]) objArr[4];
                String strG = i61VarF.g(bArr.length, bArr);
                jdVar.b();
                ((wd) jdVar.f9560c).z(strG);
                jdVar.b();
                ((wd) jdVar.f9560c).R0(strU0);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    jdVar.b();
                    ((wd) jdVar.f9560c).s0(i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
