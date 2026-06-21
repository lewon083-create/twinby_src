package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f10913c = new ConditionVariable();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile dw0 f10914d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Random f10915e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf f10916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f10917b;

    public ue(qf qfVar) {
        this.f10916a = qfVar;
        qfVar.f9476b.execute(new s(5, this));
    }

    public final void a(int i, int i10, long j10, String str, Exception exc) {
        try {
            f10913c.block();
            if (!this.f10917b.booleanValue() || f10914d == null) {
                return;
            }
            bd bdVarZ = ed.z();
            String packageName = this.f10916a.f9475a.getPackageName();
            bdVarZ.b();
            ((ed) bdVarZ.f9560c).A(packageName);
            bdVarZ.b();
            ((ed) bdVarZ.f9560c).B(j10);
            if (str != null) {
                bdVarZ.b();
                ((ed) bdVarZ.f9560c).E(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                bdVarZ.b();
                ((ed) bdVarZ.f9560c).C(string);
                String name = exc.getClass().getName();
                bdVarZ.b();
                ((ed) bdVarZ.f9560c).D(name);
            }
            dw0 dw0Var = f10914d;
            byte[] bArrB = ((ed) bdVarZ.d()).b();
            dw0Var.getClass();
            q5 q5Var = new q5(dw0Var, bArrB);
            q5Var.f9333b = i;
            if (i10 != -1) {
                q5Var.f9332a = i10;
            }
            q5Var.a();
        } catch (Exception unused) {
        }
    }
}
