package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cg0 f3618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iq0 f3619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rr0 f3620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n90 f3621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sj0 f3622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z70 f3623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public eq0 f3624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oq0 f3625h;
    public final y50 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f3626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mg0 f3627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ei0 f3628l;

    public b50(cg0 cg0Var, iq0 iq0Var, rr0 rr0Var, n90 n90Var, sj0 sj0Var, z70 z70Var, eq0 eq0Var, oq0 oq0Var, y50 y50Var, gx gxVar, mg0 mg0Var, ei0 ei0Var) {
        this.f3618a = cg0Var;
        this.f3619b = iq0Var;
        this.f3620c = rr0Var;
        this.f3621d = n90Var;
        this.f3622e = sj0Var;
        this.f3623f = z70Var;
        this.f3624g = eq0Var;
        this.f3625h = oq0Var;
        this.i = y50Var;
        this.f3626j = gxVar;
        this.f3627k = mg0Var;
        this.f3628l = ei0Var;
    }

    public final or0 a(ed.d dVar) {
        if (this.f3624g != null) {
            rr0 rr0Var = this.f3620c;
            pr0 pr0Var = pr0.SERVER_TRANSACTION;
            Objects.requireNonNull(rr0Var);
            return new hi(rr0Var, pr0Var, null, rr0.f10029d, Collections.EMPTY_LIST, vv.d(this.f3624g)).r();
        }
        hi hiVar = p9.k.C.f31303j;
        hiVar.getClass();
        wk wkVar = al.X4;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            synchronized (hiVar.f6143d) {
                try {
                    hiVar.v();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) hiVar.f6141b;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    hiVar.f6141b = hx.f6282d.schedule((s) hiVar.f6142c, ((Long) sVar.f31970c.a(al.Y4)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        return this.f3620c.a(dVar, pr0.SERVER_TRANSACTION).h(new np(4, this.f3627k)).r();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x027c A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #12 {all -> 0x00fd, blocks: (B:31:0x009c, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00e8, B:43:0x0114, B:46:0x011f, B:48:0x0127, B:50:0x012e, B:54:0x0137, B:63:0x016f, B:57:0x014b, B:62:0x015a, B:65:0x0174, B:42:0x0100, B:66:0x0188, B:73:0x01a7, B:76:0x01af, B:80:0x01d2, B:82:0x01e8, B:86:0x020a, B:88:0x0221, B:91:0x0235, B:96:0x0248, B:97:0x0249, B:98:0x0256, B:102:0x025b, B:103:0x025c, B:108:0x0272, B:121:0x0283, B:112:0x0276, B:115:0x0279, B:117:0x027b, B:118:0x027c, B:120:0x0282, B:128:0x0297, B:87:0x0214, B:83:0x01fb, B:79:0x01be, B:70:0x0196, B:71:0x019b, B:104:0x025d, B:106:0x0267, B:119:0x027d, B:92:0x0236, B:94:0x0240), top: B:189:0x009c, inners: #6, #7, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020a A[Catch: all -> 0x00fd, TryCatch #12 {all -> 0x00fd, blocks: (B:31:0x009c, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00e8, B:43:0x0114, B:46:0x011f, B:48:0x0127, B:50:0x012e, B:54:0x0137, B:63:0x016f, B:57:0x014b, B:62:0x015a, B:65:0x0174, B:42:0x0100, B:66:0x0188, B:73:0x01a7, B:76:0x01af, B:80:0x01d2, B:82:0x01e8, B:86:0x020a, B:88:0x0221, B:91:0x0235, B:96:0x0248, B:97:0x0249, B:98:0x0256, B:102:0x025b, B:103:0x025c, B:108:0x0272, B:121:0x0283, B:112:0x0276, B:115:0x0279, B:117:0x027b, B:118:0x027c, B:120:0x0282, B:128:0x0297, B:87:0x0214, B:83:0x01fb, B:79:0x01be, B:70:0x0196, B:71:0x019b, B:104:0x025d, B:106:0x0267, B:119:0x027d, B:92:0x0236, B:94:0x0240), top: B:189:0x009c, inners: #6, #7, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214 A[Catch: all -> 0x00fd, TryCatch #12 {all -> 0x00fd, blocks: (B:31:0x009c, B:33:0x00bb, B:35:0x00c3, B:37:0x00d0, B:39:0x00e8, B:43:0x0114, B:46:0x011f, B:48:0x0127, B:50:0x012e, B:54:0x0137, B:63:0x016f, B:57:0x014b, B:62:0x015a, B:65:0x0174, B:42:0x0100, B:66:0x0188, B:73:0x01a7, B:76:0x01af, B:80:0x01d2, B:82:0x01e8, B:86:0x020a, B:88:0x0221, B:91:0x0235, B:96:0x0248, B:97:0x0249, B:98:0x0256, B:102:0x025b, B:103:0x025c, B:108:0x0272, B:121:0x0283, B:112:0x0276, B:115:0x0279, B:117:0x027b, B:118:0x027c, B:120:0x0282, B:128:0x0297, B:87:0x0214, B:83:0x01fb, B:79:0x01be, B:70:0x0196, B:71:0x019b, B:104:0x025d, B:106:0x0267, B:119:0x027d, B:92:0x0236, B:94:0x0240), top: B:189:0x009c, inners: #6, #7, #9, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0233 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.or0 b() {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b50.b():com.google.android.gms.internal.ads.or0");
    }

    public final or0 c(ed.d dVar) {
        hi hiVarH = this.f3620c.a(dVar, pr0.RENDERER).e(new ox0(15, this)).h(this.f3622e);
        wk wkVar = al.f3195s6;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            long jIntValue = ((Integer) sVar.f31970c.a(al.f3210t6)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            hiVarH = hiVarH.q(jIntValue);
        }
        return hiVarH.r();
    }
}
