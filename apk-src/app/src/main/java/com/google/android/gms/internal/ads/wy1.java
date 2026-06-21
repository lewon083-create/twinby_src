package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f11925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ql1 f11926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l91 f11927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final az1 f11928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cb0 f11929e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f11931g;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public db1 f11933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w2 f11934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ az1 f11936m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e2 f11930f = new e2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11932h = true;

    public wy1(az1 az1Var, Uri uri, g91 g91Var, l91 l91Var, az1 az1Var2, cb0 cb0Var) {
        this.f11936m = az1Var;
        this.f11925a = uri;
        this.f11926b = new ql1(g91Var);
        this.f11927c = l91Var;
        this.f11928d = az1Var2;
        this.f11929e = cb0Var;
        zx1.f13148a.getAndIncrement();
        this.f11933j = b(0L, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x023f, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0244, code lost:
    
        if (r6 != 1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0246, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024e, code lost:
    
        if (r9.n() == (-1)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0250, code lost:
    
        r28.f11930f.f4793b = r9.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0258, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0259, code lost:
    
        r2.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x023f A[EDGE_INSN: B:189:0x023f->B:131:0x023f BREAK  A[LOOP:1: B:87:0x01e6->B:118:0x022b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[Catch: all -> 0x00c3, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[Catch: all -> 0x00c3, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b A[Catch: all -> 0x00c3, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121 A[Catch: all -> 0x00c3, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c A[Catch: all -> 0x00c3, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190 A[Catch: all -> 0x00c3, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d7 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #4 {all -> 0x00c3, blocks: (B:29:0x0091, B:30:0x0097, B:40:0x00d5, B:42:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x0101, B:50:0x010b, B:52:0x0117, B:54:0x0121, B:56:0x0133, B:58:0x013d, B:59:0x0143, B:67:0x017c, B:69:0x0186, B:71:0x0190, B:73:0x0195, B:75:0x01ae, B:77:0x01c3, B:80:0x01ca, B:82:0x01ce, B:83:0x01d3, B:85:0x01d7, B:62:0x014d, B:65:0x016d, B:34:0x00a3, B:39:0x00c7), top: B:162:0x0091 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wy1.a():void");
    }

    public final db1 b(long j10, String str) {
        Map mapS = az1.P;
        if (str != null && !str.startsWith("W/")) {
            ya yaVar = new ya(4);
            yaVar.n(mapS.entrySet());
            yaVar.g("If-Range", str);
            mapS = yaVar.s(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f11925a;
        ix.m0(uri, "The uri must be set.");
        return new db1(uri, mapS, j10, -1L, 6);
    }
}
