package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb0 implements o00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xb0 f11739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz f11740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni f11741e;

    public /* synthetic */ wb0(xb0 xb0Var, sz szVar, ni niVar, int i) {
        this.f11738b = i;
        this.f11739c = xb0Var;
        this.f11740d = szVar;
        this.f11741e = niVar;
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final void b(int i, String str, String str2, boolean z5) {
        switch (this.f11738b) {
            case 0:
                xb0 xb0Var = this.f11739c;
                ni niVar = this.f11741e;
                if (!z5) {
                    xb0Var.getClass();
                    int length = String.valueOf(i).length();
                    StringBuilder sb2 = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Html video Web View failed to load. Error code: ");
                    sb2.append(i);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    niVar.d(new rj0(1, a0.u.o(sb2, ", Failing URL: ", str2)));
                } else {
                    q9.b3 b3Var = xb0Var.f12099a.f6569a;
                    if (b3Var != null) {
                        sz szVar = this.f11740d;
                        if (szVar.m() != null) {
                            szVar.m().m4(b3Var);
                        }
                    }
                    niVar.e();
                }
                break;
            default:
                xb0 xb0Var2 = this.f11739c;
                xb0Var2.getClass();
                iq0 iq0Var = xb0Var2.f12099a;
                boolean zBooleanValue = ((Boolean) q9.s.f31967e.f31970c.a(al.E4)).booleanValue();
                sz szVar2 = this.f11740d;
                ni niVar2 = this.f11741e;
                if (!zBooleanValue) {
                    q9.b3 b3Var2 = iq0Var.f6569a;
                    if (b3Var2 != null && szVar2.m() != null) {
                        szVar2.m().m4(b3Var2);
                    }
                    niVar2.e();
                } else if (!z5) {
                    int length2 = String.valueOf(i).length();
                    StringBuilder sb3 = new StringBuilder(length2 + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb3.append("Native Video WebView failed to load. Error code: ");
                    sb3.append(i);
                    sb3.append(", Description: ");
                    sb3.append(str);
                    niVar2.d(new rj0(1, a0.u.o(sb3, ", Failing URL: ", str2)));
                } else {
                    q9.b3 b3Var3 = iq0Var.f6569a;
                    if (b3Var3 != null && szVar2.m() != null) {
                        szVar2.m().m4(b3Var3);
                    }
                    niVar2.e();
                }
                break;
        }
    }
}
