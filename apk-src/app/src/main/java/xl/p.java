package xl;

import wl.b0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f36289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36290b;

    public /* synthetic */ p(int i) {
        this.f36290b = i;
    }

    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        vl.k kVar3;
        vl.k kVarB;
        switch (this.f36290b) {
            case 0:
                kVar2.getClass();
                d dVar = new d(0);
                b0<vl.k> b0Var = new b0();
                rl.b.v(new u7.f(kVar2, b0Var, dVar, 7), kVar2);
                for (vl.k kVar4 : b0Var) {
                    if (kVar4 != kVar2 && this.f36289a.a(kVar, kVar4)) {
                        return true;
                    }
                }
                return false;
            case 1:
                return (kVar == kVar2 || (kVar3 = (vl.k) kVar2.f34939b) == null || !this.f36289a.a(kVar, kVar3)) ? false : true;
            case 2:
                return (kVar == kVar2 || (kVarB = kVar2.B()) == null || !this.f36289a.a(kVar, kVarB)) ? false : true;
            case 3:
                return !this.f36289a.a(kVar, kVar2);
            case 4:
                if (kVar == kVar2) {
                    return false;
                }
                vl.p pVar = kVar2.f34939b;
                while (true) {
                    vl.k kVar5 = (vl.k) pVar;
                    if (this.f36289a.a(kVar, kVar5)) {
                        return true;
                    }
                    if (kVar5 == kVar) {
                        return false;
                    }
                    pVar = kVar5.f34939b;
                }
                break;
            default:
                if (kVar == kVar2) {
                    return false;
                }
                for (vl.k kVarB2 = kVar2.B(); kVarB2 != null; kVarB2 = kVarB2.B()) {
                    if (this.f36289a.a(kVar, kVarB2)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final String toString() {
        switch (this.f36290b) {
            case 0:
                return String.format(":has(%s)", this.f36289a);
            case 1:
                return String.format(":ImmediateParent%s", this.f36289a);
            case 2:
                return String.format(":prev%s", this.f36289a);
            case 3:
                return String.format(":not%s", this.f36289a);
            case 4:
                return String.format(":parent%s", this.f36289a);
            default:
                return String.format(":prev*%s", this.f36289a);
        }
    }
}
