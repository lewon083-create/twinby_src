package q3;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f31661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f31662g;

    public i(String str, long j10, long j11, long j12, File file) {
        this.f31657b = str;
        this.f31658c = j10;
        this.f31659d = j11;
        this.f31660e = file != null;
        this.f31661f = file;
        this.f31662g = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        String str = iVar.f31657b;
        String str2 = this.f31657b;
        if (!str2.equals(str)) {
            return str2.compareTo(iVar.f31657b);
        }
        long j10 = this.f31658c - iVar.f31658c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f31658c);
        sb2.append(", ");
        return pe.a.h(sb2, this.f31659d, "]");
    }
}
