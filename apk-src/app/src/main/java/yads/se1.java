package yads;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class se1 implements eh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gh1 f42917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f42918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m53 f42919c;

    public se1(Context context, gh1 gh1Var) {
        this.f42917a = gh1Var;
        Object systemService = context.getApplicationContext().getSystemService("location");
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.f42918b = locationManager;
        this.f42919c = new m53(context.getApplicationContext(), locationManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    @Override // yads.eh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.location.Location a() {
        /*
            r9 = this;
            r0 = 0
            android.location.LocationManager r1 = r9.f42918b     // Catch: java.lang.Throwable -> La
            if (r1 == 0) goto La
            java.util.List r1 = r1.getAllProviders()     // Catch: java.lang.Throwable -> La
            goto Lb
        La:
            r1 = r0
        Lb:
            if (r1 == 0) goto L66
            jj.e r2 = kotlin.collections.r.b()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            yads.m53 r4 = r9.f42919c
            yads.ic2 r5 = r4.f40808b
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r5 = r5.a(r6)
            yads.ic2 r6 = r4.f40808b
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r6 = r6.a(r7)
            java.util.HashSet r7 = yads.m53.f40805c
            boolean r7 = r7.contains(r3)
            java.util.HashSet r8 = yads.m53.f40806d
            boolean r8 = r8.contains(r3)
            if (r8 == 0) goto L48
            if (r7 != 0) goto L55
            if (r5 == 0) goto L55
            if (r6 == 0) goto L55
            goto L4c
        L48:
            if (r7 != 0) goto L55
            if (r5 == 0) goto L55
        L4c:
            android.location.LocationManager r4 = r4.f40807a     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L55
            android.location.Location r3 = r4.getLastKnownLocation(r3)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
            r3 = r0
        L56:
            if (r3 == 0) goto L15
            r2.add(r3)
            goto L15
        L5c:
            jj.e r0 = kotlin.collections.r.a(r2)
            yads.gh1 r1 = r9.f42917a
            android.location.Location r0 = r1.a(r0)
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.se1.a():android.location.Location");
    }
}
