package pa;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements na.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wa.a f31435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sb.g f31436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f31437c;

    public u(wa.a aVar, sb.g gVar, l lVar) {
        this.f31435a = aVar;
        this.f31436b = gVar;
        this.f31437c = lVar;
    }

    @Override // na.j
    public final void a(Status status) {
        boolean zC = status.c();
        sb.g gVar = this.f31436b;
        if (!zC) {
            gVar.a(c0.n(status));
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar.b(this.f31437c.c(this.f31435a.a()));
    }
}
