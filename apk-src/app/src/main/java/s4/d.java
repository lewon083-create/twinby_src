package s4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32756f;

    public d(int i, int i10, int i11, int i12, int i13, int i14) {
        this.f32751a = i;
        this.f32752b = i10;
        this.f32753c = i11;
        this.f32754d = i12;
        this.f32755e = i13;
        this.f32756f = i14;
    }

    public final int a() {
        int i = this.f32751a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        m3.b.s("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }

    @Override // s4.a
    public final int getType() {
        return 1752331379;
    }
}
