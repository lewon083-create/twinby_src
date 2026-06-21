package y8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v8.c f36561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f36562b;

    public m(v8.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f36561a = cVar;
        this.f36562b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f36561a.equals(mVar.f36561a)) {
            return Arrays.equals(this.f36562b, mVar.f36562b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f36561a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f36562b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f36561a + ", bytes=[...]}";
    }
}
