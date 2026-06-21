package ud;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements rd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34469a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34470b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rd.c f34471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f34472d;

    public h(f fVar) {
        this.f34472d = fVar;
    }

    @Override // rd.g
    public final rd.g d(String str) {
        if (this.f34469a) {
            throw new rd.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f34469a = true;
        this.f34472d.e(this.f34471c, str, this.f34470b);
        return this;
    }

    @Override // rd.g
    public final rd.g e(boolean z5) {
        if (this.f34469a) {
            throw new rd.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f34469a = true;
        this.f34472d.d(this.f34471c, z5 ? 1 : 0, this.f34470b);
        return this;
    }
}
