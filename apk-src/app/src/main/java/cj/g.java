package cj;

import com.google.android.gms.internal.measurement.d4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f2329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f2330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f2331h;
    public final String i;

    public g(long j10, long j11, String str, String str2, boolean z5, Long l10, Long l11, Long l12, String str3) {
        this.f2324a = j10;
        this.f2325b = j11;
        this.f2326c = str;
        this.f2327d = str2;
        this.f2328e = z5;
        this.f2329f = l10;
        this.f2330g = l11;
        this.f2331h = l12;
        this.i = str3;
    }

    public final List a() {
        return kotlin.collections.s.f(Long.valueOf(this.f2324a), Long.valueOf(this.f2325b), this.f2326c, this.f2327d, Boolean.valueOf(this.f2328e), this.f2329f, this.f2330g, this.f2331h, this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(a(), ((g) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sbN = gf.a.n("ExoPlayerAudioTrackData(groupIndex=", ", trackIndex=", this.f2324a);
        sbN.append(this.f2325b);
        sbN.append(", label=");
        sbN.append(this.f2326c);
        sbN.append(", language=");
        sbN.append(this.f2327d);
        sbN.append(", isSelected=");
        sbN.append(this.f2328e);
        sbN.append(", bitrate=");
        sbN.append(this.f2329f);
        sbN.append(", sampleRate=");
        sbN.append(this.f2330g);
        sbN.append(", channelCount=");
        sbN.append(this.f2331h);
        sbN.append(", codec=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
