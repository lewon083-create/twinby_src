package aa;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.o1;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f576e;

    public /* synthetic */ e(d8.e eVar, String str, Object obj, int i) {
        this.f573b = i;
        this.f574c = str;
        this.f576e = obj;
        this.f575d = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        r0 = r2.w(d8.n0.f15669k, 119, "Service reset to null", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0050, code lost:
    
        r16 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [d8.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Exception, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.e.a():java.lang.Object");
    }

    private final Object b() {
        Bundle bundleI;
        com.google.android.gms.internal.play_billing.d dVar;
        d8.e eVar = (d8.e) this.f574c;
        String str = (String) this.f576e;
        String str2 = (String) this.f575d;
        try {
            synchronized (eVar.f15594a) {
                dVar = eVar.f15601h;
            }
            if (dVar == null) {
                return o1.i(d8.n0.f15669k, 119);
            }
            return ((com.google.android.gms.internal.play_billing.b) dVar).k4(eVar.f15599f.getPackageName(), str, str2);
        } catch (DeadObjectException e3) {
            d8.j jVar = d8.n0.f15669k;
            String strA = d8.l0.a(e3);
            bundleI = o1.i(jVar, 5);
            if (strA != null) {
                bundleI.putString("ADDITIONAL_LOG_DETAILS", strA);
            }
            return bundleI;
        } catch (Exception e7) {
            d8.j jVar2 = d8.n0.i;
            String strA2 = d8.l0.a(e7);
            bundleI = o1.i(jVar2, 5);
            if (strA2 != null) {
                bundleI.putString("ADDITIONAL_LOG_DETAILS", strA2);
            }
            return bundleI;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.e.call():java.lang.Object");
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.f573b = i;
        this.f574c = obj;
        this.f576e = obj2;
        this.f575d = obj3;
    }
}
