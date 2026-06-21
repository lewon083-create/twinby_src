package yads;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zr implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f45521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f45522g;

    public zr(String str, long j10, long j11, long j12, File file) {
        this.f45517b = str;
        this.f45518c = j10;
        this.f45519d = j11;
        this.f45520e = file != null;
        this.f45521f = file;
        this.f45522g = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zr zrVar = (zr) obj;
        if (!this.f45517b.equals(zrVar.f45517b)) {
            return this.f45517b.compareTo(zrVar.f45517b);
        }
        long j10 = this.f45518c - zrVar.f45518c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f45518c);
        sb2.append(", ");
        return pe.a.h(sb2, this.f45519d, "]");
    }
}
