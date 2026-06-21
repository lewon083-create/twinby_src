package j3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f26390e;

    static {
        new s().a();
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(2);
        m3.z.G(3);
        m3.z.G(4);
    }

    public t(s sVar) {
        long j10 = sVar.f26360a;
        long j11 = sVar.f26361b;
        long j12 = sVar.f26362c;
        float f10 = sVar.f26363d;
        float f11 = sVar.f26364e;
        this.f26386a = j10;
        this.f26387b = j11;
        this.f26388c = j12;
        this.f26389d = f10;
        this.f26390e = f11;
    }

    public final s a() {
        s sVar = new s();
        sVar.f26360a = this.f26386a;
        sVar.f26361b = this.f26387b;
        sVar.f26362c = this.f26388c;
        sVar.f26363d = this.f26389d;
        sVar.f26364e = this.f26390e;
        return sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f26386a == tVar.f26386a && this.f26387b == tVar.f26387b && this.f26388c == tVar.f26388c && this.f26389d == tVar.f26389d && this.f26390e == tVar.f26390e;
    }

    public final int hashCode() {
        long j10 = this.f26386a;
        long j11 = this.f26387b;
        int i = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f26388c;
        int i10 = (i + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f26389d;
        int iFloatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f26390e;
        return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
    }
}
