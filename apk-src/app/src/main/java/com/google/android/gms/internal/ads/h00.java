package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h00 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i00 f5994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5998f;

    public /* synthetic */ h00(i00 i00Var, int i, int i10, boolean z5, boolean z10) {
        this.f5994b = i00Var;
        this.f5995c = i;
        this.f5996d = i10;
        this.f5997e = z5;
        this.f5998f = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ?? r10;
        ?? r22;
        q9.c2 c2Var;
        q9.c2 c2Var2;
        q9.c2 c2Var3;
        i00 i00Var = this.f5994b;
        int i10 = this.f5995c;
        int i11 = this.f5996d;
        boolean z5 = this.f5997e;
        boolean z10 = this.f5998f;
        synchronized (i00Var.f6319c) {
            try {
                boolean z11 = i00Var.f6324h;
                if (z11 || i11 != 1) {
                    i = i11;
                    r10 = false;
                } else {
                    i11 = 1;
                    i = 1;
                    r10 = true;
                }
                ?? r12 = i10 != i11;
                if (r12 == true && i == 1) {
                    r22 = true;
                    i = 1;
                } else {
                    r22 = false;
                }
                ?? r122 = r12 == true && i == 2;
                ?? r13 = r12 == true && i == 3;
                i00Var.f6324h = z11 || r10 == true;
                if (r10 != false) {
                    try {
                        q9.c2 c2Var4 = i00Var.f6323g;
                        if (c2Var4 != null) {
                            c2Var4.i();
                        }
                    } catch (RemoteException e3) {
                        u9.i.k("#007 Could not call remote method.", e3);
                    }
                }
                if (r22 != false && (c2Var3 = i00Var.f6323g) != null) {
                    c2Var3.L1(c2Var3.D0(), 2);
                }
                if (r122 != false && (c2Var2 = i00Var.f6323g) != null) {
                    c2Var2.k();
                }
                if (r13 != false) {
                    q9.c2 c2Var5 = i00Var.f6323g;
                    if (c2Var5 != null) {
                        c2Var5.m();
                    }
                    i00Var.f6318b.U();
                }
                if (z5 != z10 && (c2Var = i00Var.f6323g) != null) {
                    Parcel parcelD0 = c2Var.D0();
                    ClassLoader classLoader = vg.f11374a;
                    parcelD0.writeInt(z10 ? 1 : 0);
                    c2Var.L1(parcelD0, 5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
