package sc;

import android.util.Base64;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import xc.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f32883a;

    public b(f fVar) {
        this.f32883a = fVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        f fVar = this.f32883a;
        xc.c cVar = fVar.f32897d;
        if (cVar == null) {
            return b4.q(new a(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.b(), 10);
            Long lA = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof h) {
            }
            fVar.f32894a.a("requestIntegrityToken(%s)", integrityTokenRequest);
            sb.g gVar = new sb.g();
            cVar.a().post(new p(cVar, gVar, gVar, new d(fVar, gVar, bArrDecode, lA, gVar, integrityTokenRequest)));
            return gVar.f32858a;
        } catch (IllegalArgumentException e3) {
            return b4.q(new a(-13, e3));
        }
    }
}
