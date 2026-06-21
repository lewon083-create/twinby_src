package e1;

import android.media.MediaFormat;
import g0.s2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f15897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15901g;

    public b(String str, int i, s2 s2Var, int i10, int i11, int i12, int i13) {
        this.f15895a = str;
        this.f15896b = i;
        this.f15897c = s2Var;
        this.f15898d = i10;
        this.f15899e = i11;
        this.f15900f = i12;
        this.f15901g = i13;
    }

    @Override // e1.o
    public final MediaFormat a() {
        int i = this.f15900f;
        int i10 = this.f15901g;
        String str = this.f15895a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i, i10);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.f15898d);
        int i11 = this.f15896b;
        if (i11 != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i11);
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", i11);
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // e1.o
    public final s2 b() {
        return this.f15897c;
    }

    @Override // e1.o
    public final String c() {
        return this.f15895a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f15895a.equals(bVar.f15895a) && this.f15896b == bVar.f15896b && this.f15897c.equals(bVar.f15897c) && this.f15898d == bVar.f15898d && this.f15899e == bVar.f15899e && this.f15900f == bVar.f15900f && this.f15901g == bVar.f15901g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f15895a.hashCode() ^ 1000003) * 1000003) ^ this.f15896b) * 1000003) ^ this.f15897c.hashCode()) * 1000003) ^ this.f15898d) * 1000003) ^ this.f15899e) * 1000003) ^ this.f15900f) * 1000003) ^ this.f15901g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb2.append(this.f15895a);
        sb2.append(", profile=");
        sb2.append(this.f15896b);
        sb2.append(", inputTimebase=");
        sb2.append(this.f15897c);
        sb2.append(", bitrate=");
        sb2.append(this.f15898d);
        sb2.append(", captureSampleRate=");
        sb2.append(this.f15899e);
        sb2.append(", encodeSampleRate=");
        sb2.append(this.f15900f);
        sb2.append(", channelCount=");
        return t.z.d(this.f15901g, "}", sb2);
    }
}
