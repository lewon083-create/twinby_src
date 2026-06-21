package ij;

import com.vk.api.sdk.exceptions.VKApiCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final v f21359c = new v(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21360b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.d(this.f21360b ^ VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, ((w) obj).f21360b ^ VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f21360b == ((w) obj).f21360b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21360b);
    }

    public final String toString() {
        return String.valueOf(((long) this.f21360b) & 4294967295L);
    }
}
