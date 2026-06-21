package cj;

import j3.e0;
import j3.h0;
import j3.j0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2332a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s3.l f2333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fe.c f2334c;

    public h(s3.l lVar, fe.c cVar) {
        this.f2333b = lVar;
        this.f2334c = cVar;
    }

    public abstract void c();

    @Override // j3.h0
    public final void onIsPlayingChanged(boolean z5) {
        a1.e eVar = (a1.e) this.f2334c.f16785c;
        ((ArrayList) eVar.f324d).add(new k(z5));
        eVar.O();
    }

    @Override // j3.h0
    public final void onPlaybackStateChanged(int i) {
        p pVar = p.f2352h;
        if (i == 1) {
            pVar = p.f2348d;
        } else if (i == 2) {
            pVar = p.f2349e;
        } else if (i == 3) {
            pVar = p.f2350f;
            if (!this.f2332a) {
                this.f2332a = true;
                c();
            }
        } else if (i == 4) {
            pVar = p.f2351g;
        }
        a1.e eVar = (a1.e) this.f2334c.f16785c;
        ((ArrayList) eVar.f324d).add(new u(pVar));
        eVar.O();
    }

    @Override // j3.h0
    public final void onPlayerError(e0 e0Var) {
        if (e0Var.f26229b == 1002) {
            j0 j0Var = this.f2333b;
            e1.d0 d0Var = (e1.d0) j0Var;
            d0Var.getClass();
            d0Var.w(((s3.y) d0Var).I(), -9223372036854775807L);
            ((s3.y) j0Var).X();
            return;
        }
        a1.e eVar = (a1.e) this.f2334c.f16785c;
        v vVar = new v();
        vVar.f2361a = "Video player had error " + e0Var;
        ((ArrayList) eVar.f324d).add(vVar);
        eVar.O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        continue;
     */
    @Override // j3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(j3.u0 r9) {
        /*
            r8 = this;
            ad.j0 r9 = r9.f26402a
            r0 = 0
            ad.h0 r9 = r9.listIterator(r0)
            r1 = r0
        L8:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r9.next()
            j3.t0 r2 = (j3.t0) r2
            j3.p0 r3 = r2.f26392b
            boolean[] r4 = r2.f26395e
            int r3 = r3.f26353c
            r5 = 1
            if (r3 != r5) goto L49
            int r3 = r4.length
            r6 = r0
        L1f:
            if (r6 >= r3) goto L49
            boolean r7 = r4[r6]
            if (r7 != r5) goto L46
            r3 = r0
        L26:
            int r5 = r2.f26391a
            if (r3 >= r5) goto L49
            boolean r5 = r4[r3]
            if (r5 == 0) goto L43
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r0 = "_"
            r9.append(r0)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            goto L4d
        L43:
            int r3 = r3 + 1
            goto L26
        L46:
            int r6 = r6 + 1
            goto L1f
        L49:
            int r1 = r1 + 1
            goto L8
        L4c:
            r9 = 0
        L4d:
            fe.c r0 = r8.f2334c
            java.lang.Object r0 = r0.f16785c
            a1.e r0 = (a1.e) r0
            cj.d r1 = new cj.d
            r1.<init>(r9)
            java.lang.Object r9 = r0.f324d
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r1)
            r0.O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.h.q(j3.u0):void");
    }
}
