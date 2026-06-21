package yads;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f37230b;

    public c(String str, Set set) {
        this.f37229a = str;
        this.f37230b = set;
    }

    public final String a() {
        return this.f37229a;
    }

    public final Set b() {
        return this.f37230b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f37229a, cVar.f37229a) && Intrinsics.a(this.f37230b, cVar.f37230b);
    }

    public final int hashCode() {
        return this.f37230b.hashCode() + (this.f37229a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.f37229a + ", triggeredTestIds=" + this.f37230b + ")";
    }
}
