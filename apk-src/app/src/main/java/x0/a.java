package x0;

import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f35499f = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Range f35500g = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Range f35501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range f35504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35505e;

    static {
        a1.m mVarA = a();
        mVarA.f364d = 0;
        mVarA.c();
    }

    public a(Range range, int i, int i10, Range range2, int i11) {
        this.f35501a = range;
        this.f35502b = i;
        this.f35503c = i10;
        this.f35504d = range2;
        this.f35505e = i11;
    }

    public static a1.m a() {
        a1.m mVar = new a1.m();
        mVar.f362b = -1;
        mVar.f363c = -1;
        mVar.f364d = -1;
        Range range = f35499f;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        mVar.f365e = range;
        Range range2 = f35500g;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        mVar.f366f = range2;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f35501a.equals(aVar.f35501a) && this.f35502b == aVar.f35502b && this.f35503c == aVar.f35503c && this.f35504d.equals(aVar.f35504d) && this.f35505e == aVar.f35505e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f35501a.hashCode() ^ 1000003) * 1000003) ^ this.f35502b) * 1000003) ^ this.f35503c) * 1000003) ^ this.f35504d.hashCode()) * 1000003) ^ this.f35505e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpec{bitrate=");
        sb2.append(this.f35501a);
        sb2.append(", sourceFormat=");
        sb2.append(this.f35502b);
        sb2.append(", source=");
        sb2.append(this.f35503c);
        sb2.append(", sampleRate=");
        sb2.append(this.f35504d);
        sb2.append(", channelCount=");
        return t.z.d(this.f35505e, "}", sb2);
    }
}
