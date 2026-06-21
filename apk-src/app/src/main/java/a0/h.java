package a0;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.r2 f95a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f98d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f99e;

    public h(g0.r2 r2Var, long j10, int i, Matrix matrix, int i10) {
        if (r2Var == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f95a = r2Var;
        this.f96b = j10;
        this.f97c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f98d = matrix;
        this.f99e = i10;
    }

    @Override // a0.m1
    public final void a(i0.k kVar) {
        kVar.d(this.f97c);
    }

    @Override // a0.m1
    public final g0.r2 c() {
        return this.f95a;
    }

    @Override // a0.m1
    public final int d() {
        return this.f99e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f95a.equals(hVar.f95a) && this.f96b == hVar.f96b && this.f97c == hVar.f97c && this.f98d.equals(hVar.f98d) && this.f99e == hVar.f99e) {
                return true;
            }
        }
        return false;
    }

    @Override // a0.m1
    public final long getTimestamp() {
        return this.f96b;
    }

    public final int hashCode() {
        int iHashCode = (this.f95a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f96b;
        return ((((((iHashCode ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f97c) * 1000003) ^ this.f98d.hashCode()) * 1000003) ^ this.f99e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb2.append(this.f95a);
        sb2.append(", timestamp=");
        sb2.append(this.f96b);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f97c);
        sb2.append(", sensorToBufferTransformMatrix=");
        sb2.append(this.f98d);
        sb2.append(", flashState=");
        return t.z.d(this.f99e, "}", sb2);
    }
}
