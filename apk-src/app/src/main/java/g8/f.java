package g8;

import android.content.Context;
import android.content.Intent;
import com.vk.api.sdk.VK;
import ii.s;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import ti.t0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f20028d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20030c;

    public f(t0 loginCallback) {
        this.f20029b = 1;
        Intrinsics.checkNotNullParameter(loginCallback, "loginCallback");
        this.f20030c = loginCallback;
    }

    public static h b(Context context, boolean z5, k kVar) {
        if (z5) {
            return new i(context, kVar);
        }
        try {
            if (ma.f.f28773d.c(context, ma.g.f28774a) == 0) {
                return new e(context, kVar);
            }
        } catch (NoClassDefFoundError unused) {
        }
        return new i(context, kVar);
    }

    @Override // ii.s
    public final boolean a(int i, int i10, Intent intent) {
        switch (this.f20029b) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.f20030c).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).d(i, i10)) {
                        return true;
                    }
                }
                return false;
            default:
                return VK.onActivityResult$default(i, i10, intent, (t0) this.f20030c, false, 16, null);
        }
    }

    public f() {
        this.f20029b = 0;
        this.f20030c = new CopyOnWriteArrayList();
    }
}
