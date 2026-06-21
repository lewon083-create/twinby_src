package com.google.android.gms.internal.ads;

import com.vk.api.sdk.exceptions.VKApiCodes;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f6415c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6413a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6414b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6416d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6417e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6418f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6419g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f6420h = -3.4028235E38f;
    public int i = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6421j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6422k = VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l3.a a() {
        /*
            r14 = this;
            float r0 = r14.f6420h
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 5
            r7 = 4
            if (r2 == 0) goto L11
            goto L1c
        L11:
            int r0 = r14.f6416d
            if (r0 == r7) goto L1b
            if (r0 == r6) goto L19
            r0 = r4
            goto L1c
        L19:
            r0 = r5
            goto L1c
        L1b:
            r0 = r3
        L1c:
            int r2 = r14.i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r2 == r8) goto L26
            goto L35
        L26:
            int r2 = r14.f6416d
            if (r2 == r11) goto L34
            if (r2 == r9) goto L32
            if (r2 == r7) goto L34
            if (r2 == r6) goto L32
            r2 = r11
            goto L35
        L32:
            r2 = r10
            goto L35
        L34:
            r2 = 0
        L35:
            l3.a r8 = new l3.a
            r8.<init>()
            int r12 = r14.f6416d
            r13 = 0
            if (r12 == r11) goto L56
            if (r12 == r10) goto L53
            if (r12 == r9) goto L50
            if (r12 == r7) goto L56
            if (r12 == r6) goto L50
            java.lang.String r6 = "WebvttCueParser"
            java.lang.String r7 = "Unknown textAlignment: "
            gf.a.p(r12, r7, r6)
            r6 = r13
            goto L58
        L50:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L58
        L53:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L58
        L56:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
        L58:
            r8.f27751c = r6
            float r6 = r14.f6417e
            int r7 = r14.f6418f
            int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r9 == 0) goto L6e
            if (r7 != 0) goto L6e
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L6c
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 <= 0) goto L6e
        L6c:
            r1 = r5
            goto L75
        L6e:
            if (r9 == 0) goto L72
            r1 = r6
            goto L75
        L72:
            if (r7 != 0) goto L75
            goto L6c
        L75:
            r8.f27753e = r1
            r8.f27754f = r7
            int r1 = r14.f6419g
            r8.f27755g = r1
            r8.f27756h = r0
            r8.i = r2
            float r1 = r14.f6421j
            if (r2 == 0) goto La0
            if (r2 == r11) goto L94
            if (r2 != r10) goto L8a
            goto La2
        L8a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        L94:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 > 0) goto L9c
            float r0 = r0 * r3
            goto La2
        L9c:
            float r5 = r5 - r0
            float r0 = r5 * r3
            goto La2
        La0:
            float r0 = r5 - r0
        La2:
            float r0 = java.lang.Math.min(r1, r0)
            r8.f27759l = r0
            int r0 = r14.f6422k
            r8.f27763p = r0
            java.lang.CharSequence r0 = r14.f6415c
            if (r0 == 0) goto Lb4
            r8.f27749a = r0
            r8.f27750b = r13
        Lb4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i8.a():l3.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.n40 b() {
        /*
            r14 = this;
            float r0 = r14.f6420h
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 5
            r6 = 4
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L11
            goto L1c
        L11:
            int r0 = r14.f6416d
            if (r0 == r6) goto L1b
            if (r0 == r5) goto L19
            r0 = r4
            goto L1c
        L19:
            r0 = r7
            goto L1c
        L1b:
            r0 = r3
        L1c:
            int r2 = r14.i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r2 == r8) goto L26
            goto L35
        L26:
            int r2 = r14.f6416d
            if (r2 == r11) goto L34
            if (r2 == r9) goto L32
            if (r2 == r6) goto L34
            if (r2 == r5) goto L32
            r2 = r11
            goto L35
        L32:
            r2 = r10
            goto L35
        L34:
            r2 = 0
        L35:
            com.google.android.gms.internal.ads.n40 r8 = new com.google.android.gms.internal.ads.n40
            r8.<init>()
            int r12 = r14.f6416d
            r13 = 0
            if (r12 == r11) goto L65
            if (r12 == r10) goto L62
            if (r12 == r9) goto L5f
            if (r12 == r6) goto L65
            if (r12 == r5) goto L5f
            java.lang.String r5 = java.lang.String.valueOf(r12)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 23
            r6.<init>(r5)
            java.lang.String r5 = "Unknown textAlignment: "
            java.lang.String r9 = "WebvttCueParser"
            a0.u.t(r6, r5, r12, r9)
            r5 = r13
            goto L67
        L5f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L67
        L62:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L67
        L65:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L67:
            r8.f8180c = r5
            float r5 = r14.f6417e
            int r6 = r14.f6418f
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 == 0) goto L7d
            if (r6 != 0) goto L7d
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L7d
        L7b:
            r1 = r7
            goto L83
        L7d:
            if (r9 != 0) goto L82
            if (r6 != 0) goto L83
            goto L7b
        L82:
            r1 = r5
        L83:
            r8.f8182e = r1
            r8.f8183f = r6
            int r1 = r14.f6419g
            r8.f8184g = r1
            r8.f8185h = r0
            r8.i = r2
            float r1 = r14.f6421j
            if (r2 == 0) goto Lac
            if (r2 == r11) goto La2
            if (r2 != r10) goto L98
            goto Lae
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r2)
            r0.<init>(r1)
            throw r0
        La2:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto La8
            float r0 = r0 + r0
            goto Lae
        La8:
            float r7 = r7 - r0
            float r0 = r7 + r7
            goto Lae
        Lac:
            float r0 = r7 - r0
        Lae:
            float r0 = java.lang.Math.min(r1, r0)
            r8.f8188l = r0
            int r0 = r14.f6422k
            r8.f8190n = r0
            java.lang.CharSequence r0 = r14.f6415c
            if (r0 == 0) goto Lc0
            r8.f8178a = r0
            r8.f8179b = r13
        Lc0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i8.b():com.google.android.gms.internal.ads.n40");
    }
}
