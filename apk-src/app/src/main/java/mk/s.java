package mk;

import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28939a = 0;

    static {
        Object objS;
        Object objS2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            ij.k kVar = ij.m.f21341c;
            objS = oj.a.class.getCanonicalName();
        } catch (Throwable th2) {
            ij.k kVar2 = ij.m.f21341c;
            objS = h5.s(th2);
        }
        if (ij.m.a(objS) != null) {
            objS = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objS2 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            ij.k kVar3 = ij.m.f21341c;
            objS2 = h5.s(th3);
        }
        if (ij.m.a(objS2) != null) {
            objS2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
