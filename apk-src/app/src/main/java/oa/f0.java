package oa;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements na.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f29852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l6.i f29853b;

    public f0(l6.i iVar, BasePendingResult basePendingResult) {
        this.f29852a = basePendingResult;
        Objects.requireNonNull(iVar);
        this.f29853b = iVar;
    }

    @Override // na.j
    public final void a(Status status) {
        ((Map) this.f29853b.f27978c).remove(this.f29852a);
    }
}
