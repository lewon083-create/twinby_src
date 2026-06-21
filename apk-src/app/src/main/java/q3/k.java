package q3;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f31667c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f31668d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f31669e;

    public k(int i, String str, o oVar) {
        this.f31665a = i;
        this.f31666b = str;
        this.f31669e = oVar;
    }

    public final boolean a(long j10, long j11) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f31668d;
            if (i >= arrayList.size()) {
                return false;
            }
            j jVar = (j) arrayList.get(i);
            long j12 = jVar.f31663a;
            long j13 = jVar.f31664b;
            if (j13 == -1) {
                if (j10 >= j12) {
                    return true;
                }
            } else if (j11 != -1 && j12 <= j10 && j10 + j11 <= j12 + j13) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f31665a == kVar.f31665a && this.f31666b.equals(kVar.f31666b) && this.f31667c.equals(kVar.f31667c) && this.f31669e.equals(kVar.f31669e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31669e.hashCode() + gf.a.e(this.f31665a * 31, 31, this.f31666b);
    }
}
