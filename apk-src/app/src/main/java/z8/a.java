package z8;

import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46203b;

    public a(int i, long j10) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f46202a = i;
        this.f46203b = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return z.a(this.f46202a, aVar.f46202a) && this.f46203b == aVar.f46203b;
    }

    public final int hashCode() {
        int iM = (z.m(this.f46202a) ^ 1000003) * 1000003;
        long j10 = this.f46203b;
        return iM ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i = this.f46202a;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return pe.a.h(sb2, this.f46203b, "}");
    }
}
