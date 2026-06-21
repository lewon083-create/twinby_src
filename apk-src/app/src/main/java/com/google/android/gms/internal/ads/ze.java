package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ze implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12974c;

    public /* synthetic */ ze(int i, Object obj) {
        this.f12973b = i;
        this.f12974c = obj;
    }

    private final Object a() {
        HashMap map;
        de0 de0Var = (de0) ((tl0) this.f12974c).f10658c;
        synchronized (de0Var) {
            map = new HashMap();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.G8)).booleanValue()) {
                de0Var.b();
                for (Map.Entry entry : de0Var.f4558a.entrySet()) {
                    map.put((ce0) entry.getKey(), new ArrayDeque((Collection) entry.getValue()));
                }
            }
        }
        return new zm0(map, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: IOException -> 0x0036, TryCatch #2 {IOException -> 0x0036, blocks: (B:3:0x0005, B:5:0x001e, B:7:0x0030, B:12:0x003b, B:17:0x0061, B:18:0x0086, B:26:0x0093, B:28:0x00a5, B:30:0x00bb, B:32:0x00c4, B:37:0x00e6, B:39:0x0104, B:40:0x0127, B:48:0x013c, B:49:0x0141, B:57:0x015a, B:55:0x0156, B:46:0x013a, B:35:0x00d6, B:25:0x0092, B:15:0x004f, B:20:0x0089, B:21:0x008d, B:50:0x0142, B:51:0x0150, B:41:0x0128, B:42:0x0136), top: B:65:0x0005, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6 A[Catch: IOException -> 0x0036, TryCatch #2 {IOException -> 0x0036, blocks: (B:3:0x0005, B:5:0x001e, B:7:0x0030, B:12:0x003b, B:17:0x0061, B:18:0x0086, B:26:0x0093, B:28:0x00a5, B:30:0x00bb, B:32:0x00c4, B:37:0x00e6, B:39:0x0104, B:40:0x0127, B:48:0x013c, B:49:0x0141, B:57:0x015a, B:55:0x0156, B:46:0x013a, B:35:0x00d6, B:25:0x0092, B:15:0x004f, B:20:0x0089, B:21:0x008d, B:50:0x0142, B:51:0x0150, B:41:0x0128, B:42:0x0136), top: B:65:0x0005, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ze.b():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c() {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ze.c():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x0542 -> B:253:0x054e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 2234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ze.call():java.lang.Object");
    }
}
