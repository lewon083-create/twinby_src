package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class dv0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile int f4679e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f4681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Task f4682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4683d;

    public dv0(Context context, Executor executor, sb.m mVar, boolean z5) {
        this.f4680a = context;
        this.f4681b = executor;
        this.f4682c = mVar;
        this.f4683d = z5;
    }

    public static dv0 a(Context context, Executor executor, boolean z5) {
        sb.g gVar = new sb.g();
        if (z5) {
            executor.execute(new th0(14, context, gVar));
        } else {
            executor.execute(new kr0(4, gVar));
        }
        return new dv0(context, executor, gVar.f32858a, z5);
    }

    public void b(int i, long j10) {
        e(i, j10, null, null, null);
    }

    public void c(int i, long j10, Exception exc) {
        e(i, j10, exc, null, null);
    }

    public void d(int i, String str) {
        e(i, 0L, null, null, str);
    }

    public final Task e(int i, long j10, Exception exc, String str, String str2) {
        if (!this.f4683d) {
            return this.f4682c.e(this.f4681b, mp0.f7966d);
        }
        Context context = this.f4680a;
        bd bdVarZ = ed.z();
        String packageName = context.getPackageName();
        bdVarZ.b();
        ((ed) bdVarZ.f9560c).A(packageName);
        bdVarZ.b();
        ((ed) bdVarZ.f9560c).B(j10);
        int i10 = f4679e;
        bdVarZ.b();
        ((ed) bdVarZ.f9560c).G(i10);
        if (exc != null) {
            Object obj = r31.f9693a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            bdVarZ.b();
            ((ed) bdVarZ.f9560c).C(string);
            String name = exc.getClass().getName();
            bdVarZ.b();
            ((ed) bdVarZ.f9560c).D(name);
        }
        if (str2 != null) {
            bdVarZ.b();
            ((ed) bdVarZ.f9560c).E(str2);
        }
        if (str != null) {
            bdVarZ.b();
            ((ed) bdVarZ.f9560c).F(str);
        }
        return this.f4682c.e(this.f4681b, new d8.e0(bdVarZ, i, 9));
    }
}
