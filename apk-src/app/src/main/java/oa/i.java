package oa;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29857b;

    public i(Object obj, String str) {
        this.f29856a = obj;
        this.f29857b = str;
    }

    public final String a() {
        int iIdentityHashCode = System.identityHashCode(this.f29856a);
        String str = this.f29857b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f29856a == iVar.f29856a && this.f29857b.equals(iVar.f29857b);
    }

    public final int hashCode() {
        return this.f29857b.hashCode() + (System.identityHashCode(this.f29856a) * 31);
    }
}
