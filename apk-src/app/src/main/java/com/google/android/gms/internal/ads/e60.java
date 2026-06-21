package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 extends ug implements q9.y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4849h;
    public final ei0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f4850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f4851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4852l;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e60(com.google.android.gms.internal.ads.xp0 r3, java.lang.String r4, com.google.android.gms.internal.ads.ei0 r5, com.google.android.gms.internal.ads.zp0 r6, java.lang.String r7) {
        /*
            r2 = this;
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            r2.<init>(r0)
            r0 = 0
            if (r3 != 0) goto La
            r1 = r0
            goto Lc
        La:
            java.lang.String r1 = r3.f12230b0
        Lc:
            r2.f4844c = r1
            r2.f4845d = r7
            if (r6 != 0) goto L14
            r7 = r0
            goto L16
        L14:
            java.lang.String r7 = r6.f13056b
        L16:
            r2.f4846e = r7
            java.lang.String r7 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L28
            java.lang.String r7 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L32
        L28:
            if (r3 == 0) goto L32
            org.json.JSONObject r7 = r3.f12266v     // Catch: org.json.JSONException -> L32
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r7.getString(r1)     // Catch: org.json.JSONException -> L32
        L32:
            if (r0 == 0) goto L35
            r4 = r0
        L35:
            r2.f4843b = r4
            java.util.List r4 = r5.f4962a
            r2.f4847f = r4
            r2.i = r5
            if (r3 != 0) goto L42
            r4 = 0
            goto L44
        L42:
            double r4 = r3.f12275z0
        L44:
            r2.f4851k = r4
            if (r3 != 0) goto L4a
            r4 = 2
            goto L4c
        L4a:
            int r4 = r3.H0
        L4c:
            r2.f4852l = r4
            p9.k r4 = p9.k.C
            ua.a r4 = r4.f31304k
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            r2.f4848g = r4
            com.google.android.gms.internal.ads.wk r4 = com.google.android.gms.internal.ads.al.f3300z7
            q9.s r5 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r7 = r5.f31970c
            com.google.android.gms.internal.ads.yk r5 = r5.f31970c
            java.lang.Object r4 = r7.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L79
            if (r6 == 0) goto L79
            android.os.Bundle r4 = r6.f13064k
            r2.f4850j = r4
            goto L80
        L79:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r2.f4850j = r4
        L80:
            com.google.android.gms.internal.ads.wk r4 = com.google.android.gms.internal.ads.al.A7
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L99
            if (r3 == 0) goto L99
            android.os.Bundle r3 = r3.F0
            android.os.Bundle r4 = r2.f4850j
            if (r4 == 0) goto L99
            r4.putAll(r3)
        L99:
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.internal.ads.al.f3258wa
            java.lang.Object r3 = r5.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb1
            if (r6 == 0) goto Lb1
            java.lang.String r3 = r6.i
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto Lb3
        Lb1:
            java.lang.String r3 = ""
        Lb3:
            r2.f4849h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e60.<init>(com.google.android.gms.internal.ads.xp0, java.lang.String, com.google.android.gms.internal.ads.ei0, com.google.android.gms.internal.ads.zp0, java.lang.String):void");
    }

    public static q9.y1 l4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof q9.y1 ? (q9.y1) iInterfaceQueryLocalInterface : new q9.w1(iBinder);
    }

    @Override // q9.y1
    public final String c() {
        return this.f4844c;
    }

    @Override // q9.y1
    public final String d() {
        return this.f4845d;
    }

    @Override // q9.y1
    public final Bundle f() {
        return this.f4850j;
    }

    @Override // q9.y1
    public final String i() {
        return this.f4843b;
    }

    @Override // q9.y1
    public final List k() {
        return this.f4847f;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final boolean k4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f4843b);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f4844c);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f4847f);
                return true;
            case 4:
                q9.i3 i3VarM = m();
                parcel2.writeNoException();
                vg.d(parcel2, i3VarM);
                return true;
            case 5:
                parcel2.writeNoException();
                vg.d(parcel2, this.f4850j);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f4845d);
                return true;
            default:
                return false;
        }
    }

    @Override // q9.y1
    public final q9.i3 m() {
        ei0 ei0Var = this.i;
        if (ei0Var != null) {
            return ei0Var.f4967f;
        }
        return null;
    }
}
