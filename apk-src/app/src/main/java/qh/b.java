package qh;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import hi.g;
import ii.s;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f32113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f32114c;

    @Override // ii.s
    public final boolean a(int i, int i10, Intent intent) {
        g gVar;
        if (i != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f15779a;
        if (this.f32114c.compareAndSet(false, true) && (gVar = this.f32113b) != null) {
            gVar.success(str);
            this.f32113b = null;
        }
        return true;
    }
}
