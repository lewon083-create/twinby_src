package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import bb.g;
import java.util.HashMap;
import l6.e;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1738b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1739c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1740d = new e(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f1741e = new g(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1741e;
    }
}
