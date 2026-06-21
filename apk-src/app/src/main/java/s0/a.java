package s0;

import a0.u;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f32383d;

    public a(String str, String str2, String str3, String str4) {
        this.f32380a = str;
        this.f32381b = str2;
        this.f32382c = str3;
        this.f32383d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f32380a.equals(aVar.f32380a) && this.f32381b.equals(aVar.f32381b) && this.f32382c.equals(aVar.f32382c) && this.f32383d.equals(aVar.f32383d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f32380a.hashCode() ^ 1000003) * 1000003) ^ this.f32381b.hashCode()) * 1000003) ^ this.f32382c.hashCode()) * 1000003) ^ this.f32383d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.f32380a);
        sb2.append(", eglVersion=");
        sb2.append(this.f32381b);
        sb2.append(", glExtensions=");
        sb2.append(this.f32382c);
        sb2.append(", eglExtensions=");
        return u.o(sb2, this.f32383d, "}");
    }
}
