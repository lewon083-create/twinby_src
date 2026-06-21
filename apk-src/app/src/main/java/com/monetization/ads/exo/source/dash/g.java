package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.IOException;
import yads.ag1;
import yads.bg1;
import yads.dg1;
import yads.dn1;
import yads.hg1;
import yads.jm1;
import yads.sb2;
import yads.xf1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ag1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15036b;

    public g(i iVar) {
        this.f15036b = iVar;
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11, boolean z5) {
        sb2 sb2Var = (sb2) dg1Var;
        i iVar = this.f15036b;
        iVar.getClass();
        long j12 = sb2Var.f42878a;
        Uri uri = sb2Var.f42881d.f43545c;
        xf1 xf1Var = new xf1();
        iVar.f15042n.getClass();
        dn1 dn1Var = iVar.f15045q;
        dn1Var.a(xf1Var, new jm1(sb2Var.f42880c, -1, null, 0, null, dn1Var.a(-9223372036854775807L), dn1Var.a(-9223372036854775807L)));
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11) {
        sb2 sb2Var = (sb2) dg1Var;
        i iVar = this.f15036b;
        iVar.getClass();
        long j12 = sb2Var.f42878a;
        Uri uri = sb2Var.f42881d.f43545c;
        xf1 xf1Var = new xf1();
        iVar.f15042n.getClass();
        dn1 dn1Var = iVar.f15045q;
        dn1Var.b(xf1Var, new jm1(sb2Var.f42880c, -1, null, 0, null, dn1Var.a(-9223372036854775807L), dn1Var.a(-9223372036854775807L)));
        iVar.L = ((Long) sb2Var.f42883f).longValue() - j10;
        iVar.a(true);
    }

    @Override // yads.ag1
    public final bg1 a(dg1 dg1Var, long j10, long j11, IOException iOException, int i) {
        sb2 sb2Var = (sb2) dg1Var;
        i iVar = this.f15036b;
        dn1 dn1Var = iVar.f15045q;
        long j12 = sb2Var.f42878a;
        Uri uri = sb2Var.f42881d.f43545c;
        dn1Var.a(new xf1(), new jm1(sb2Var.f42880c, -1, null, 0, null, dn1Var.a(-9223372036854775807L), dn1Var.a(-9223372036854775807L)), iOException, true);
        iVar.f15042n.getClass();
        iVar.a(iOException);
        return hg1.f39171d;
    }
}
