package androidx.work;

import android.content.Context;
import com.google.android.gms.internal.ads.b30;
import java.util.Collections;
import java.util.List;
import l7.n;
import m7.l;
import s6.b;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1754a = n.i("WrkMgrInitializer");

    @Override // s6.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // s6.b
    public final Object create(Context context) {
        n.g().e(f1754a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.P(context, new b30(new l7.b(0)));
        return l.O(context);
    }
}
