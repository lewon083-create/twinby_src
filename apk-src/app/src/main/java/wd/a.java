package wd;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f35232b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f35231a = str;
        this.f35232b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f35231a.equals(aVar.f35231a) && this.f35232b.equals(aVar.f35232b);
    }

    public final int hashCode() {
        return ((this.f35231a.hashCode() ^ 1000003) * 1000003) ^ this.f35232b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f35231a + ", usedDates=" + this.f35232b + "}";
    }
}
