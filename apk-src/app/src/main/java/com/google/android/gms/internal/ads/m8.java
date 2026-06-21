package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m8 implements t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f7804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tk0 f7805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w2 f7810h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public jx1 f7814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7816o;

    public m8(int i, int i10, String str, String str2) {
        this.f7803a = i10;
        switch (i10) {
            case 1:
                ik0 ik0Var = new ik0(16, new byte[16]);
                this.f7804b = ik0Var;
                this.f7805c = new tk0(ik0Var.f6518a);
                this.i = 0;
                this.f7811j = 0;
                this.f7812k = false;
                this.f7816o = -9223372036854775807L;
                this.f7806d = str;
                this.f7807e = i;
                this.f7808f = str2;
                break;
            default:
                ik0 ik0Var2 = new ik0(128, new byte[128]);
                this.f7804b = ik0Var2;
                this.f7805c = new tk0(ik0Var2.f6518a);
                this.i = 0;
                this.f7816o = -9223372036854775807L;
                this.f7806d = str;
                this.f7807e = i;
                this.f7808f = str2;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void b(boolean z5) {
        int i = this.f7803a;
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void d(int i, long j10) {
        switch (this.f7803a) {
            case 0:
                this.f7816o = j10;
                break;
            default:
                this.f7816o = j10;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03d4  */
    @Override // com.google.android.gms.internal.ads.t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.tk0 r25) {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m8.g(com.google.android.gms.internal.ads.tk0):void");
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void h() {
        switch (this.f7803a) {
            case 0:
                this.i = 0;
                this.f7811j = 0;
                this.f7812k = false;
                this.f7816o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.f7811j = 0;
                this.f7812k = false;
                this.f7816o = -9223372036854775807L;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.t8
    public final void j(b2 b2Var, r9 r9Var) {
        switch (this.f7803a) {
            case 0:
                r9Var.f();
                r9Var.g();
                this.f7809g = (String) r9Var.f9764e;
                r9Var.g();
                this.f7810h = b2Var.O(r9Var.f9763d, 1);
                break;
            default:
                r9Var.f();
                r9Var.g();
                this.f7809g = (String) r9Var.f9764e;
                r9Var.g();
                this.f7810h = b2Var.O(r9Var.f9763d, 1);
                break;
        }
    }

    private final void a(boolean z5) {
    }

    private final void c(boolean z5) {
    }
}
