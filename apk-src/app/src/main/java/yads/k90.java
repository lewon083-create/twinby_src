package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class k90 implements m90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f40107a;

    public k90(Uri uri) {
        this.f40107a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k90) && Intrinsics.a(this.f40107a, ((k90) obj).f40107a);
    }

    public final int hashCode() {
        return this.f40107a.hashCode();
    }

    public final String toString() {
        return "ShareReport(reportUri=" + this.f40107a + ")";
    }
}
