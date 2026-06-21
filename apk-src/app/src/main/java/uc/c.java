package uc;

import android.app.PendingIntent;
import com.google.android.gms.internal.ads.om1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f34443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34444c;

    public c(PendingIntent pendingIntent, boolean z5) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f34443b = pendingIntent;
        this.f34444c = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            c cVar = (c) ((b) obj);
            if (this.f34443b.equals(cVar.f34443b) && this.f34444c == cVar.f34444c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f34443b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f34444c ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder sbP = om1.p("ReviewInfo{pendingIntent=", this.f34443b.toString(), ", isNoOp=");
        sbP.append(this.f34444c);
        sbP.append("}");
        return sbP.toString();
    }
}
