package ti;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33809c;

    public e(la.m mVar) {
        this.f33807a = mVar.e();
        this.f33808b = (String) mVar.f28100e;
        this.f33809c = (String) mVar.f28099d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f33807a == eVar.f33807a && this.f33808b.equals(eVar.f33808b)) {
            return this.f33809c.equals(eVar.f33809c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f33807a), this.f33808b, this.f33809c);
    }

    public e(int i, String str, String str2) {
        this.f33807a = i;
        this.f33808b = str;
        this.f33809c = str2;
    }
}
