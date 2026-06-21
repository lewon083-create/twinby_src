package yads;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class r31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f42457b;

    public r31(String str, Bitmap bitmap) {
        this.f42456a = str;
        this.f42457b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r31)) {
            return false;
        }
        r31 r31Var = (r31) obj;
        return Intrinsics.a(this.f42456a, r31Var.f42456a) && Intrinsics.a(this.f42457b, r31Var.f42457b);
    }

    public final int hashCode() {
        return this.f42457b.hashCode() + (this.f42456a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageData(url=" + this.f42456a + ", bitmap=" + this.f42457b + ")";
    }
}
