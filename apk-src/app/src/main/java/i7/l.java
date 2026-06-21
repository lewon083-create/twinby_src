package i7;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f21207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f7.i f21208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f7.k f21209c;

    public l(Activity activity, com.yandex.div.core.dagger.b executor, f7.i callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f21207a = activity;
        this.f21208b = callback;
    }
}
