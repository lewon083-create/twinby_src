package n1;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends n {
    @Override // n1.d
    public final void a(d dVar) {
        m1.a aVar = (m1.a) this.f29001b;
        int i = aVar.f28422s0;
        e eVar = this.f29007h;
        Iterator it = eVar.f28986l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((e) it.next()).f28982g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (i == 0 || i == 2) {
            eVar.d(i11 + aVar.f28424u0);
        } else {
            eVar.d(i10 + aVar.f28424u0);
        }
    }

    @Override // n1.n
    public final void d() {
        m1.d dVar = this.f29001b;
        if (dVar instanceof m1.a) {
            e eVar = this.f29007h;
            eVar.f28977b = true;
            ArrayList arrayList = eVar.f28986l;
            m1.a aVar = (m1.a) dVar;
            int i = aVar.f28422s0;
            boolean z5 = aVar.f28423t0;
            int i10 = 0;
            if (i == 0) {
                eVar.f28980e = 4;
                while (i10 < aVar.f28533r0) {
                    m1.d dVar2 = aVar.f28532q0[i10];
                    if (z5 || dVar2.f28463g0 != 8) {
                        e eVar2 = dVar2.f28456d.f29007h;
                        eVar2.f28985k.add(eVar);
                        arrayList.add(eVar2);
                    }
                    i10++;
                }
                m(this.f29001b.f28456d.f29007h);
                m(this.f29001b.f28456d.i);
                return;
            }
            if (i == 1) {
                eVar.f28980e = 5;
                while (i10 < aVar.f28533r0) {
                    m1.d dVar3 = aVar.f28532q0[i10];
                    if (z5 || dVar3.f28463g0 != 8) {
                        e eVar3 = dVar3.f28456d.i;
                        eVar3.f28985k.add(eVar);
                        arrayList.add(eVar3);
                    }
                    i10++;
                }
                m(this.f29001b.f28456d.f29007h);
                m(this.f29001b.f28456d.i);
                return;
            }
            if (i == 2) {
                eVar.f28980e = 6;
                while (i10 < aVar.f28533r0) {
                    m1.d dVar4 = aVar.f28532q0[i10];
                    if (z5 || dVar4.f28463g0 != 8) {
                        e eVar4 = dVar4.f28458e.f29007h;
                        eVar4.f28985k.add(eVar);
                        arrayList.add(eVar4);
                    }
                    i10++;
                }
                m(this.f29001b.f28458e.f29007h);
                m(this.f29001b.f28458e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            eVar.f28980e = 7;
            while (i10 < aVar.f28533r0) {
                m1.d dVar5 = aVar.f28532q0[i10];
                if (z5 || dVar5.f28463g0 != 8) {
                    e eVar5 = dVar5.f28458e.i;
                    eVar5.f28985k.add(eVar);
                    arrayList.add(eVar5);
                }
                i10++;
            }
            m(this.f29001b.f28458e.f29007h);
            m(this.f29001b.f28458e.i);
        }
    }

    @Override // n1.n
    public final void e() {
        m1.d dVar = this.f29001b;
        if (dVar instanceof m1.a) {
            int i = ((m1.a) dVar).f28422s0;
            e eVar = this.f29007h;
            if (i == 0 || i == 1) {
                dVar.Y = eVar.f28982g;
            } else {
                dVar.Z = eVar.f28982g;
            }
        }
    }

    @Override // n1.n
    public final void f() {
        this.f29002c = null;
        this.f29007h.c();
    }

    @Override // n1.n
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f29007h;
        eVar2.f28985k.add(eVar);
        eVar.f28986l.add(eVar2);
    }
}
