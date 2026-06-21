package g0;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19621h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19622j;

    public j(int i, String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f19614a = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f19615b = str;
        this.f19616c = i10;
        this.f19617d = i11;
        this.f19618e = i12;
        this.f19619f = i13;
        this.f19620g = i14;
        this.f19621h = i15;
        this.i = i16;
        this.f19622j = i17;
    }

    public final Size a() {
        return new Size(this.f19618e, this.f19619f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f19614a == jVar.f19614a && this.f19615b.equals(jVar.f19615b) && this.f19616c == jVar.f19616c && this.f19617d == jVar.f19617d && this.f19618e == jVar.f19618e && this.f19619f == jVar.f19619f && this.f19620g == jVar.f19620g && this.f19621h == jVar.f19621h && this.i == jVar.i && this.f19622j == jVar.f19622j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f19614a ^ 1000003) * 1000003) ^ this.f19615b.hashCode()) * 1000003) ^ this.f19616c) * 1000003) ^ this.f19617d) * 1000003) ^ this.f19618e) * 1000003) ^ this.f19619f) * 1000003) ^ this.f19620g) * 1000003) ^ this.f19621h) * 1000003) ^ this.i) * 1000003) ^ this.f19622j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoProfileProxy{codec=");
        sb2.append(this.f19614a);
        sb2.append(", mediaType=");
        sb2.append(this.f19615b);
        sb2.append(", bitrate=");
        sb2.append(this.f19616c);
        sb2.append(", frameRate=");
        sb2.append(this.f19617d);
        sb2.append(", width=");
        sb2.append(this.f19618e);
        sb2.append(", height=");
        sb2.append(this.f19619f);
        sb2.append(", profile=");
        sb2.append(this.f19620g);
        sb2.append(", bitDepth=");
        sb2.append(this.f19621h);
        sb2.append(", chromaSubsampling=");
        sb2.append(this.i);
        sb2.append(", hdrFormat=");
        return t.z.d(this.f19622j, "}", sb2);
    }
}
