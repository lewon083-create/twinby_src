package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb0 implements fh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sz f10577c;

    public /* synthetic */ tb0(sz szVar, int i) {
        this.f10576b = i;
        this.f10577c = szVar;
    }

    @Override // com.google.android.gms.internal.ads.fh
    public final /* synthetic */ void I(eh ehVar) {
        switch (this.f10576b) {
            case 0:
                HashMap map = new HashMap();
                map.put("isVisible", true != ehVar.f4951j ? CommonUrlParts.Values.FALSE_INTEGER : "1");
                this.f10577c.c("onAdVisibilityChanged", map);
                break;
            case 1:
                Rect rect = ehVar.f4946d;
                this.f10577c.q0().j(rect.left, rect.top);
                break;
            default:
                Rect rect2 = ehVar.f4946d;
                this.f10577c.q0().j(rect2.left, rect2.top);
                break;
        }
    }
}
