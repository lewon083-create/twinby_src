package yads;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class e11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f37957b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f37958a = f37957b;

    public final boolean a(int i, String str) {
        Object objS;
        ConcurrentHashMap concurrentHashMap = this.f37958a;
        Object objValueOf = concurrentHashMap.get(str);
        if (objValueOf == null) {
            try {
                ij.k kVar = ij.m.f21341c;
                objS = Boolean.valueOf(InetAddress.getByName(str).isReachable(i));
            } catch (Throwable th2) {
                ij.k kVar2 = ij.m.f21341c;
                objS = com.google.android.gms.internal.measurement.h5.s(th2);
            }
            if (objS instanceof ij.l) {
                objS = null;
            }
            Boolean bool = (Boolean) objS;
            objValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, objValueOf);
            if (objPutIfAbsent != null) {
                objValueOf = objPutIfAbsent;
            }
        }
        return ((Boolean) objValueOf).booleanValue();
    }
}
