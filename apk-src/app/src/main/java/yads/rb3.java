package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class rb3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f42535c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f42536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f42537b;

    public /* synthetic */ rb3(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f42536a.post(new t.a0(27, this));
    }

    public static final void a(rb3 rb3Var) {
        Toast.makeText(rb3Var.f42537b, f42535c, 1).show();
    }

    public rb3(Context context, Handler handler) {
        this.f42536a = handler;
        this.f42537b = context.getApplicationContext();
    }
}
