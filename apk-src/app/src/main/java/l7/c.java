package l7;

import java.util.HashSet;
import t.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28015e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28011a = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f28016f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28017g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f28018h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f28011a = 1;
        cVar.f28016f = -1L;
        cVar.f28017g = -1L;
        new HashSet();
        cVar.f28012b = false;
        cVar.f28013c = false;
        cVar.f28011a = 1;
        cVar.f28014d = false;
        cVar.f28015e = false;
        cVar.f28018h = eVar;
        cVar.f28016f = -1L;
        cVar.f28017g = -1L;
        i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f28012b == cVar.f28012b && this.f28013c == cVar.f28013c && this.f28014d == cVar.f28014d && this.f28015e == cVar.f28015e && this.f28016f == cVar.f28016f && this.f28017g == cVar.f28017g && this.f28011a == cVar.f28011a) {
            return this.f28018h.equals(cVar.f28018h);
        }
        return false;
    }

    public final int hashCode() {
        int iM = ((((((((z.m(this.f28011a) * 31) + (this.f28012b ? 1 : 0)) * 31) + (this.f28013c ? 1 : 0)) * 31) + (this.f28014d ? 1 : 0)) * 31) + (this.f28015e ? 1 : 0)) * 31;
        long j10 = this.f28016f;
        int i10 = (iM + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f28017g;
        return this.f28018h.f28021a.hashCode() + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }
}
