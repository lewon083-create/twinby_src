package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ne0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final an1 f41238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oe0 f41241g;

    public ne0(oe0 oe0Var, String str, int i, an1 an1Var) {
        this.f41241g = oe0Var;
        this.f41235a = str;
        this.f41236b = i;
        this.f41237c = an1Var == null ? -1L : an1Var.f43369d;
        if (an1Var == null || !an1Var.a()) {
            return;
        }
        this.f41238d = an1Var;
    }

    public final boolean a(ye yeVar) {
        long j10 = this.f41237c;
        if (j10 == -1) {
            return false;
        }
        an1 an1Var = yeVar.f45030d;
        if (an1Var == null) {
            return this.f41236b != yeVar.f45029c;
        }
        if (an1Var.f43369d > j10) {
            return true;
        }
        if (this.f41238d == null) {
            return false;
        }
        int iA = yeVar.f45028b.a(an1Var.f43366a);
        int iA2 = yeVar.f45028b.a(this.f41238d.f43366a);
        an1 an1Var2 = yeVar.f45030d;
        if (an1Var2.f43369d < this.f41238d.f43369d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        if (!an1Var2.a()) {
            int i = yeVar.f45030d.f43370e;
            return i == -1 || i > this.f41238d.f43367b;
        }
        an1 an1Var3 = yeVar.f45030d;
        int i10 = an1Var3.f43367b;
        int i11 = an1Var3.f43368c;
        an1 an1Var4 = this.f41238d;
        int i12 = an1Var4.f43367b;
        return i10 > i12 || (i10 == i12 && i11 > an1Var4.f43368c);
    }
}
