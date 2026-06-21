package xl;

import wl.b0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f36279c;

    public k(int i, int i10, int i11) {
        this.f36279c = i11;
        this.f36277a = i;
        this.f36278b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xl.m
    public final boolean a(vl.k kVar, vl.k kVar2) {
        int iY;
        vl.k kVar3 = (vl.k) kVar2.f34939b;
        if (kVar3 == null || (kVar3 instanceof vl.h)) {
            return false;
        }
        switch (this.f36279c) {
            case 0:
                iY = kVar2.y() + 1;
                break;
            case 1:
                vl.k kVar4 = (vl.k) kVar2.f34939b;
                kVar4.getClass();
                iY = new b0(kVar4.v()).size() - kVar2.y();
                break;
            case 2:
                vl.k kVar5 = (vl.k) kVar2.f34939b;
                kVar5.getClass();
                b0 b0Var = new b0(kVar5.v());
                int i = 0;
                for (int iY2 = kVar2.y(); iY2 < b0Var.size(); iY2++) {
                    if (((vl.k) b0Var.get(iY2)).f34922d.equals(kVar2.f34922d)) {
                        i++;
                    }
                }
                iY = i;
                break;
            default:
                vl.k kVar6 = (vl.k) kVar2.f34939b;
                kVar6.getClass();
                iY = 0;
                for (vl.k kVar7 : new b0(kVar6.v())) {
                    if (kVar7.f34922d.equals(kVar2.f34922d)) {
                        iY++;
                    }
                    if (kVar7 == kVar2) {
                        break;
                    }
                }
                break;
        }
        int i10 = this.f36278b;
        int i11 = this.f36277a;
        if (i11 == 0) {
            return iY == i10;
        }
        int i12 = iY - i10;
        return i12 * i11 >= 0 && i12 % i11 == 0;
    }

    public final String b() {
        switch (this.f36279c) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i = this.f36278b;
        int i10 = this.f36277a;
        return i10 == 0 ? String.format(":%s(%d)", b(), Integer.valueOf(i)) : i == 0 ? String.format(":%s(%dn)", b(), Integer.valueOf(i10)) : String.format(":%s(%dn%+d)", b(), Integer.valueOf(i10), Integer.valueOf(i));
    }
}
