package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40278b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn(Map map) {
        this(u01.a(map, v11.U), u01.a(map, v11.V));
        u01.a(map, v11.T);
    }

    public final boolean a() {
        return this.f40277a;
    }

    public kn(boolean z5, boolean z10) {
        this.f40277a = z5;
        this.f40278b = z10;
    }
}
