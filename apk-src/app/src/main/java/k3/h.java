package k3;

import com.google.android.gms.internal.ads.om1;
import java.util.Objects;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f26859e = new h(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26863d;

    public h(int i, int i10, int i11) {
        this.f26860a = i;
        this.f26861b = i10;
        this.f26862c = i11;
        this.f26863d = z.H(i11) ? z.s(i11) * i10 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f26860a == hVar.f26860a && this.f26861b == hVar.f26861b && this.f26862c == hVar.f26862c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26860a), Integer.valueOf(this.f26861b), Integer.valueOf(this.f26862c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f26860a);
        sb2.append(", channelCount=");
        sb2.append(this.f26861b);
        sb2.append(", encoding=");
        return om1.l(sb2, this.f26862c, ']');
    }
}
