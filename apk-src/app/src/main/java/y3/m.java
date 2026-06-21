package y3;

import i4.b1;
import java.io.IOException;
import java.util.ArrayList;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f36390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36391d = -1;

    public m(q qVar, int i) {
        this.f36390c = qVar;
        this.f36389b = i;
    }

    @Override // i4.b1
    public final void a() throws IOException {
        int i = this.f36391d;
        q qVar = this.f36390c;
        if (i == -2) {
            qVar.d();
            throw new androidx.datastore.preferences.protobuf.m(pe.a.f("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.J.a(this.f36389b).f26354d[0].f26335n, "."));
        }
        if (i == -1) {
            qVar.w();
        } else if (i != -3) {
            qVar.w();
            qVar.f36421w[i].z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r6 = this;
            int r0 = r6.f36391d
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.gms.internal.measurement.h5.h(r0)
            y3.q r0 = r6.f36390c
            r0.d()
            int[] r3 = r0.L
            r3.getClass()
            int[] r3 = r0.L
            int r4 = r6.f36389b
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.K
            i4.j1 r0 = r0.J
            j3.p0 r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.O
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.f36391d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.m.b():void");
    }

    public final boolean c() {
        int i = this.f36391d;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // i4.b1
    public final int d(r3.b bVar, r3.e eVar, int i) {
        j3.o oVar;
        if (this.f36391d == -3) {
            eVar.a(4);
            return -4;
        }
        if (c()) {
            int i10 = this.f36391d;
            q qVar = this.f36390c;
            ArrayList arrayList = qVar.f36413o;
            if (!qVar.u()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((j) arrayList.get(i12)).f36341l;
                        int length = qVar.f36421w.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (qVar.O[i14] && qVar.f36421w[i14].B() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    z.R(arrayList, 0, i12);
                    j jVar = (j) arrayList.get(0);
                    j3.o oVar2 = jVar.f26472e;
                    if (!oVar2.equals(qVar.H)) {
                        qVar.f36410l.b(qVar.f36402c, oVar2, jVar.f26473f, jVar.f26474g, jVar.f26475h);
                    }
                    qVar.H = oVar2;
                }
                if (arrayList.isEmpty() || ((j) arrayList.get(0)).g()) {
                    int iC = qVar.f36421w[i10].C(bVar, eVar, i, qVar.U);
                    if (iC == -5) {
                        j3.o oVarD = (j3.o) bVar.f32189d;
                        oVarD.getClass();
                        if (i10 == qVar.C) {
                            int iD = k3.f.d(qVar.f36421w[i10].B());
                            while (i11 < arrayList.size() && ((j) arrayList.get(i11)).f36341l != iD) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                oVar = ((j) arrayList.get(i11)).f26472e;
                            } else {
                                oVar = qVar.G;
                                oVar.getClass();
                            }
                            oVarD = oVarD.d(oVar);
                        }
                        bVar.f32189d = oVarD;
                    }
                    return iC;
                }
            }
        }
        return -3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    @Override // i4.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.c()
            if (r0 == 0) goto L5e
            int r0 = r4.f36391d
            y3.q r1 = r4.f36390c
            boolean r2 = r1.u()
            if (r2 == 0) goto L11
            goto L5e
        L11:
            y3.p[] r2 = r1.f36421w
            r2 = r2[r0]
            boolean r3 = r1.U
            int r5 = r2.v(r5, r3)
            java.util.ArrayList r6 = r1.f36413o
            if (r6 == 0) goto L2c
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L26
            goto L42
        L26:
            r1 = 1
            java.lang.Object r6 = gf.a.g(r1, r6)
            goto L43
        L2c:
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L42
        L36:
            java.lang.Object r1 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L36
            r6 = r1
            goto L43
        L42:
            r6 = 0
        L43:
            y3.j r6 = (y3.j) r6
            if (r6 == 0) goto L5a
            boolean r1 = r6.g()
            if (r1 != 0) goto L5a
            int r1 = r2.t()
            int r6 = r6.f(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5a:
            r2.H(r5)
            return r5
        L5e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.m.h(long):int");
    }

    @Override // i4.b1
    public final boolean isReady() {
        if (this.f36391d == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.f36391d;
        q qVar = this.f36390c;
        return !qVar.u() && qVar.f36421w[i].x(qVar.U);
    }
}
