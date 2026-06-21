package ob;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f29909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f29910e;

    public /* synthetic */ a(x xVar, String str, long j10, int i) {
        this.f29907b = i;
        this.f29908c = str;
        this.f29909d = j10;
        this.f29910e = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29907b) {
            case 0:
                x xVar = this.f29910e;
                xVar.C();
                String str = this.f29908c;
                pa.c0.f(str);
                h1.e eVar = xVar.f30502d;
                boolean zIsEmpty = eVar.isEmpty();
                long j10 = this.f29909d;
                if (zIsEmpty) {
                    xVar.f30503e = j10;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.f20340d < 100) {
                    eVar.put(str, 1);
                    xVar.f30501c.put(str, Long.valueOf(j10));
                } else {
                    s0 s0Var = ((l1) xVar.f15951b).f30265g;
                    l1.k(s0Var);
                    s0Var.f30413j.f("Too many ads visible");
                }
                break;
            default:
                x xVar2 = this.f29910e;
                l1 l1Var = (l1) xVar2.f15951b;
                xVar2.C();
                String str2 = this.f29908c;
                pa.c0.f(str2);
                h1.e eVar2 = xVar2.f30502d;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    s0 s0Var2 = l1Var.f30265g;
                    l1.k(s0Var2);
                    s0Var2.f30411g.g(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    u2 u2Var = l1Var.f30270m;
                    s0 s0Var3 = l1Var.f30265g;
                    l1.i(u2Var);
                    r2 r2VarI = u2Var.I(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar2.remove(str2);
                        h1.e eVar3 = xVar2.f30501c;
                        Long l10 = (Long) eVar3.get(str2);
                        long j11 = this.f29909d;
                        if (l10 == null) {
                            l1.k(s0Var3);
                            s0Var3.f30411g.f("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j11 - l10.longValue();
                            eVar3.remove(str2);
                            xVar2.H(str2, jLongValue, r2VarI);
                        }
                        if (eVar2.isEmpty()) {
                            long j12 = xVar2.f30503e;
                            if (j12 != 0) {
                                xVar2.G(j11 - j12, r2VarI);
                                xVar2.f30503e = 0L;
                            } else {
                                l1.k(s0Var3);
                                s0Var3.f30411g.f("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
