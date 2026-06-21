package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hu0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39329b;

    public hu0(String str, ArrayList arrayList) {
        this.f39328a = str;
        this.f39329b = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f39328a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu0)) {
            return false;
        }
        hu0 hu0Var = (hu0) obj;
        return Intrinsics.a(this.f39328a, hu0Var.f39328a) && Intrinsics.a(this.f39329b, hu0Var.f39329b);
    }

    public final int hashCode() {
        return this.f39329b.hashCode() + (this.f39328a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.f39328a + ", items=" + this.f39329b + ")";
    }
}
