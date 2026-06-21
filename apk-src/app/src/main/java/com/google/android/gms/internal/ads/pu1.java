package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pu1 extends wx1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9188c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9189d;

    public pu1(ci ciVar, n5 n5Var) {
        super(ciVar);
        this.f9189d = n5Var;
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.ci
    public nh b(int i, nh nhVar, long j10) {
        switch (this.f9188c) {
            case 1:
                this.f11916b.b(i, nhVar, j10);
                n5 n5Var = (n5) this.f9189d;
                nhVar.f8299b = n5Var;
                q2 q2Var = n5Var.f8193b;
                return nhVar;
            default:
                return super.b(i, nhVar, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.ci
    public bh d(int i, bh bhVar, boolean z5) {
        switch (this.f9188c) {
            case 0:
                ci ciVar = this.f11916b;
                bh bhVarD = ciVar.d(i, bhVar, z5);
                if (ciVar.b(bhVarD.f3786c, (nh) this.f9189d, 0L).b()) {
                    Object obj = bhVar.f3784a;
                    Object obj2 = bhVar.f3785b;
                    int i10 = bhVar.f3786c;
                    long j10 = bhVar.f3787d;
                    ou ouVar = ou.f8799b;
                    bhVarD.a(obj, obj2, i10, j10, true);
                } else {
                    bhVarD.f3788e = true;
                }
                return bhVarD;
            default:
                return super.d(i, bhVar, z5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu1(qu1 qu1Var, ci ciVar) {
        super(ciVar);
        Objects.requireNonNull(qu1Var);
        this.f9189d = new nh();
    }
}
