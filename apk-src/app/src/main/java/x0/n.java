package x0;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f35650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f35651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f35652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f7.i f35653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f35654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35657h;

    public n(Context context, b0 recorder, m outputOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        Intrinsics.checkNotNullParameter(outputOptions, "outputOptions");
        this.f35650a = recorder;
        this.f35651b = outputOptions;
        Context contextN = com.google.android.gms.internal.auth.g.n(context);
        Intrinsics.checkNotNullExpressionValue(contextN, "getApplicationContext(...)");
        this.f35652c = contextN;
    }
}
