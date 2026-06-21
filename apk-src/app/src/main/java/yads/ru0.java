package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w41 f42726a;

    public ru0(w41 w41Var) {
        this.f42726a = w41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru0) && Intrinsics.a(this.f42726a, ((ru0) obj).f42726a);
    }

    public final int hashCode() {
        w41 w41Var = this.f42726a;
        if (w41Var == null) {
            return 0;
        }
        return w41Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.f42726a + ")";
    }
}
