package vk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34892c;

    public q(Object body, boolean z5) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f34891b = z5;
        this.f34892c = body.toString();
    }

    @Override // vk.b0
    public final String a() {
        return this.f34892c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f34891b == qVar.f34891b && Intrinsics.a(this.f34892c, qVar.f34892c);
    }

    public final int hashCode() {
        return this.f34892c.hashCode() + (Boolean.hashCode(this.f34891b) * 31);
    }

    @Override // vk.b0
    public final String toString() {
        boolean z5 = this.f34891b;
        String str = this.f34892c;
        if (!z5) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        wk.q.a(sb2, str);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
