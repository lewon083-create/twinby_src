package zh;

import a0.z;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f46300a;

    public j() {
        Looper mainLooper = Looper.getMainLooper();
        this.f46300a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // zh.d
    public final void a(z zVar) {
        this.f46300a.post(zVar);
    }
}
