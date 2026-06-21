package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s11 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t11 f10156c;

    public /* synthetic */ s11(t11 t11Var, int i) {
        this.f10155b = i;
        this.f10156c = t11Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10155b) {
            case 0:
                a11 a11Var = this.f10156c.f10464a;
                bz0 bz0VarB = a11Var.b(1);
                if (bz0VarB == null) {
                    a11Var.f2719e.b(15315);
                    return null;
                }
                String strZ = bz0VarB.z().z();
                File fileB = ix.b(strZ, "pcam.jar", a11Var.c());
                fileB.getClass();
                if (!fileB.exists()) {
                    fileB = ix.b(strZ, "pcam", a11Var.c());
                    fileB.getClass();
                }
                File fileB2 = ix.b(strZ, "pcopt", a11Var.c());
                fileB2.getClass();
                File fileB3 = ix.b(strZ, "pcbc", a11Var.c());
                fileB3.getClass();
                return new vv0(bz0VarB.z(), fileB, fileB3, fileB2);
            default:
                bz0 bz0VarB2 = this.f10156c.f10464a.b(1);
                return bz0VarB2 == null ? bz0.E() : bz0VarB2;
        }
    }
}
