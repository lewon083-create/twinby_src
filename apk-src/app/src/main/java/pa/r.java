package pa;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f31430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f31431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31432d;

    public r(Activity activity, Intent intent, int i) {
        this.f31430b = intent;
        this.f31431c = activity;
        this.f31432d = i;
    }

    @Override // pa.t
    public final void a() {
        Intent intent = this.f31430b;
        if (intent != null) {
            this.f31431c.startActivityForResult(intent, this.f31432d);
        }
    }
}
