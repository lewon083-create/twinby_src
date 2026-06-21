package e1;

import android.media.MediaFormat;
import android.util.Size;
import g0.s2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f15944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f15945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f15947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15949h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15950j;

    public d(String str, int i, s2 s2Var, Size size, int i10, e eVar, int i11, int i12, int i13, int i14) {
        this.f15942a = str;
        this.f15943b = i;
        this.f15944c = s2Var;
        this.f15945d = size;
        this.f15946e = i10;
        this.f15947f = eVar;
        this.f15948g = i11;
        this.f15949h = i12;
        this.i = i13;
        this.f15950j = i14;
    }

    public static c d() {
        c cVar = new c();
        cVar.f15909b = -1;
        cVar.f15913f = 1;
        cVar.f15910c = 2130708361;
        cVar.f15916j = e.f15952d;
        return cVar;
    }

    @Override // e1.o
    public final MediaFormat a() {
        Size size = this.f15945d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f15942a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.f15946e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f15950j);
        int i = this.f15949h;
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i);
        int i10 = this.f15948g;
        if (i != i10) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", i10);
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.i);
        int i11 = this.f15943b;
        if (i11 != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i11);
        }
        e eVar = this.f15947f;
        int i12 = eVar.f15957a;
        if (i12 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i12);
        }
        int i13 = eVar.f15958b;
        if (i13 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i13);
        }
        int i14 = eVar.f15959c;
        if (i14 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i14);
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // e1.o
    public final s2 b() {
        return this.f15944c;
    }

    @Override // e1.o
    public final String c() {
        return this.f15942a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f15942a.equals(dVar.f15942a) && this.f15943b == dVar.f15943b && this.f15944c.equals(dVar.f15944c) && this.f15945d.equals(dVar.f15945d) && this.f15946e == dVar.f15946e && this.f15947f.equals(dVar.f15947f) && this.f15948g == dVar.f15948g && this.f15949h == dVar.f15949h && this.i == dVar.i && this.f15950j == dVar.f15950j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f15942a.hashCode() ^ 1000003) * 1000003) ^ this.f15943b) * 1000003) ^ this.f15944c.hashCode()) * 1000003) ^ this.f15945d.hashCode()) * 1000003) ^ this.f15946e) * 1000003) ^ this.f15947f.hashCode()) * 1000003) ^ this.f15948g) * 1000003) ^ this.f15949h) * 1000003) ^ this.i) * 1000003) ^ this.f15950j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb2.append(this.f15942a);
        sb2.append(", profile=");
        sb2.append(this.f15943b);
        sb2.append(", inputTimebase=");
        sb2.append(this.f15944c);
        sb2.append(", resolution=");
        sb2.append(this.f15945d);
        sb2.append(", colorFormat=");
        sb2.append(this.f15946e);
        sb2.append(", dataSpace=");
        sb2.append(this.f15947f);
        sb2.append(", captureFrameRate=");
        sb2.append(this.f15948g);
        sb2.append(", encodeFrameRate=");
        sb2.append(this.f15949h);
        sb2.append(", IFrameInterval=");
        sb2.append(this.i);
        sb2.append(", bitrate=");
        return t.z.d(this.f15950j, "}", sb2);
    }
}
