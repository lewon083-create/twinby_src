package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yy extends xy {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f12795g = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DecimalFormat f12796h = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f12797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12798f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051a  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r35v0, types: [com.google.android.gms.internal.ads.xy, com.google.android.gms.internal.ads.yy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // com.google.android.gms.internal.ads.xy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.String r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yy.b(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void k() {
        this.f12798f = true;
    }

    public final File o(File file) {
        return new File(new File(this.f12797e, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
