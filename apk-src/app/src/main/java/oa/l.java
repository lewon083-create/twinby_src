package oa;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends wa.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BasePendingResult f29861d;

    public l(BasePendingResult basePendingResult) {
        this.f29861d = basePendingResult;
    }

    @Override // wa.a
    public final na.l a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f29861d.a();
    }
}
