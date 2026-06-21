package pa;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f31433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oa.h f31434c;

    public s(Intent intent, oa.h hVar) {
        this.f31433b = intent;
        this.f31434c = hVar;
    }

    @Override // pa.t
    public final void a() {
        Intent intent = this.f31433b;
        if (intent != null) {
            this.f31434c.startActivityForResult(intent, 2);
        }
    }
}
