package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class sh0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi0 f42941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42942c;

    public sh0(String str, hi0 hi0Var, ArrayList arrayList) {
        this.f42940a = str;
        this.f42941b = hi0Var;
        this.f42942c = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f42940a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        return Intrinsics.a(this.f42940a, sh0Var.f42940a) && Intrinsics.a(this.f42941b, sh0Var.f42941b) && Intrinsics.a(this.f42942c, sh0Var.f42942c);
    }

    public final int hashCode() {
        return this.f42942c.hashCode() + ((this.f42941b.hashCode() + (this.f42940a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.f42940a;
        hi0 hi0Var = this.f42941b;
        List list = this.f42942c;
        StringBuilder sb2 = new StringBuilder("DivKitAdtuneAction(actionType=");
        sb2.append(str);
        sb2.append(", design=");
        sb2.append(hi0Var);
        sb2.append(", trackingUrls=");
        return t.z.h(sb2, list, ")");
    }
}
