package e4;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f16119g = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f16121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f16125f;

    public h(g gVar) {
        this.f16120a = gVar.f16109a;
        this.f16121b = gVar.f16110b;
        this.f16122c = gVar.f16111c;
        this.f16123d = gVar.f16112d;
        this.f16124e = gVar.f16113e;
        this.f16125f = gVar.f16114f;
    }

    public static int a(int i) {
        return Math.floorMod(i + 1, 65536);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f16121b == hVar.f16121b && this.f16122c == hVar.f16122c && this.f16120a == hVar.f16120a && this.f16123d == hVar.f16123d && this.f16124e == hVar.f16124e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((527 + this.f16121b) * 31) + this.f16122c) * 31) + (this.f16120a ? 1 : 0)) * 31;
        long j10 = this.f16123d;
        return ((i + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f16124e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f16121b), Integer.valueOf(this.f16122c), Long.valueOf(this.f16123d), Integer.valueOf(this.f16124e), Boolean.valueOf(this.f16120a)};
        String str = m3.z.f28608a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
