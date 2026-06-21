package ka;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends BasePendingResult {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(na.i iVar) {
        super(iVar);
        c0.j(iVar, "GoogleApiClient must not be null");
        c0.j(ia.a.f21224a, "Api must not be null");
    }

    public abstract void J(na.c cVar);

    public final void K(Status status) {
        c0.a("Failed result must not be success", !status.c());
        G(D(status));
    }
}
