package z0;

import g0.c1;
import g0.h;
import g0.j;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f45780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f45781f;

    public a(int i, int i10, List list, List list2, h hVar, j jVar) {
        this.f45776a = i;
        this.f45777b = i10;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f45778c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f45779d = list2;
        this.f45780e = hVar;
        if (jVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f45781f = jVar;
    }

    @Override // g0.c1
    public final int a() {
        return this.f45776a;
    }

    @Override // g0.c1
    public final int b() {
        return this.f45777b;
    }

    @Override // g0.c1
    public final List c() {
        return this.f45778c;
    }

    @Override // g0.c1
    public final List d() {
        return this.f45779d;
    }

    public final boolean equals(Object obj) {
        h hVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            h hVar2 = aVar.f45780e;
            if (this.f45776a == aVar.f45776a && this.f45777b == aVar.f45777b && this.f45778c.equals(aVar.f45778c) && this.f45779d.equals(aVar.f45779d) && ((hVar = this.f45780e) != null ? hVar.equals(hVar2) : hVar2 == null) && this.f45781f.equals(aVar.f45781f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f45776a ^ 1000003) * 1000003) ^ this.f45777b) * 1000003) ^ this.f45778c.hashCode()) * 1000003) ^ this.f45779d.hashCode()) * 1000003;
        h hVar = this.f45780e;
        return ((iHashCode ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003) ^ this.f45781f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f45776a + ", recommendedFileFormat=" + this.f45777b + ", audioProfiles=" + this.f45778c + ", videoProfiles=" + this.f45779d + ", defaultAudioProfile=" + this.f45780e + ", defaultVideoProfile=" + this.f45781f + "}";
    }
}
