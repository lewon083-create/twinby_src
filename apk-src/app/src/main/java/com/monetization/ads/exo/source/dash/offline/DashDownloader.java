package com.monetization.ads.exo.source.dash.offline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import yads.c30;
import yads.e30;
import yads.ev0;
import yads.hc2;
import yads.hm1;
import yads.lb3;
import yads.px2;
import yads.qr;
import yads.rr;
import yads.vo;
import yads.zb;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class DashDownloader extends px2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vo f15055j;

    public DashDownloader(hm1 hm1Var, qr qrVar, Executor executor) {
        this(hm1Var, new e30(), qrVar, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(yads.rr r22, yads.zb r23, long r24, long r26, boolean r28, java.util.ArrayList r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.source.dash.offline.DashDownloader.a(yads.rr, yads.zb, long, long, boolean, java.util.ArrayList):void");
    }

    public DashDownloader(hm1 hm1Var, e30 e30Var, qr qrVar, Executor executor) {
        super(hm1Var, e30Var, qrVar, executor);
        this.f15055j = new vo();
    }

    @Override // yads.px2
    public final ArrayList a(rr rrVar, ev0 ev0Var, boolean z5) throws IOException {
        c30 c30Var = (c30) ev0Var;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c30Var.f37264m.size(); i++) {
            hc2 hc2Var = (hc2) c30Var.f37264m.get(i);
            long jA = lb3.a(hc2Var.f39126b);
            long jA2 = lb3.a(c30Var.b(i));
            List list = hc2Var.f39127c;
            for (int i10 = 0; i10 < list.size(); i10++) {
                a(rrVar, (zb) list.get(i10), jA, jA2, z5, arrayList);
            }
        }
        return arrayList;
    }
}
