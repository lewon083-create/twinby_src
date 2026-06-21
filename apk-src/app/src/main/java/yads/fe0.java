package yads;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class fe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sq0 f38429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f38430b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f38431c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f38432d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o30 f38433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd0 f38434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ae0 f38435g;

    public fe0(od0 od0Var) {
        this.f38429a = od0Var;
    }

    public static zm1 a(Class cls) {
        try {
            return (zm1) cls.getConstructor(null).newInstance(null);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    public final void b(o30 o30Var) {
        if (o30Var != this.f38433e) {
            this.f38433e = o30Var;
            this.f38430b.clear();
            this.f38432d.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.b53 a(int r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = r4.f38430b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.HashMap r0 = r4.f38430b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            yads.b53 r5 = (yads.b53) r5
            return r5
        L19:
            yads.o30 r0 = r4.f38433e
            r0.getClass()
            r1 = 2
            java.lang.Class<yads.zm1> r2 = yads.zm1.class
            if (r5 == 0) goto L66
            r3 = 1
            if (r5 == r3) goto L56
            r3 = 0
            if (r5 == r1) goto L46
            r1 = 3
            if (r5 == r1) goto L36
            r2 = 4
            if (r5 == r2) goto L30
            goto L73
        L30:
            zl.k r2 = new zl.k     // Catch: java.lang.ClassNotFoundException -> L73
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L73
            goto L74
        L36:
            java.lang.String r0 = "com.monetization.ads.exo.source.rtsp.RtspMediaSource$Factory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Class r0 = r0.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            zl.j r2 = new zl.j     // Catch: java.lang.ClassNotFoundException -> L73
            r2.<init>(r3, r0)     // Catch: java.lang.ClassNotFoundException -> L73
            goto L74
        L46:
            java.lang.String r1 = "com.monetization.ads.exo.source.hls.HlsMediaSource$Factory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            zl.k r2 = new zl.k     // Catch: java.lang.ClassNotFoundException -> L73
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L73
            goto L74
        L56:
            java.lang.String r1 = "com.monetization.ads.exo.source.smoothstreaming.SsMediaSource$Factory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L73
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            zl.k r2 = new zl.k     // Catch: java.lang.ClassNotFoundException -> L73
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L73
            goto L74
        L66:
            java.lang.Class<com.monetization.ads.exo.source.dash.DashMediaSource$Factory> r3 = com.monetization.ads.exo.source.dash.DashMediaSource$Factory.class
            java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L73
            zl.k r3 = new zl.k     // Catch: java.lang.ClassNotFoundException -> L73
            r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L73
            r2 = r3
            goto L74
        L73:
            r2 = 0
        L74:
            java.util.HashMap r0 = r4.f38430b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.put(r1, r2)
            if (r2 == 0) goto L88
            java.util.HashSet r0 = r4.f38431c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fe0.a(int):yads.b53");
    }

    public final /* synthetic */ zm1 a(o30 o30Var) {
        return new ik2(o30Var, this.f38429a);
    }
}
