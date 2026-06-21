package yads;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f41551a;

    public ok(pk pkVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(pkVar.f41938b).setFlags(pkVar.f41939c).setUsage(pkVar.f41940d);
        int i = lb3.f40466a;
        if (i >= 29) {
            mk.a(usage, pkVar.f41941e);
        }
        if (i >= 32) {
            nk.a(usage, pkVar.f41942f);
        }
        this.f41551a = usage.build();
    }
}
