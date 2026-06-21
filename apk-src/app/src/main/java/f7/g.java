package f7;

import android.content.Context;
import ij.p;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f16682a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f16683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16684c;

    static {
        g0.a(h.class).d();
        f16683b = ij.h.b(f.f16681f);
        f16684c = a.f16664a;
    }

    public static b a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        g7.a aVar = (g7.a) f16683b.getValue();
        if (aVar == null) {
            i7.m mVar = i7.m.f21210c;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i7.m.f21210c == null) {
                ReentrantLock reentrantLock = i7.m.f21211d;
                reentrantLock.lock();
                try {
                    if (i7.m.f21210c == null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        i7.k kVar = null;
                        try {
                            c7.j jVarB = i7.i.b();
                            if (jVarB != null) {
                                c7.j other = c7.j.f2246g;
                                Intrinsics.checkNotNullParameter(other, "other");
                                Object value = jVarB.f2251f.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
                                Object value2 = other.f2251f.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    i7.k kVar2 = new i7.k(context);
                                    if (kVar2.e()) {
                                        kVar = kVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        i7.m.f21210c = new i7.m(kVar);
                    }
                    Unit unit = Unit.f27471a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            aVar = i7.m.f21210c;
            Intrinsics.b(aVar);
        }
        n nVar = n.f16694b;
        b tracker = new b(aVar);
        f16684c.getClass();
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }
}
