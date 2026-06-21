package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class py2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f42116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b03 f42119e;

    public py2(String str, Long l10, boolean z5, boolean z10, b03 b03Var) {
        this.f42115a = str;
        this.f42116b = l10;
        this.f42117c = z5;
        this.f42118d = z10;
        this.f42119e = b03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py2)) {
            return false;
        }
        py2 py2Var = (py2) obj;
        return Intrinsics.a(this.f42115a, py2Var.f42115a) && Intrinsics.a(this.f42116b, py2Var.f42116b) && this.f42117c == py2Var.f42117c && this.f42118d == py2Var.f42118d && Intrinsics.a(this.f42119e, py2Var.f42119e);
    }

    public final int hashCode() {
        String str = this.f42115a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l10 = this.f42116b;
        int iHashCode2 = (Boolean.hashCode(this.f42118d) + ((Boolean.hashCode(this.f42117c) + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31)) * 31)) * 31;
        b03 b03Var = this.f42119e;
        return iHashCode2 + (b03Var != null ? b03Var.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(templateType=" + this.f42115a + ", multiBannerAutoScrollInterval=" + this.f42116b + ", isHighlightingEnabled=" + this.f42117c + ", isLoopingVideo=" + this.f42118d + ", mediaAssetImageFallbackSize=" + this.f42119e + ")";
    }
}
