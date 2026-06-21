package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zv implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45546a;

    public zv(String str) {
        this.f45546a = str;
    }

    @Override // yads.m0
    public final String a() {
        return this.f45546a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv) && Intrinsics.a(this.f45546a, ((zv) obj).f45546a);
    }

    public final int hashCode() {
        return this.f45546a.hashCode();
    }

    public final String toString() {
        return pe.a.f("CloseAction(actionType=", this.f45546a, ")");
    }
}
