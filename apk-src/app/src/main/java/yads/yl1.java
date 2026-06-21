package yads;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class yl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f45104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f45105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u51 f45106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r51 f45110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f45111h;

    public yl1(xl1 xl1Var) {
        ni.b((xl1Var.f44758f && xl1Var.f44754b == null) ? false : true);
        this.f45104a = (UUID) ni.a(xl1Var.f44753a);
        this.f45105b = xl1Var.f44754b;
        this.f45106c = xl1Var.f44755c;
        this.f45107d = xl1Var.f44756d;
        this.f45109f = xl1Var.f44758f;
        this.f45108e = xl1Var.f44757e;
        this.f45110g = xl1Var.f44759g;
        byte[] bArr = xl1Var.f44760h;
        this.f45111h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final byte[] a() {
        byte[] bArr = this.f45111h;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl1)) {
            return false;
        }
        yl1 yl1Var = (yl1) obj;
        return this.f45104a.equals(yl1Var.f45104a) && lb3.a(this.f45105b, yl1Var.f45105b) && lb3.a(this.f45106c, yl1Var.f45106c) && this.f45107d == yl1Var.f45107d && this.f45109f == yl1Var.f45109f && this.f45108e == yl1Var.f45108e && this.f45110g.equals(yl1Var.f45110g) && Arrays.equals(this.f45111h, yl1Var.f45111h);
    }

    public final int hashCode() {
        int iHashCode = this.f45104a.hashCode() * 31;
        Uri uri = this.f45105b;
        return Arrays.hashCode(this.f45111h) + ((this.f45110g.hashCode() + ((((((((oy2.a(this.f45106c.entrySet()) + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f45107d ? 1 : 0)) * 31) + (this.f45109f ? 1 : 0)) * 31) + (this.f45108e ? 1 : 0)) * 31)) * 31);
    }
}
