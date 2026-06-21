package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class po implements vo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ po f9134c = new po(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ po f9135d = new po(21);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ po f9136e = new po(22);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ po f9137f = new po(23);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ po f9138g = new po(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ po f9139h = new po(27);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9140b;

    public /* synthetic */ po(int i) {
        this.f9140b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(java.lang.Object r13, java.util.Map r14) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.po.a(java.lang.Object, java.util.Map):void");
    }

    public static final Integer b(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb2 = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb2.append("Precache invalid numeric parameter '");
            sb2.append(str);
            sb2.append("': ");
            sb2.append(str2);
            u9.i.h(sb2.toString());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:379|75|76|(12:367|78|79|(10:85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(2:99|(1:101)))|102|369|103|(1:108)(1:109)|360|110|391|116)(1:83)|82|(0)|102|369|103|(0)(0)|360|110|391|116|73) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x032e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x032f, code lost:
    
        p9.k.C.f31302h.d(r3.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0347, code lost:
    
        u9.i.f("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dd  */
    @Override // com.google.android.gms.internal.ads.vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(java.lang.Object r20, java.util.Map r21) {
        /*
            Method dump skipped, instruction units count: 2428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.po.o(java.lang.Object, java.util.Map):void");
    }
}
