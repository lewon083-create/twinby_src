package h7;

import android.content.Context;
import f7.i;
import f7.k;
import kotlin.collections.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g7.a {
    @Override // g7.a
    public final void a(i callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // g7.a
    public final void b(Context context, com.yandex.div.core.dagger.b executor, i callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.accept(new k(b0.f27475b));
    }
}
