package y8;

import a0.u;
import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f36553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v8.d f36554c;

    public j(String str, byte[] bArr, v8.d dVar) {
        this.f36552a = str;
        this.f36553b = bArr;
        this.f36554c = dVar;
    }

    public static x7.b a() {
        x7.b bVar = new x7.b();
        bVar.f35979d = v8.d.f34806b;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f36552a.equals(jVar.f36552a) && Arrays.equals(this.f36553b, jVar.f36553b) && this.f36554c.equals(jVar.f36554c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f36552a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f36553b)) * 1000003) ^ this.f36554c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f36553b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f36552a);
        sb2.append(", ");
        sb2.append(this.f36554c);
        sb2.append(", ");
        return u.o(sb2, strEncodeToString, ")");
    }
}
