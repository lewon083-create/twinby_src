package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class pm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg0 f41960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f41961b;

    public /* synthetic */ pm2(Context context) {
        this(context, new lg0());
    }

    public final nl1 a() {
        return kg0.f40190d == this.f41960a.a(this.f41961b) ? new nl1(1920, 1080, 6800) : new nl1(854, 480, 1000);
    }

    public pm2(Context context, lg0 lg0Var) {
        this.f41960a = lg0Var;
        this.f41961b = context.getApplicationContext();
    }
}
