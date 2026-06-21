package ti;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends io.flutter.plugin.platform.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33911b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f33912c;

    public w0(fj.c cVar) {
        super(ii.w.INSTANCE);
        this.f33912c = cVar;
    }

    @Override // io.flutter.plugin.platform.g
    public final io.flutter.plugin.platform.f a(Context context, Object obj) {
        switch (this.f33911b) {
            case 0:
                if (obj == null) {
                    Log.e(w0.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", 0));
                    return new dj.b(context);
                }
                Integer num = (Integer) obj;
                j jVar = (j) ((HashMap) ((ka.k) this.f33912c).f27325d).get(num);
                if (jVar != null && jVar.c() != null) {
                    return jVar.c();
                }
                Log.e(w0.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", num));
                return new dj.b(context);
            case 1:
                cj.s sVar = (cj.s) obj;
                Objects.requireNonNull(sVar);
                return new dj.b(context, ((cj.y) ((LongSparseArray) ((a0.a0) this.f33912c).f13c).get(sVar.f2357a)).f2368e);
            default:
                if (((Integer) obj) == null) {
                    throw new IllegalStateException("An identifier is required to retrieve a View instance.");
                }
                Object objF = ((fj.c) this.f33912c).f(r5.intValue());
                if (objF instanceof io.flutter.plugin.platform.f) {
                    return (io.flutter.plugin.platform.f) objF;
                }
                if (objF instanceof View) {
                    return new ef.d((View) objF, 1);
                }
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objF);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(a0.a0 a0Var) {
        super(cj.b.a());
        cj.c.f2305x1.getClass();
        this.f33912c = a0Var;
    }

    public w0(ka.k kVar) {
        super(ii.w.INSTANCE);
        this.f33912c = kVar;
    }
}
