package u7;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f34316b;

    public c(String str, long j10) {
        this.f34315a = str;
        this.f34316b = Long.valueOf(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l10 = cVar.f34316b;
        if (!this.f34315a.equals(cVar.f34315a)) {
            return false;
        }
        Long l11 = this.f34316b;
        return l11 != null ? l11.equals(l10) : l10 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f34315a.hashCode() * 31;
        Long l10 = this.f34316b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
