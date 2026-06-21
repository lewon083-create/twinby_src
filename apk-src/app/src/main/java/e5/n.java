package e5;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16263c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f16262b = str;
        this.f16263c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f16262b, nVar.f16262b) && Arrays.equals(this.f16263c, nVar.f16263c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16262b;
        return Arrays.hashCode(this.f16263c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // e5.j
    public final String toString() {
        return this.f16252a + ": owner=" + this.f16262b;
    }
}
