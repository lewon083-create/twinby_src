package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class qc implements vl0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f42245v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb2 f42247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb2 f42248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p73 f42251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p73 f42252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42253h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f42257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42258n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42260p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f42261q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f42262r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f42263s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p73 f42264t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f42265u;

    public qc() {
        this(null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x028d, code lost:
    
        r19.f42259o = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0295, code lost:
    
        if ((r14 & 1) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0297, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0299, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029a, code lost:
    
        r19.f42255k = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x029e, code lost:
    
        if (r19.f42256l != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02a0, code lost:
    
        r19.f42253h = 1;
        r19.i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a5, code lost:
    
        r19.f42253h = r16;
        r19.i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02ab, code lost:
    
        r20.e(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028d A[EDGE_INSN: B:155:0x028d->B:107:0x028d BREAK  A[LOOP:1: B:51:0x01b1->B:181:0x01b1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0235  */
    @Override // yads.vl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.lb2 r20) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.qc.a(yads.lb2):void");
    }

    public final void c() {
        this.f42253h = 0;
        this.i = 0;
        this.f42254j = 256;
    }

    public qc(String str, boolean z5) {
        this.f42247b = new kb2(new byte[7]);
        this.f42248c = new lb2(Arrays.copyOf(f42245v, 10));
        c();
        this.f42257m = -1;
        this.f42258n = -1;
        this.f42261q = -9223372036854775807L;
        this.f42263s = -9223372036854775807L;
        this.f42246a = z5;
        this.f42249d = str;
    }

    @Override // yads.vl0
    public final void b() {
    }

    @Override // yads.vl0
    public final void a(qq0 qq0Var, o93 o93Var) {
        o93Var.a();
        o93Var.b();
        this.f42250e = o93Var.f41502e;
        o93Var.b();
        p73 p73VarA = qq0Var.a(o93Var.f41501d, 1);
        this.f42251f = p73VarA;
        this.f42264t = p73VarA;
        if (this.f42246a) {
            o93Var.a();
            o93Var.b();
            p73 p73VarA2 = qq0Var.a(o93Var.f41501d, 5);
            this.f42252g = p73VarA2;
            mx0 mx0Var = new mx0();
            o93Var.b();
            mx0Var.f41066a = o93Var.f41502e;
            mx0Var.f41075k = "application/id3";
            p73VarA2.a(new nx0(mx0Var));
            return;
        }
        this.f42252g = new bl0();
    }

    @Override // yads.vl0
    public final void a(int i, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f42263s = j10;
        }
    }

    @Override // yads.vl0
    public final void a() {
        this.f42263s = -9223372036854775807L;
        this.f42256l = false;
        c();
    }
}
