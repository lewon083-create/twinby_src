package na;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends BasePendingResult {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29203n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(i iVar, int i) {
        super(iVar);
        this.f29203n = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l D(Status status) {
        switch (this.f29203n) {
            case 0:
                throw new UnsupportedOperationException("Creating failed results is not supported");
            default:
                return status;
        }
    }
}
