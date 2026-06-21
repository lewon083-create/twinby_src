package y3;

import j3.c0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f36310c = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l7.i f36311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36312b;

    public static void a(int i, ArrayList arrayList) {
        if (k3.f.q(f36310c, i, 0, 7) == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final j3.o b(j3.o oVar) {
        if (!this.f36312b || !this.f36311a.c(oVar)) {
            return oVar;
        }
        j3.n nVarA = oVar.a();
        String str = oVar.f26332k;
        nVarA.f26292m = c0.n("application/x-media3-cues");
        nVarA.K = this.f36311a.a(oVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(oVar.f26335n);
        sb2.append(str != null ? " ".concat(str) : "");
        nVarA.f26289j = sb2.toString();
        nVarA.f26297r = Long.MAX_VALUE;
        return new j3.o(nVarA);
    }
}
