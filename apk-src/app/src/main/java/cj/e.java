package cj;

import com.google.android.gms.internal.measurement.d4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f2316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f2317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f2318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2319h;

    public e(String id2, String label, String language, boolean z5, Long l10, Long l11, Long l12, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f2312a = id2;
        this.f2313b = label;
        this.f2314c = language;
        this.f2315d = z5;
        this.f2316e = l10;
        this.f2317f = l11;
        this.f2318g = l12;
        this.f2319h = str;
    }

    public final List a() {
        return kotlin.collections.s.f(this.f2312a, this.f2313b, this.f2314c, Boolean.valueOf(this.f2315d), this.f2316e, this.f2317f, this.f2318g, this.f2319h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d4.d(a(), ((e) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sbJ = t.z.j("AudioTrackMessage(id=", this.f2312a, ", label=", this.f2313b, ", language=");
        sbJ.append(this.f2314c);
        sbJ.append(", isSelected=");
        sbJ.append(this.f2315d);
        sbJ.append(", bitrate=");
        sbJ.append(this.f2316e);
        sbJ.append(", sampleRate=");
        sbJ.append(this.f2317f);
        sbJ.append(", channelCount=");
        sbJ.append(this.f2318g);
        sbJ.append(", codec=");
        sbJ.append(this.f2319h);
        sbJ.append(")");
        return sbJ.toString();
    }
}
