package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lx0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f7666h = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f7670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n90 f7672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kx0 f7673g;

    public lx0(Context context, String str, String str2, String str3) {
        if (n90.f8246e == null) {
            n90.f8246e = new n90(context, 18);
        }
        this.f7672f = n90.f8246e;
        this.f7673g = kx0.B(context);
        this.f7667a = str;
        this.f7668b = str.concat("_3p");
        this.f7669c = str2;
        this.f7670d = str2.concat("_3p");
        this.f7671e = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.jx0 a(java.lang.String r17, java.lang.String r18, long r19, boolean r21) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = r0.f7668b
            r3 = 0
            com.google.android.gms.internal.ads.n90 r4 = r0.f7672f
            if (r1 == 0) goto L3f
            java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L42
            java.lang.String r5 = com.google.android.gms.internal.ads.lx0.f7666h
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L17
            goto L42
        L17:
            java.lang.Object r5 = r4.f8249d
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r5 = r5.getString(r2, r3)
            java.lang.Object r6 = r4.f8249d
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r7 = "paid_3p_hash_key"
            java.lang.String r6 = r6.getString(r7, r3)
            if (r5 == 0) goto L3f
            if (r6 == 0) goto L3f
            r7 = r18
            java.lang.String r6 = r0.e(r1, r7, r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L3a
            goto L48
        L3a:
            com.google.android.gms.internal.ads.jx0 r1 = r16.b(r17, r18)
            return r1
        L3f:
            r7 = r18
            goto L48
        L42:
            com.google.android.gms.internal.ads.jx0 r1 = new com.google.android.gms.internal.ads.jx0
            r1.<init>()
            return r1
        L48:
            if (r1 == 0) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = 0
        L4d:
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto Lb2
            java.lang.String r6 = r0.f7669c
            java.lang.String r10 = r0.f7670d
            if (r5 == 0) goto L5f
            r11 = r10
            goto L60
        L5f:
            r11 = r6
        L60:
            java.lang.Object r12 = r4.f8249d
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            r13 = -1
            long r11 = r12.getLong(r11, r13)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L6f
            goto L8b
        L6f:
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 >= 0) goto L80
            if (r5 == 0) goto L77
            r11 = r10
            goto L78
        L77:
            r11 = r6
        L78:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r4.m(r8, r11)
            goto L8b
        L80:
            long r11 = r11 + r19
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 < 0) goto L8b
            com.google.android.gms.internal.ads.jx0 r1 = r16.b(r17, r18)
            return r1
        L8b:
            if (r5 == 0) goto L8e
            goto L90
        L8e:
            java.lang.String r2 = r0.f7667a
        L90:
            java.lang.Object r8 = r4.f8249d
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r2 = r8.getString(r2, r3)
            if (r2 != 0) goto La1
            if (r21 != 0) goto La1
            com.google.android.gms.internal.ads.jx0 r1 = r16.b(r17, r18)
            return r1
        La1:
            com.google.android.gms.internal.ads.jx0 r1 = new com.google.android.gms.internal.ads.jx0
            if (r5 == 0) goto La6
            r6 = r10
        La6:
            java.lang.Object r3 = r4.f8249d
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            long r3 = r3.getLong(r6, r13)
            r1.<init>(r2, r3)
            return r1
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r0.f7671e
            java.lang.String r3 = ": Invalid negative current timestamp. Updating PAID failed"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lx0.a(java.lang.String, java.lang.String, long, boolean):com.google.android.gms.internal.ads.jx0");
    }

    public final jx0 b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f7672f.m(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z5) throws IOException {
        String str = z5 ? this.f7670d : this.f7669c;
        n90 n90Var = this.f7672f;
        n90Var.p(str);
        n90Var.p(z5 ? this.f7668b : this.f7667a);
    }

    public final jx0 d(String str, boolean z5) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f7671e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z5 ? this.f7670d : this.f7669c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        n90 n90Var = this.f7672f;
        n90Var.m(lValueOf, str2);
        n90Var.m(str, z5 ? this.f7668b : this.f7667a);
        return new jx0(str, jCurrentTimeMillis);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(t.z.g(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        StringBuilder sb2 = new StringBuilder("not null".length() + str4.length() + 120);
        l7.o.t(sb2, this.f7671e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb2.append("not null");
        throw new IllegalArgumentException(sb2.toString());
    }
}
