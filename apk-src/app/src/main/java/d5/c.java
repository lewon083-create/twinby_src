package d5;

import com.google.android.gms.internal.ads.w6;
import j3.a0;
import java.util.Arrays;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15569c;

    public c(byte[] bArr, String str, String str2) {
        this.f15567a = bArr;
        this.f15568b = str;
        this.f15569c = str2;
    }

    @Override // j3.a0
    public final void b(w6 w6Var) {
        String str = this.f15568b;
        if (str != null) {
            w6Var.f11655a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f15567a, ((c) obj).f15567a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15567a);
    }

    public final String toString() {
        return z.d(this.f15567a.length, "\"", z.j("ICY: title=\"", this.f15568b, "\", url=\"", this.f15569c, "\", rawMetadata.length=\""));
    }
}
