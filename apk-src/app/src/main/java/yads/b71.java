package yads;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b71 implements c71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f36948a;

    public b71(Uri uri) {
        this.f36948a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b71) && Intrinsics.a(this.f36948a, ((b71) obj).f36948a);
    }

    public final int hashCode() {
        return this.f36948a.hashCode();
    }

    public final String toString() {
        return "Success(reportUri=" + this.f36948a + ")";
    }
}
