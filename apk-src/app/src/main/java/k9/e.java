package k9;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.zl;
import q9.e0;
import q9.f2;
import q9.f3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f27258b;

    public e(Context context, e0 e0Var) {
        this.f27257a = context;
        this.f27258b = e0Var;
    }

    public final void a(f2 f2Var) {
        Context context = this.f27257a;
        al.a(context);
        if (((Boolean) zl.f13027c.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new ed.c(15, this, f2Var));
                return;
            }
        }
        try {
            this.f27258b.X(f3.a(context, f2Var));
        } catch (RemoteException e3) {
            u9.i.f("Failed to load ad.", e3);
        }
    }
}
