package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class wn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yn3 f44434a;

    public /* synthetic */ wn3() {
        this(yn3.f45128e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn3) && this.f44434a == ((wn3) obj).f44434a;
    }

    public final int hashCode() {
        return this.f44434a.hashCode();
    }

    public final String toString() {
        return "WebViewAdSettings(cacheMode=" + this.f44434a + ")";
    }

    public wn3(yn3 yn3Var) {
        this.f44434a = yn3Var;
    }
}
