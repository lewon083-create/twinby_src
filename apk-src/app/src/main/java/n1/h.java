package n1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends n {
    @Override // n1.d
    public final void a(d dVar) {
        e eVar = this.f29007h;
        if (eVar.f28978c && !eVar.f28984j) {
            eVar.d((int) ((((e) eVar.f28986l.get(0)).f28982g * ((m1.h) this.f29001b).f28526q0) + 0.5f));
        }
    }

    @Override // n1.n
    public final void d() {
        m1.d dVar = this.f29001b;
        m1.h hVar = (m1.h) dVar;
        int i = hVar.f28527r0;
        int i10 = hVar.f28528s0;
        int i11 = hVar.f28530u0;
        e eVar = this.f29007h;
        if (i11 == 1) {
            if (i != -1) {
                eVar.f28986l.add(dVar.T.f28456d.f29007h);
                this.f29001b.T.f28456d.f29007h.f28985k.add(eVar);
                eVar.f28981f = i;
            } else if (i10 != -1) {
                eVar.f28986l.add(dVar.T.f28456d.i);
                this.f29001b.T.f28456d.i.f28985k.add(eVar);
                eVar.f28981f = -i10;
            } else {
                eVar.f28977b = true;
                eVar.f28986l.add(dVar.T.f28456d.i);
                this.f29001b.T.f28456d.i.f28985k.add(eVar);
            }
            m(this.f29001b.f28456d.f29007h);
            m(this.f29001b.f28456d.i);
            return;
        }
        if (i != -1) {
            eVar.f28986l.add(dVar.T.f28458e.f29007h);
            this.f29001b.T.f28458e.f29007h.f28985k.add(eVar);
            eVar.f28981f = i;
        } else if (i10 != -1) {
            eVar.f28986l.add(dVar.T.f28458e.i);
            this.f29001b.T.f28458e.i.f28985k.add(eVar);
            eVar.f28981f = -i10;
        } else {
            eVar.f28977b = true;
            eVar.f28986l.add(dVar.T.f28458e.i);
            this.f29001b.T.f28458e.i.f28985k.add(eVar);
        }
        m(this.f29001b.f28458e.f29007h);
        m(this.f29001b.f28458e.i);
    }

    @Override // n1.n
    public final void e() {
        m1.d dVar = this.f29001b;
        int i = ((m1.h) dVar).f28530u0;
        e eVar = this.f29007h;
        if (i == 1) {
            dVar.Y = eVar.f28982g;
        } else {
            dVar.Z = eVar.f28982g;
        }
    }

    @Override // n1.n
    public final void f() {
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
