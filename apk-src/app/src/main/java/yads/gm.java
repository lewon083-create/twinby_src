package yads;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f38824a = new CopyOnWriteArrayList();

    public final void a(int i, long j10, long j11) {
        for (fm fmVar : this.f38824a) {
            if (!fmVar.f38481c) {
                fmVar.f38479a.post(new m4.b(fmVar, i, j10, j11, 2));
            }
        }
    }
}
