package c7;

import a0.u;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.b0;
import kotlin.collections.p;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f2236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f2237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f2238f;

    public f(Object value, String message, a logger, h verificationMode) {
        Collection collectionC;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("g", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f2234b = value;
        this.f2235c = message;
        this.f2236d = logger;
        this.f2237e = verificationMode;
        String message2 = k3.f.h(value, message);
        Intrinsics.checkNotNullParameter(message2, "message");
        k kVar = new k(message2);
        StackTraceElement[] stackTrace = kVar.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        Intrinsics.checkNotNullParameter(stackTrace, "<this>");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        Intrinsics.checkNotNullParameter(stackTrace, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(u.k(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionC = b0.f27475b;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionC = p.v(stackTrace);
            } else if (length == 1) {
                collectionC = r.c(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                collectionC = arrayList;
            }
        }
        kVar.setStackTrace((StackTraceElement[]) collectionC.toArray(new StackTraceElement[0]));
        this.f2238f = kVar;
    }

    @Override // k3.f
    public final Object e() throws k {
        int iOrdinal = this.f2237e.ordinal();
        if (iOrdinal == 0) {
            throw this.f2238f;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            throw new ij.j();
        }
        String message = k3.f.h(this.f2234b, this.f2235c);
        this.f2236d.getClass();
        Intrinsics.checkNotNullParameter("g", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("g", message);
        return null;
    }

    @Override // k3.f
    public final k3.f y(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }
}
