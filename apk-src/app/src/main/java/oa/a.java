package oa;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f29816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.b f29817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f29818d;

    public a(l6.i iVar, na.b bVar, String str) {
        this.f29816b = iVar;
        this.f29817c = bVar;
        this.f29818d = str;
        this.f29815a = Arrays.hashCode(new Object[]{iVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return pa.c0.m(this.f29816b, aVar.f29816b) && pa.c0.m(this.f29817c, aVar.f29817c) && pa.c0.m(this.f29818d, aVar.f29818d);
    }

    public final int hashCode() {
        return this.f29815a;
    }
}
