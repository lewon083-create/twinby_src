package bb;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.tasks.Task;
import l6.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends na.f implements ga.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final i f2025o = new i("AppSet.API", new f(0), new l7.b(5));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f2026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ma.g f2027n;

    public h(Context context, ma.g gVar) {
        super(context, null, f2025o, na.b.V1, na.e.f29187c);
        this.f2026m = context;
        this.f2027n = gVar;
    }

    @Override // ga.a
    public final Task b() {
        if (this.f2027n.c(this.f2026m, 212800000) != 0) {
            return b4.q(new na.d(new Status(17, null, null, null)));
        }
        ac.h hVarA = w.a();
        hVarA.f754e = new ma.d[]{ga.d.f20063a};
        hVarA.f753d = new g8.g(this);
        hVarA.f751b = false;
        hVarA.f752c = 27601;
        return e(0, hVarA.a());
    }
}
