package x0;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f35572c;

    public d(long j10, long j11, File file) {
        this.f35570a = j10;
        this.f35571b = j11;
        this.f35572c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f35570a == dVar.f35570a && this.f35571b == dVar.f35571b && this.f35572c.equals(dVar.f35572c);
    }

    public final int hashCode() {
        long j10 = this.f35570a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f35571b;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * (-721379959)) ^ this.f35572c.hashCode();
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f35570a + ", durationLimitMillis=" + this.f35571b + ", location=null, file=" + this.f35572c + "}";
    }
}
