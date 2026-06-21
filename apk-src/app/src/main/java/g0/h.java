package g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19576f;

    public h(int i, int i10, int i11, int i12, int i13, String str) {
        this.f19571a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f19572b = str;
        this.f19573c = i10;
        this.f19574d = i11;
        this.f19575e = i12;
        this.f19576f = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f19571a == hVar.f19571a && this.f19572b.equals(hVar.f19572b) && this.f19573c == hVar.f19573c && this.f19574d == hVar.f19574d && this.f19575e == hVar.f19575e && this.f19576f == hVar.f19576f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f19571a ^ 1000003) * 1000003) ^ this.f19572b.hashCode()) * 1000003) ^ this.f19573c) * 1000003) ^ this.f19574d) * 1000003) ^ this.f19575e) * 1000003) ^ this.f19576f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioProfileProxy{codec=");
        sb2.append(this.f19571a);
        sb2.append(", mediaType=");
        sb2.append(this.f19572b);
        sb2.append(", bitrate=");
        sb2.append(this.f19573c);
        sb2.append(", sampleRate=");
        sb2.append(this.f19574d);
        sb2.append(", channels=");
        sb2.append(this.f19575e);
        sb2.append(", profile=");
        return t.z.d(this.f19576f, "}", sb2);
    }
}
