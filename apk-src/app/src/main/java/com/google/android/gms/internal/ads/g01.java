package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g01 extends l01 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5588g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5589h;

    public g01(jd jdVar, wz0 wz0Var, ux0 ux0Var, j21 j21Var) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", jdVar, wz0Var, j21Var.a(116));
        this.f5589h = ux0Var;
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final void a(Method method, jd jdVar) {
        switch (this.f5588g) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", ((ux0) this.f5589h).F());
                objArr.getClass();
                synchronized (jdVar) {
                    String str = (String) objArr[0];
                    jdVar.b();
                    ((wd) jdVar.f9560c).E0(str);
                    String str2 = (String) objArr[1];
                    jdVar.b();
                    ((wd) jdVar.f9560c).k0(str2);
                    break;
                }
                return;
            default:
                Map map = (Map) this.f5589h;
                Object[] objArr2 = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr2.getClass();
                synchronized (jdVar) {
                    long jLongValue = ((Long) objArr2[0]).longValue();
                    jdVar.b();
                    ((wd) jdVar.f9560c).I0(jLongValue);
                    long jLongValue2 = ((Long) objArr2[1]).longValue();
                    if (jLongValue2 >= 0) {
                        jdVar.b();
                        ((wd) jdVar.f9560c).g0(jLongValue2);
                    }
                    long jLongValue3 = ((Long) objArr2[2]).longValue();
                    if (jLongValue3 >= 0) {
                        jdVar.b();
                        ((wd) jdVar.f9560c).h0(jLongValue3);
                    }
                    break;
                }
                return;
        }
    }

    public g01(jd jdVar, wz0 wz0Var, Map map, j21 j21Var) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", jdVar, wz0Var, j21Var.a(118));
        this.f5589h = map;
    }
}
