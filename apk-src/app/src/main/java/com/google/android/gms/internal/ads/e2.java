package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements td0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4793b = Long.MIN_VALUE;

    @Override // com.google.android.gms.internal.ads.td0
    /* JADX INFO: renamed from: a */
    public void mo0a(Object obj) {
        pp0 pp0Var;
        g1 g1Var;
        Handler handler;
        iw1 iw1Var = (iw1) obj;
        long j10 = this.f4793b;
        nw1 nw1Var = iw1Var.f6633b;
        if (!iw1Var.equals(nw1Var.f8469h) || (pp0Var = nw1Var.f8472l) == null || (handler = (g1Var = ((pw1) pp0Var.f9149c).B0).f5590a) == null) {
            return;
        }
        handler.post(new tv1(g1Var, j10));
    }

    public j3.r b() {
        return new j3.r(this);
    }

    public long c(ByteBuffer byteBuffer) {
        mb mbVar;
        lb lbVar;
        long j10 = this.f4793b;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            jb jbVar = new jb(new ly(byteBufferDuplicate), ny.f8495c);
            ArrayList arrayList = jbVar.f5065g;
            List hs1Var = arrayList;
            if (jbVar.f5061c != null) {
                hs1Var = arrayList;
                if (jbVar.f5062d != es1.f5059h) {
                    hs1Var = new hs1(arrayList, jbVar);
                }
            }
            Iterator it = hs1Var.iterator();
            while (true) {
                mbVar = null;
                if (!it.hasNext()) {
                    lbVar = null;
                    break;
                }
                kb kbVar = (kb) it.next();
                if (kbVar instanceof lb) {
                    lbVar = (lb) kbVar;
                    break;
                }
            }
            ArrayList arrayList2 = lbVar.f5065g;
            List hs1Var2 = arrayList2;
            if (lbVar.f5061c != null) {
                hs1Var2 = arrayList2;
                if (lbVar.f5062d != es1.f5059h) {
                    hs1Var2 = new hs1(arrayList2, lbVar);
                }
            }
            Iterator it2 = hs1Var2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                kb kbVar2 = (kb) it2.next();
                if (kbVar2 instanceof mb) {
                    mbVar = (mb) kbVar2;
                    break;
                }
            }
            long j11 = (mbVar.f7837n * 1000) / mbVar.f7836m;
            this.f4793b = j11;
            return j11;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
