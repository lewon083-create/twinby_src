package na;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends BasePendingResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Status f29202n;

    public n(Status status) {
        super(null);
        this.f29202n = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l D(Status status) {
        return this.f29202n;
    }
}
