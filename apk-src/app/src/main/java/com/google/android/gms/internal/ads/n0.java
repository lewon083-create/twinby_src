package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Range;
import com.yandex.varioqub.config.model.ConfigValue;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8080d = 15000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f8082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f8083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f8084h;

    public n0(Context context, v0 v0Var) {
        this.f8077a = context.getApplicationContext();
        this.f8081e = v0Var;
        w0 w0Var = new w0();
        Range range = new Range(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), Double.valueOf(1.0d));
        w0Var.f11558d = range;
        w0Var.f11557c = ((Double) range.getUpper()).doubleValue();
        w0Var.f11555a = -9223372036854775807L;
        w0Var.f11556b = -9223372036854775807L;
        this.f8084h = w0Var;
        this.f8083g = c6.f4047g;
    }

    public n0(Context context, o4.r rVar) {
        this.f8077a = context.getApplicationContext();
        this.f8081e = rVar;
        w0 w0Var = new w0();
        Range range = new Range(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), Double.valueOf(1.0d / ((double) 1.0f)));
        w0Var.f11558d = range;
        w0Var.f11557c = ((Double) range.getUpper()).doubleValue();
        w0Var.f11555a = -9223372036854775807L;
        w0Var.f11556b = -9223372036854775807L;
        this.f8084h = w0Var;
        this.f8083g = m3.t.f28598a;
    }
}
