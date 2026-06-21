package v9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.cq;
import com.google.android.gms.internal.ads.zl;
import ea.b;
import k9.g;
import k9.r;
import k9.v;
import pa.c0;
import q9.s;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void b(Context context, String str, g gVar, b bVar) {
        c0.j(context, "Context cannot be null.");
        c0.j(str, "AdUnitId cannot be null.");
        c0.j(gVar, "AdRequest cannot be null.");
        c0.e("#008 Must be called on the main UI thread.");
        al.a(context);
        if (((Boolean) zl.i.r()).booleanValue()) {
            if (((Boolean) s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new aa.b(context, str, gVar, bVar, 20));
                return;
            }
        }
        new cq(context, str).f(gVar.f27259a, bVar);
    }

    public abstract r a();

    public abstract void c(v vVar);

    public abstract void d(boolean z5);

    public abstract void e(Activity activity);
}
