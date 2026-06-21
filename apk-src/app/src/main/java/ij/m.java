package ij;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k f21341c = new k(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21342b;

    public /* synthetic */ m(Object obj) {
        this.f21342b = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).f21340b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return Intrinsics.a(this.f21342b, ((m) obj).f21342b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f21342b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f21342b;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
