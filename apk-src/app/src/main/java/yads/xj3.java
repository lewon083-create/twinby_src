package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xj3 extends q53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb2 f44733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f44734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f44737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44738g;

    public xj3(p73 p73Var) {
        super(p73Var);
        this.f44733b = new lb2(fy1.f38575a);
        this.f44734c = new lb2(4);
    }

    public final boolean a(lb2 lb2Var) throws p53 {
        int iM = lb2Var.m();
        int i = (iM >> 4) & 15;
        int i10 = iM & 15;
        if (i10 != 7) {
            throw new p53(og2.a("Video format not supported: ", i10));
        }
        this.f44738g = i;
        return i != 5;
    }

    public final boolean a(long j10, lb2 lb2Var) throws qb2 {
        int iM = lb2Var.m();
        byte[] bArr = lb2Var.f40463a;
        int i = lb2Var.f40464b;
        int i10 = i + 2;
        int i11 = ((bArr[i + 1] & 255) << 8) | (((bArr[i] & 255) << 24) >> 8);
        int i12 = i + 3;
        lb2Var.f40464b = i12;
        long j11 = (((long) ((bArr[i10] & 255) | i11)) * 1000) + j10;
        if (iM == 0 && !this.f44736e) {
            byte[] bArr2 = new byte[lb2Var.f40465c - i12];
            lb2 lb2Var2 = new lb2(bArr2);
            lb2Var.a(bArr2, 0, lb2Var.f40465c - lb2Var.f40464b);
            ul ulVarA = ul.a(lb2Var2);
            this.f44735d = ulVarA.f43703b;
            mx0 mx0Var = new mx0();
            mx0Var.f41075k = "video/avc";
            mx0Var.f41073h = ulVarA.f43707f;
            mx0Var.f41080p = ulVarA.f43704c;
            mx0Var.f41081q = ulVarA.f43705d;
            mx0Var.f41084t = ulVarA.f43706e;
            mx0Var.f41077m = ulVarA.f43702a;
            this.f42193a.a(new nx0(mx0Var));
            this.f44736e = true;
            return false;
        }
        if (iM != 1 || !this.f44736e) {
            return false;
        }
        int i13 = this.f44738g == 1 ? 1 : 0;
        if (!this.f44737f && i13 == 0) {
            return false;
        }
        byte[] bArr3 = this.f44734c.f40463a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i14 = 4 - this.f44735d;
        int i15 = 0;
        while (lb2Var.f40465c - lb2Var.f40464b > 0) {
            lb2Var.a(this.f44734c.f40463a, i14, this.f44735d);
            this.f44734c.e(0);
            int iP = this.f44734c.p();
            this.f44733b.e(0);
            this.f42193a.a(4, this.f44733b);
            this.f42193a.a(iP, lb2Var);
            i15 = i15 + 4 + iP;
        }
        this.f42193a.a(j11, i13, i15, 0, null);
        this.f44737f = true;
        return true;
    }
}
