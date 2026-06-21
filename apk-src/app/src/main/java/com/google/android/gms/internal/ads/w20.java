package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9.e0 f11597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh0 f11598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bd0 f11599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r81 f11600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r81 f11601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f11602g;

    public w20(Context context, t9.e0 e0Var, xh0 xh0Var, bd0 bd0Var, r81 r81Var, r81 r81Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f11596a = context;
        this.f11597b = e0Var;
        this.f11598c = xh0Var;
        this.f11599d = bd0Var;
        this.f11600e = r81Var;
        this.f11601f = r81Var2;
        this.f11602g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) q9.s.f31967e.f31970c.a(al.f3215tb));
    }

    public final ed.d a(String str, Random random) {
        return TextUtils.isEmpty(str) ? vv.d(str) : vv.H(c(str, this.f11599d.f3763a, random), Throwable.class, new to(this, str, 1), this.f11600e);
    }

    public final ed.d c(String str, MotionEvent motionEvent, Random random) {
        Exception exc;
        wk wkVar;
        yk ykVar;
        yk ykVar2;
        ed.d dVarY;
        try {
            wkVar = al.f3215tb;
            q9.s sVar = q9.s.f31967e;
            ykVar = sVar.f31970c;
            ykVar2 = sVar.f31970c;
        } catch (Exception e3) {
            e = e3;
        }
        try {
            if (!str.contains((CharSequence) ykVar.a(wkVar)) || this.f11597b.t()) {
                return vv.d(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) ykVar2.a(al.f3230ub), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent != null) {
                xh0 xh0Var = this.f11598c;
                xh0Var.getClass();
                try {
                    e6.c cVarB = e6.c.b(xh0Var.f12155b);
                    xh0Var.f12154a = cVarB;
                    dVarY = cVarB == null ? vv.y(new IllegalStateException("MeasurementManagerFutures is null")) : cVarB.c();
                } catch (Exception e7) {
                    dVarY = vv.y(e7);
                }
                return vv.H(vv.J(i81.s(dVarY), new yq((Object) this, (Object) builderBuildUpon, str, (Object) motionEvent, 1), this.f11601f), Throwable.class, new zq(2, this, builderBuildUpon), this.f11600e);
            }
            try {
                builderBuildUpon.appendQueryParameter((String) ykVar2.a(al.f3243vb), "11");
                return vv.d(builderBuildUpon.toString());
            } catch (Exception e10) {
                exc = e10;
            }
        } catch (Exception e11) {
            e = e11;
            exc = e;
        }
        exc = e;
        return vv.y(exc);
    }
}
