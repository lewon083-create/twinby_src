package cj;

import ad.b1;
import ad.j0;
import android.content.Context;
import com.google.android.gms.internal.ads.yf0;
import com.google.android.gms.internal.measurement.h5;
import fj.o0;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import j3.f0;
import j3.p0;
import j3.q0;
import j3.t0;
import j3.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import ni.x0;
import s3.e0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class y implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe.c f2365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f2366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0.y f2367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s3.l f2368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l4.p f2369f;

    public y(fe.c cVar, j3.x xVar, fd.b bVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, dj.d dVar) {
        s3.y yVarA;
        this.f2365b = cVar;
        this.f2366c = textureRegistry$SurfaceProducer;
        switch (dVar.f15807a) {
            case 0:
                Context context = dVar.f15808b;
                x xVar2 = dVar.f15809c;
                l4.p pVar = new l4.p(context);
                s3.j jVar = new s3.j(context);
                h5.r(!jVar.f32579v);
                jVar.f32563e = new i4.p(2, pVar);
                i4.b0 b0VarB = xVar2.b(context);
                h5.r(!jVar.f32579v);
                jVar.f32562d = new i4.p(3, b0VarB);
                yVarA = jVar.a();
                break;
            default:
                Context context2 = dVar.f15808b;
                x xVar3 = dVar.f15809c;
                l4.p pVar2 = new l4.p(context2);
                s3.j jVar2 = new s3.j(context2);
                h5.r(!jVar2.f32579v);
                jVar2.f32563e = new i4.p(2, pVar2);
                i4.b0 b0VarB2 = xVar3.b(context2);
                h5.r(!jVar2.f32579v);
                jVar2.f32562d = new i4.p(3, b0VarB2);
                yVarA = jVar2.a();
                break;
        }
        this.f2368e = yVarA;
        yVarA.n0();
        l4.u uVar = yVarA.f32701j;
        if (uVar instanceof l4.p) {
            yVarA.n0();
            this.f2369f = (l4.p) uVar;
        }
        b1 b1VarW = j0.w(xVar);
        yVarA.n0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b1VarW.f770e; i++) {
            arrayList.add(yVarA.f32713s.d((j3.x) b1VarW.get(i)));
        }
        yVarA.c0(arrayList);
        ((s3.y) this.f2368e).X();
        s3.l lVar = this.f2368e;
        ((s3.y) lVar).f32708n.a(a(lVar, textureRegistry$SurfaceProducer));
        s3.l lVar2 = this.f2368e;
        boolean z5 = bVar.f16748a;
        j3.d dVar2 = new j3.d(3);
        int i10 = !z5 ? 1 : 0;
        s3.y yVar = (s3.y) lVar2;
        yf0 yf0Var = yVar.f32708n;
        yVar.n0();
        if (yVar.f32698g0) {
            return;
        }
        if (!Objects.equals(yVar.f32687a0, dVar2)) {
            yVar.f32687a0 = dVar2;
            yVar.b0(1, 3, dVar2);
            yf0Var.c(20, new x0(28, dVar2));
        }
        e0 e0Var = yVar.f32707m;
        j3.d dVar3 = yVar.f32687a0;
        m3.v vVar = e0Var.i;
        vVar.getClass();
        m3.u uVarB = m3.v.b();
        uVarB.f28599a = vVar.f28601a.obtainMessage(31, i10, 0, dVar3);
        uVarB.b();
        yf0Var.b();
    }

    public abstract h a(s3.l lVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void b() {
        a0.y yVar = this.f2367d;
        if (yVar != null) {
            ii.f fVar = (ii.f) yVar.f273c;
            String str = (String) yVar.f274d;
            b0.y1.getClass();
            a0.b(fVar, null, str);
        }
        ((s3.y) this.f2368e).Y();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final cj.o e() {
        /*
            r22 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r22
            s3.l r2 = r1.f2368e
            s3.y r2 = (s3.y) r2
            r2.n0()
            s3.u0 r2 = r2.f32702j0
            l4.v r2 = r2.i
            j3.u0 r2 = r2.f27922d
            r4 = 0
        L15:
            ad.j0 r5 = r2.f26402a
            int r5 = r5.size()
            if (r4 >= r5) goto L97
            ad.j0 r5 = r2.f26402a
            java.lang.Object r5 = r5.get(r4)
            j3.t0 r5 = (j3.t0) r5
            j3.p0 r6 = r5.f26392b
            int r6 = r6.f26353c
            r7 = 1
            if (r6 != r7) goto L91
            r6 = 0
        L2d:
            int r7 = r5.f26391a
            if (r6 >= r7) goto L91
            j3.p0 r7 = r5.f26392b
            j3.o[] r7 = r7.f26354d
            r7 = r7[r6]
            boolean[] r8 = r5.f26395e
            boolean r16 = r8[r6]
            cj.g r9 = new cj.g
            long r10 = (long) r4
            long r12 = (long) r6
            java.lang.String r14 = r7.f26324b
            java.lang.String r15 = r7.f26326d
            int r8 = r7.f26331j
            r3 = -1
            r17 = 0
            r21 = r4
            if (r8 == r3) goto L52
            long r3 = (long) r8
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L54
        L52:
            r3 = r17
        L54:
            int r4 = r7.G
            r8 = -1
            r18 = r9
            if (r4 == r8) goto L61
            long r8 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            goto L63
        L61:
            r4 = r17
        L63:
            int r8 = r7.F
            r9 = -1
            if (r8 == r9) goto L70
            long r8 = (long) r8
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r19 = r8
            goto L72
        L70:
            r19 = r17
        L72:
            java.lang.String r7 = r7.f26332k
            if (r7 == 0) goto L7f
            r20 = r7
            r17 = r3
            r9 = r18
        L7c:
            r18 = r4
            goto L86
        L7f:
            r20 = r17
            r9 = r18
            r17 = r3
            goto L7c
        L86:
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r20)
            r0.add(r9)
            int r6 = r6 + 1
            r4 = r21
            goto L2d
        L91:
            r21 = r4
            int r4 = r21 + 1
            goto L15
        L97:
            cj.o r2 = new cj.o
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.y.e():cj.o");
    }

    public final void f(long j10, long j11) {
        int i;
        l4.j jVar;
        l4.j jVar2;
        l4.p pVar = this.f2369f;
        if (pVar == null) {
            throw new IllegalStateException("Cannot select audio track: track selector is null");
        }
        s3.y yVar = (s3.y) this.f2368e;
        yVar.n0();
        u0 u0Var = yVar.f32702j0.i.f27922d;
        if (j10 < 0 || j10 >= u0Var.f26402a.size()) {
            StringBuilder sbN = gf.a.n("Cannot select audio track: groupIndex ", " is out of bounds (available groups: ", j10);
            sbN.append(u0Var.f26402a.size());
            sbN.append(")");
            throw new IllegalArgumentException(sbN.toString());
        }
        t0 t0Var = (t0) u0Var.f26402a.get((int) j10);
        p0 p0Var = t0Var.f26392b;
        int i10 = t0Var.f26391a;
        if (p0Var.f26353c != 1) {
            throw new IllegalArgumentException(t.z.d(t0Var.f26392b.f26353c, ")", gf.a.n("Cannot select audio track: group at index ", " is not an audio track (type: ", j10)));
        }
        if (j11 < 0 || (i = (int) j11) >= i10) {
            throw new IllegalArgumentException("Cannot select audio track: trackIndex " + j11 + " is out of bounds (available tracks in group: " + i10 + ")");
        }
        q0 q0Var = new q0(p0Var, i);
        p0 p0Var2 = q0Var.f26357a;
        synchronized (pVar.f27902c) {
            jVar = pVar.f27905f;
        }
        jVar.getClass();
        l4.i iVar = new l4.i(jVar);
        int i11 = p0Var2.f26353c;
        Iterator it = iVar.f9974l.values().iterator();
        while (it.hasNext()) {
            if (((q0) it.next()).f26357a.f26353c == i11) {
                it.remove();
            }
        }
        iVar.f9974l.put(p0Var2, q0Var);
        l4.j jVar3 = new l4.j(iVar);
        pVar.h(jVar3);
        synchronized (pVar.f27902c) {
            jVar2 = pVar.f27905f;
        }
        l4.i iVar2 = new l4.i(jVar2);
        iVar2.a(jVar3);
        pVar.h(new l4.j(iVar2));
    }

    public final void g(boolean z5) {
        int i = z5 ? 2 : 0;
        s3.y yVar = (s3.y) this.f2368e;
        yf0 yf0Var = yVar.f32708n;
        yVar.n0();
        if (yVar.I != i) {
            yVar.I = i;
            m3.v vVar = yVar.f32707m.i;
            vVar.getClass();
            m3.u uVarB = m3.v.b();
            uVarB.f28599a = vVar.f28601a.obtainMessage(11, i, 0);
            uVarB.b();
            yf0Var.c(8, new o0(i, 2));
            yVar.j0();
            yf0Var.b();
        }
    }

    public final void h(double d10) {
        f0 f0Var = new f0((float) d10);
        s3.y yVar = (s3.y) this.f2368e;
        yVar.n0();
        if (yVar.f32702j0.f32670o.equals(f0Var)) {
            return;
        }
        s3.u0 u0VarG = yVar.f32702j0.g(f0Var);
        yVar.J++;
        yVar.f32707m.i.a(4, f0Var).b();
        yVar.l0(u0VarG, 0, false, 5, -9223372036854775807L, -1);
    }
}
