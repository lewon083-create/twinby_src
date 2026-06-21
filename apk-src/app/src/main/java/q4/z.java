package q4;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f31776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31778d;

    public z(int i, int i10, int i11, byte[] bArr) {
        this.f31775a = i;
        this.f31776b = bArr;
        this.f31777c = i10;
        this.f31778d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f31775a == zVar.f31775a && this.f31777c == zVar.f31777c && this.f31778d == zVar.f31778d && Arrays.equals(this.f31776b, zVar.f31776b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f31776b) + (this.f31775a * 31)) * 31) + this.f31777c) * 31) + this.f31778d;
    }
}
