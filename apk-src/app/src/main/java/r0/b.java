package r0;

import java.util.ArrayList;
import q0.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f32139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f32140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f32141c;

    public b(m mVar, m mVar2, ArrayList arrayList) {
        if (mVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f32139a = mVar;
        if (mVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f32140b = mVar2;
        this.f32141c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f32139a.equals(bVar.f32139a) && this.f32140b.equals(bVar.f32140b) && this.f32141c.equals(bVar.f32141c);
    }

    public final int hashCode() {
        return ((((this.f32139a.hashCode() ^ 1000003) * 1000003) ^ this.f32140b.hashCode()) * 1000003) ^ this.f32141c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f32139a + ", secondarySurfaceEdge=" + this.f32140b + ", outConfigs=" + this.f32141c + "}";
    }
}
