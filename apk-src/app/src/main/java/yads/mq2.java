package yads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class mq2 extends ua2 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua2 f40994b;

    public mq2(ua2 ua2Var) {
        this.f40994b = (ua2) pg2.a(ua2Var);
    }

    @Override // yads.ua2
    public final ua2 a() {
        return this.f40994b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f40994b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mq2) {
            return this.f40994b.equals(((mq2) obj).f40994b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f40994b.hashCode();
    }

    public final String toString() {
        return this.f40994b + ".reverse()";
    }
}
