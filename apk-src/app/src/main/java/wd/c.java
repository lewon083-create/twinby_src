package wd;

import android.content.Context;
import android.os.UserManager;
import com.google.android.gms.internal.measurement.b4;
import java.util.Set;
import java.util.concurrent.Executor;
import md.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f35235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f35236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd.a f35237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f35238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f35239e;

    public c(Context context, String str, Set set, yd.a aVar, Executor executor) {
        this.f35235a = new m(new fd.c(context, str));
        this.f35238d = set;
        this.f35239e = executor;
        this.f35237c = aVar;
        this.f35236b = context;
    }

    public final sb.m a() {
        return !((UserManager) this.f35236b.getSystemService(UserManager.class)).isUserUnlocked() ? b4.s("") : b4.d(new b(this, 0), this.f35239e);
    }

    public final void b() {
        if (this.f35238d.size() <= 0) {
            b4.s(null);
        } else if (((UserManager) this.f35236b.getSystemService(UserManager.class)).isUserUnlocked()) {
            b4.d(new b(this, 1), this.f35239e);
        } else {
            b4.s(null);
        }
    }
}
