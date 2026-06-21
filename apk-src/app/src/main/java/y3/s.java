package y3;

import a0.u;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.om1;
import j3.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f36433c;

    public s(String str, String str2, List list) {
        this.f36431a = str;
        this.f36432b = str2;
        this.f36433c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f36431a, sVar.f36431a) && TextUtils.equals(this.f36432b, sVar.f36432b) && this.f36433c.equals(sVar.f36433c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36431a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36432b;
        return this.f36433c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f36431a;
        sb2.append(str != null ? u.o(om1.p(" [", str, ", "), this.f36432b, "]") : "");
        return sb2.toString();
    }
}
