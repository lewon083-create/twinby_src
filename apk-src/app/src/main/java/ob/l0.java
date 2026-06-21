package ob;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f30249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f30250h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f30251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f30252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f30253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f30257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f30258q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f30259r;

    public l0(l1 l1Var, long j10, long j11) {
        super(l1Var);
        this.f30258q = 0L;
        this.f30259r = null;
        this.f30251j = j10;
        this.f30252k = j11;
    }

    @Override // ob.f0
    public final boolean F() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ob.g4 G(java.lang.String r45) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.l0.G(java.lang.String):ob.g4");
    }

    public final void H() {
        String str;
        C();
        l1 l1Var = (l1) this.f15951b;
        z0 z0Var = l1Var.f30264f;
        s0 s0Var = l1Var.f30265g;
        l1.h(z0Var);
        if (z0Var.J().i(w1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            e4 e4Var = l1Var.f30267j;
            l1.h(e4Var);
            e4Var.y0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            l1.k(s0Var);
            s0Var.f30417n.f("Analytics Storage consent is not granted");
            str = null;
        }
        l1.k(s0Var);
        s0Var.f30417n.f("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f30257p = str;
        l1Var.f30269l.getClass();
        this.f30258q = System.currentTimeMillis();
    }

    public final String I() {
        D();
        pa.c0.i(this.f30246d);
        return this.f30246d;
    }

    public final String J() {
        C();
        D();
        pa.c0.i(this.f30256o);
        return this.f30256o;
    }
}
