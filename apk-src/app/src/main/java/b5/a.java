package b5;

import j3.a0;
import j3.c0;
import j3.n;
import j3.o;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f1967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f1968h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f1973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1974f;

    static {
        n nVar = new n();
        nVar.f26292m = c0.n("application/id3");
        f1967g = new o(nVar);
        n nVar2 = new n();
        nVar2.f26292m = c0.n("application/x-scte35");
        f1968h = new o(nVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f1969a = str;
        this.f1970b = str2;
        this.f1971c = j10;
        this.f1972d = j11;
        this.f1973e = bArr;
    }

    @Override // j3.a0
    public final o a() {
        String str = this.f1969a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f1968h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f1967g;
            default:
                return null;
        }
    }

    @Override // j3.a0
    public final byte[] c() {
        if (a() != null) {
            return this.f1973e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1971c == aVar.f1971c && this.f1972d == aVar.f1972d && Objects.equals(this.f1969a, aVar.f1969a) && Objects.equals(this.f1970b, aVar.f1970b) && Arrays.equals(this.f1973e, aVar.f1973e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1974f == 0) {
            String str = this.f1969a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1970b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.f1971c;
            int i = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f1972d;
            this.f1974f = Arrays.hashCode(this.f1973e) + ((i + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f1974f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1969a + ", id=" + this.f1972d + ", durationMs=" + this.f1971c + ", value=" + this.f1970b;
    }
}
