package a5;

import a0.u;
import j3.a0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f441b;

    public a(int i, String str) {
        this.f440a = i;
        this.f441b = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f440a);
        sb2.append(",url=");
        return u.o(sb2, this.f441b, ")");
    }
}
