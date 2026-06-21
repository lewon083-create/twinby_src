package e5;

import com.google.android.gms.internal.ads.w6;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f16229e;

    public a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f16226b = str;
        this.f16227c = str2;
        this.f16228d = i;
        this.f16229e = bArr;
    }

    @Override // j3.a0
    public final void b(w6 w6Var) {
        w6Var.a(this.f16228d, this.f16229e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f16228d == aVar.f16228d && Objects.equals(this.f16226b, aVar.f16226b) && Objects.equals(this.f16227c, aVar.f16227c) && Arrays.equals(this.f16229e, aVar.f16229e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.f16228d) * 31;
        String str = this.f16226b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16227c;
        return Arrays.hashCode(this.f16229e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // e5.j
    public final String toString() {
        return this.f16252a + ": mimeType=" + this.f16226b + ", description=" + this.f16227c;
    }
}
