package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tc0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d60 f10589b;

    public /* synthetic */ tc0(d60 d60Var, int i) {
        this.f10588a = i;
        this.f10589b = d60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    @Override // com.google.android.gms.internal.ads.qs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j() {
        /*
            r4 = this;
            int r0 = r4.f10588a
            switch(r0) {
                case 0: goto L94;
                case 1: goto L81;
                case 2: goto L24;
                case 3: goto L17;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.gx r0 = com.google.android.gms.internal.ads.hx.f6279a
            com.google.android.gms.internal.ads.gr.G(r0)
            com.google.android.gms.internal.ads.d60 r1 = r4.f10589b
            com.google.android.gms.internal.ads.iq0 r1 = r1.a()
            com.google.android.gms.internal.ads.tl0 r2 = new com.google.android.gms.internal.ads.tl0
            r3 = 2
            r2.<init>(r3, r0, r1)
            return r2
        L17:
            com.google.android.gms.internal.ads.d60 r0 = r4.f10589b
            com.google.android.gms.internal.ads.iq0 r0 = r0.a()
            com.google.android.gms.internal.ads.dl0 r1 = new com.google.android.gms.internal.ads.dl0
            r2 = 2
            r1.<init>(r2, r0)
            return r1
        L24:
            com.google.android.gms.internal.ads.d60 r0 = r4.f10589b
            com.google.android.gms.internal.ads.iq0 r0 = r0.a()
            q9.d3 r0 = r0.f6572d
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.internal.ads.al.f2924a8
            q9.s r2 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r2 = r2.f31970c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6d
            java.lang.String r1 = r0.f31823y
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L58
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L58
            r2.<init>(r1)     // Catch: org.json.JSONException -> L58
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L58
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L58
            if (r2 != 0) goto L58
            goto L7d
        L58:
            q9.o0 r0 = r0.f31818t
            if (r0 == 0) goto L6d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6d
            java.lang.String r0 = r0.f31952b     // Catch: org.json.JSONException -> L6d
            r1.<init>(r0)     // Catch: org.json.JSONException -> L6d
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L6d
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L6d
            if (r0 == 0) goto L7d
        L6d:
            q9.r r0 = q9.r.f31959g
            java.util.Random r0 = r0.f31964e
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L7d:
            com.google.android.gms.internal.ads.gr.G(r1)
            return r1
        L81:
            com.google.android.gms.internal.ads.d60 r0 = r4.f10589b
            com.google.android.gms.internal.ads.iq0 r0 = r0.a()
            l7.n r0 = r0.f6583p
            int r0 = r0.f28052c
            r1 = 3
            if (r0 != r1) goto L91
            java.lang.String r0 = "rewarded_interstitial"
            goto L93
        L91:
            java.lang.String r0 = "rewarded"
        L93:
            return r0
        L94:
            com.google.android.gms.internal.ads.d60 r0 = r4.f10589b
            com.google.android.gms.internal.ads.iq0 r0 = r0.a()
            l7.n r0 = r0.f6583p
            int r0 = r0.f28052c
            r1 = 3
            if (r0 != r1) goto La4
            com.google.android.gms.internal.ads.ti r0 = com.google.android.gms.internal.ads.ti.REWARDED_INTERSTITIAL
            goto La6
        La4:
            com.google.android.gms.internal.ads.ti r0 = com.google.android.gms.internal.ads.ti.REWARD_BASED_VIDEO_AD
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tc0.j():java.lang.Object");
    }
}
