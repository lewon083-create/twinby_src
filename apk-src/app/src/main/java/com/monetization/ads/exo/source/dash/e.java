package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import yads.ag1;
import yads.bg1;
import yads.c30;
import yads.dg1;
import yads.dn1;
import yads.f30;
import yads.gg1;
import yads.hc2;
import yads.hg1;
import yads.jm1;
import yads.kb3;
import yads.kh1;
import yads.lb3;
import yads.q11;
import yads.q30;
import yads.qb2;
import yads.sb2;
import yads.xf1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ag1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f15034b;

    public e(i iVar) {
        this.f15034b = iVar;
    }

    @Override // yads.ag1
    public final void a(dg1 dg1Var, long j10, long j11, boolean z5) {
        sb2 sb2Var = (sb2) dg1Var;
        i iVar = this.f15034b;
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
        i iVar = this.f15034b;
        iVar.getClass();
        long j12 = sb2Var.f42878a;
        Uri uri = sb2Var.f42881d.f43545c;
        xf1 xf1Var = new xf1();
        iVar.f15042n.getClass();
        dn1 dn1Var = iVar.f15045q;
        dn1Var.b(xf1Var, new jm1(sb2Var.f42880c, -1, null, 0, null, dn1Var.a(-9223372036854775807L), dn1Var.a(-9223372036854775807L)));
        c30 c30Var = (c30) sb2Var.f42883f;
        c30 c30Var2 = iVar.H;
        int size = c30Var2 == null ? 0 : c30Var2.f37264m.size();
        long j13 = ((hc2) c30Var.f37264m.get(0)).f39126b;
        int i = 0;
        while (i < size && ((hc2) iVar.H.f37264m.get(i)).f39126b < j13) {
            i++;
        }
        if (c30Var.f37256d) {
            if (size - i > c30Var.f37264m.size()) {
                kh1.d("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = iVar.N;
                if (j14 != -9223372036854775807L && c30Var.f37260h * 1000 <= j14) {
                    kh1.d("DashMediaSource", "Loaded stale dynamic manifest: " + c30Var.f37260h + ", " + iVar.N);
                } else {
                    iVar.M = 0;
                }
            }
            int i10 = iVar.M;
            iVar.M = i10 + 1;
            if (i10 < iVar.f15042n.a(sb2Var.f42880c)) {
                iVar.D.postDelayed(iVar.f15050v, Math.min((iVar.M - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new f30();
                return;
            }
        }
        iVar.H = c30Var;
        iVar.I = c30Var.f37256d & iVar.I;
        iVar.J = j10 - j11;
        iVar.K = j10;
        synchronized (iVar.f15048t) {
            try {
                if (sb2Var.f42879b.f43533a == iVar.F) {
                    Uri uri2 = iVar.H.f37262k;
                    if (uri2 == null) {
                        uri2 = sb2Var.f42881d.f43545c;
                    }
                    iVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (size == 0) {
            c30 c30Var3 = iVar.H;
            if (c30Var3.f37256d) {
                kb3 kb3Var = c30Var3.i;
                if (kb3Var != null) {
                    String str = kb3Var.f40148a;
                    if (!lb3.a(str, "urn:mpeg:dash:utc:direct:2014") && !lb3.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!lb3.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !lb3.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!lb3.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !lb3.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!lb3.a(str, "urn:mpeg:dash:utc:ntp:2014") && !lb3.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    iVar.a(new IOException("Unsupported UTC timing scheme"));
                                    return;
                                } else {
                                    iVar.g();
                                    return;
                                }
                            }
                            sb2 sb2Var2 = new sb2(iVar.f15054z, Uri.parse(kb3Var.f40149b), 5, new h());
                            iVar.A.a(sb2Var2, new g(iVar), 1);
                            dn1 dn1Var2 = iVar.f15045q;
                            Uri uri3 = sb2Var2.f42879b.f43533a;
                            dn1Var2.c(new xf1(), new jm1(sb2Var2.f42880c, -1, null, 0, null, dn1Var2.a(-9223372036854775807L), dn1Var2.a(-9223372036854775807L)));
                            return;
                        }
                        sb2 sb2Var3 = new sb2(iVar.f15054z, Uri.parse(kb3Var.f40149b), 5, new d());
                        iVar.A.a(sb2Var3, new g(iVar), 1);
                        dn1 dn1Var3 = iVar.f15045q;
                        Uri uri4 = sb2Var3.f42879b.f43533a;
                        dn1Var3.c(new xf1(), new jm1(sb2Var3.f42880c, -1, null, 0, null, dn1Var3.a(-9223372036854775807L), dn1Var3.a(-9223372036854775807L)));
                        return;
                    }
                    try {
                        iVar.L = lb3.f(kb3Var.f40149b) - iVar.K;
                        iVar.a(true);
                        return;
                    } catch (qb2 e3) {
                        iVar.a(e3);
                        return;
                    }
                }
                iVar.g();
                return;
            }
            iVar.a(true);
            return;
        }
        iVar.O += i;
        iVar.a(true);
    }

    @Override // yads.ag1
    public final bg1 a(dg1 dg1Var, long j10, long j11, IOException iOException, int i) {
        long jMin;
        bg1 bg1Var;
        sb2 sb2Var = (sb2) dg1Var;
        i iVar = this.f15034b;
        iVar.getClass();
        long j12 = sb2Var.f42878a;
        Uri uri = sb2Var.f42881d.f43545c;
        xf1 xf1Var = new xf1();
        iVar.f15042n.getClass();
        boolean z5 = true;
        if ((iOException instanceof qb2) || (iOException instanceof FileNotFoundException) || (iOException instanceof q11) || (iOException instanceof gg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i10 = q30.f42159c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof q30) && ((q30) cause).f42160b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            bg1Var = hg1.f39172e;
        } else {
            bg1Var = new bg1(0, jMin);
        }
        int i11 = bg1Var.f37011a;
        if (i11 != 0 && i11 != 1) {
            z5 = false;
        }
        dn1 dn1Var = iVar.f15045q;
        dn1Var.a(xf1Var, new jm1(sb2Var.f42880c, -1, null, 0, null, dn1Var.a(-9223372036854775807L), dn1Var.a(-9223372036854775807L)), iOException, !z5);
        if (!z5) {
            iVar.f15042n.getClass();
        }
        return bg1Var;
    }
}
