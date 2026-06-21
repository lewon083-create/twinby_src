package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class p33 implements oq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oq0 f41812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f41813b;

    public p33(ld0 ld0Var, long j10) {
        this.f41812a = ld0Var;
        ni.a(ld0Var.a() >= j10);
        this.f41813b = j10;
    }

    @Override // yads.oq0
    public final long a() {
        return this.f41812a.a() - this.f41813b;
    }

    @Override // yads.oq0
    public final void b(int i) {
        this.f41812a.b(i);
    }

    @Override // yads.oq0
    public final long c() {
        return this.f41812a.c() - this.f41813b;
    }

    @Override // yads.oq0
    public final long getLength() {
        return this.f41812a.getLength() - this.f41813b;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i, int i10) {
        return this.f41812a.read(bArr, i, i10);
    }

    @Override // yads.oq0
    public final void readFully(byte[] bArr, int i, int i10) {
        this.f41812a.readFully(bArr, i, i10);
    }

    @Override // yads.oq0
    public final boolean b(byte[] bArr, int i, int i10, boolean z5) {
        return this.f41812a.b(bArr, i, i10, z5);
    }

    @Override // yads.oq0
    public final void a(byte[] bArr, int i, int i10) {
        this.f41812a.a(bArr, i, i10);
    }

    @Override // yads.oq0
    public final void b() {
        this.f41812a.b();
    }

    @Override // yads.oq0
    public final boolean a(byte[] bArr, int i, int i10, boolean z5) {
        return this.f41812a.a(bArr, i, i10, z5);
    }

    @Override // yads.oq0
    public final void a(int i) {
        this.f41812a.a(i);
    }
}
