package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g11 implements c11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w11 f5595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v11 f5596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f5597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z11 f5598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j21 f5599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5600f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5602h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m6 f5603j;

    public g11(w11 w11Var, v11 v11Var, z11 z11Var, j21 j21Var, ux0 ux0Var, ExecutorService executorService) {
        this.f5595a = w11Var;
        this.f5596b = v11Var;
        this.f5597c = executorService;
        this.f5598d = z11Var;
        this.f5599e = j21Var;
        this.f5601g = ux0Var.F();
        this.f5602h = ux0Var.N();
        this.i = ux0Var.M();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final c91 a(Context context) {
        return vv.B(new je(13, this, context), this.f5597c);
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final c91 b(Context context, View view, Activity activity) {
        return vv.B(new lb0(this, context, view, activity, 4), this.f5597c);
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void c(InputEvent inputEvent) {
        try {
            synchronized (this.f5600f) {
                try {
                    m6 m6Var = this.f5603j;
                    if (m6Var != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        ((ac.c) m6Var.f7790d).y(m6Var.f7789c, Optional.of(map));
                    } else {
                        this.f5599e.b(20105);
                    }
                } finally {
                }
            }
        } catch (pb | sb e3) {
            this.f5599e.d(e3, 20104);
        }
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final c91 d(Context context, String str, View view) {
        return vv.B(new lb0(this, context, str, view, 5), this.f5597c);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.util.HashMap r13) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g11.e(java.util.HashMap):void");
    }

    public final String f(HashMap map) {
        String strG;
        j21 j21Var = this.f5599e;
        try {
            j21Var.a(20110).a();
            synchronized (this.f5600f) {
                try {
                    m6 m6Var = this.f5603j;
                    if (m6Var == null) {
                        j21Var.b(20109);
                        strG = "";
                    } else {
                        byte[] bArr = (byte[]) ((ac.c) m6Var.f7790d).y(m6Var.f7788b, Optional.of(map));
                        g61 g61Var = i61.f6400e;
                        if (g61Var.f6403b != null) {
                            g61Var = new g61(g61Var.f6402a, (Character) null);
                        }
                        strG = g61Var.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return strG;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final String h() {
        synchronized (this.f5600f) {
            try {
                m6 m6Var = this.f5603j;
                if (m6Var == null) {
                    return "3.825731049.-1";
                }
                return (String) m6Var.f7791e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final i81 j() {
        i81 i81VarS = i81.s(this.f5596b.j());
        f11 f11Var = f11.f5172b;
        ExecutorService executorService = this.f5597c;
        return vv.J(vv.G(i81VarS, Throwable.class, f11Var, executorService), new np(17, this), executorService);
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final int k() {
        return 4;
    }
}
