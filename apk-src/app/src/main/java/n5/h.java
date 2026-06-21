package n5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f29113c;

    public h(long j10, byte[] bArr) {
        this.f29112b = j10;
        this.f29113c = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f29112b, ((h) obj).f29112b);
    }
}
